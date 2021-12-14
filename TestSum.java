//////////////////////////////////////////////////////////////////////////////

"use strict";

const Excel = require("exceljs");
const { Connection, Request } = require("tedious");
const {
  BlobServiceClient,
  Aborter,
  BlobURL,
  BlockBlobURL,
  ContainerURL,
  ServiceURL,
  SharedKeyCredential,
  StorageURL,
  uploadStreamToBlockBlob,
} = require("@azure/storage-blob");
var multipart = require("parse-multipart");
var fs = require("fs");
var path = require("path");
module.exports = async function (context, req) {
  let data = [];
  // Create connection to database
  const config = {
    authentication: {
      options: {
        userName: "", // update me
        password: "", // update me
      },
      type: "default",
    },
    server: ".database.windows.net", // update me
    options: {
      database: "", //update me
      encrypt: true,
    },
  };

  const connection = new Connection(config);

  // Attempt to connect and execute queries if connection goes through
  connection.on("connect", (err) => {
    if (err) {
      console.error(err.message);
    } else {
      queryDatabase();
    }
  });

  connection.connect();

  async function queryDatabase() {
    // Read all rows from table
    const request = new Request(`SELECT * FROM TestTable`, (err, rowCount) => {
      if (err) {
        console.error(err.message);
      } else {
      }
    });

    request.on("row", (columns) => {
      let obj = {};
      let count = 1;
      columns.forEach((column) => {
        if (count == 1) {
          obj["ID"] = column.value;
        } else if (count == 2) {
          obj["firstName"] = column.value;
        } else if (count == 3) {
          obj["lastName"] = column.value;
        } else if (count == 4) {
          obj["purchasePrice"] = column.value;
        }

        if (count == 5) {
          obj["paymentsMade"] = column.value;
          data.push(obj);
          obj = {};
          count = 0;
        }
        count++;
      });
    });
    request.on("requestCompleted", function (rowCount, more) {
      connection.close();
      MakeExcel();
    });
    connection.execSql(request);
  }

  //////////////////////////////////////////////////////////////////

  function MakeExcel(params) {
    /////////////////////////////////////

    // need to create a workbook object. Almost everything in ExcelJS is based off of the workbook object.
    let workbook = new Excel.Workbook();
    let worksheet = workbook.addWorksheet("Test");
    worksheet.columns = [
      { header: "First Name", key: "firstName" },
      { header: "Last Name", key: "lastName" },
      { header: "Purchase Price", key: "purchasePrice" },
      { header: "Payments Made", key: "paymentsMade" },
      { header: "Amount Remaining", key: "amountRemaining" },
      { header: "% Remaining", key: "percentRemaining" },
    ];
    // force the columns to be at least as long as their header row.
    // Have to take this approach because ExcelJS doesn't have an autofit property.
    worksheet.columns.forEach((column) => {
      column.width = column.header.length < 12 ? 12 : column.header.length;
    });

    // Make the header bold.
    // Note: in Excel the rows are 1 based, meaning the first row is 1 instead of 0.
    worksheet.getRow(1).font = { bold: true };
    // Dump all the data into Excel
    data.forEach((e, index) => {
      // row 1 is the header.
      const rowIndex = index + 2;

      // By using destructuring we can easily dump all of the data into the row without doing much
      // We can add formulas pretty easily by providing the formula property.
      worksheet.addRow({
        ...e,
        amountRemaining: {
          formula: `=C${rowIndex}-D${rowIndex}`,
        },
        percentRemaining: {
          formula: `=E${rowIndex}/C${rowIndex}`,
        },
      });
    });

    // Set the way columns C - F are formatted
    const figureColumns = [3, 4, 5, 6];
    figureColumns.forEach((i) => {
      worksheet.getColumn(i).numFmt = "$0.00";
      worksheet.getColumn(i).alignment = { horizontal: "center" };
    });

    // Column F needs to be formatted as a percentage.
    worksheet.getColumn(6).numFmt = "0.00%";
    // loop through all of the rows and set the outline style.
    worksheet.eachRow({ includeEmpty: false }, function (row, rowNumber) {
      worksheet.getCell(`A${rowNumber}`).border = {
        top: { style: "thin" },
        left: { style: "thin" },
        bottom: { style: "thin" },
        right: { style: "none" },
      };

      const insideColumns = ["B", "C", "D", "E"];
      insideColumns.forEach((v) => {
        worksheet.getCell(`${v}${rowNumber}`).border = {
          top: { style: "thin" },
          bottom: { style: "thin" },
          left: { style: "none" },
          right: { style: "none" },
        };
      });

      worksheet.getCell(`F${rowNumber}`).border = {
        top: { style: "thin" },
        left: { style: "none" },
        bottom: { style: "thin" },
        right: { style: "thin" },
      };
    });
    // Keep in mind that reading and writing is promise based.
    workbook.xlsx.writeFile("Test.xlsx");
  }

  async function uploadFileToBlob() {
    ///////////////////////
    //application/vnd.openxmlformats-officedocument.spreadsheetml.sheet

    // Create the BlobServiceClient object which will be used to create a container client
    const blobServiceClient = BlobServiceClient.fromConnectionString("");

    // Create a unique name for the container
    const containerName = "testblobfolder";
    // Get a reference to a container
    const containerClient = blobServiceClient.getContainerClient(containerName);

    const file = "Test.xlsx";
    const blobName = "testP.xlsx";
    const contentType = file.type;

    const blockBlobClient = containerClient.getBlockBlobClient(blobName);
    const uploadBlobResponse = await blockBlobClient.uploadFile(file);
  }

  uploadFileToBlob();
  context.res = {
    // status: 200, /* Defaults to 200 */
    body: "Ok",
  };
};



/////////////////////////////////////////////////////////////////////



{
  "name": "azurefunction",
  "version": "1.0.0",
  "description": "",
  "scripts": {
    "start": "func start",
    "test": "echo \"No tests yet...\""
  },
  "dependencies": {
    "@azure/storage-blob": "^12.8.0",
    "exceljs": "^4.3.0",
    "parse-multipart": "^1.0.4",
    "tedious": "^14.0.0"
  },
  "devDependencies": {}
}
