Problem Statement
Given an array with N elements, the task is to rotate the array to the left by K steps, where K is non-negative.
Input Format:
The first line contains an integer N representing the size of the array.

The second line contains N space-separated integers representing the elements of the array.

The last line contains an integer K representing the number of times the array has to be rotated in the left direction. 
Output Format:
The only line of the output prints N space-separated integers representing the Rotated array elements.
Constraints:
1 <= N <= 10^3
1 <= arr[i] <= 10^9
1 <= K < N
Sample Input:
8
7 5 2 11 2 43 1 1
2
Sample Output:
2 11 2 43 1 1 7 5
Explanation Of Sample Input:
Rotate 1 steps to the left: 5 2 11 2 43 1 1 7
Rotate 2 steps to the left: 2 11 2 43 1 1 7 5










function rotate(arr , k){

      /* Write your code here
    No need to specify return type 
    Input and output already taken care of */

    // You don't need to return anything , just rotate the array in-place
  let n=arr.length;
    reverse(arr,0,n-1);
    reverse(arr,0, n-k-1);
    reverse(arr,n-k,n-1)
  }

function reverse(arr, left, right){
    
    while(left<right){
       // swap(arr, left, right);
        
        let temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
    }
}
  








































  process.stdin.resume();
  process.stdin.setEncoding('ascii');
  
  var input_stdin = "";
  var input_stdin_array = "";
  var input_currentline = 0;
  
  process.stdin.on('data', function (data) {
  input_stdin += data;
  });
  
  process.stdin.on('end', function () {
  input_stdin_array = input_stdin.split("\n");
  main();    
  });
  
  function readLine() {
  return input_stdin_array[input_currentline++];
  }
  
  
  function main() {
  
      let n = parseInt(readLine());
      const arr = readLine().replace(/\s+$/g, '').split(' ');
      
      let array = [];
      
      for(let i = 0 ; i<n ; i++){
          array.push((Number)(arr[i]));
      }
      
      let k = parseInt(readLine());
      let res = rotate(array , k);
      console.log(...array);
  
  }
