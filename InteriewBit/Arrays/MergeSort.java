import java.util.*;
public class MergeSort{
	public static void main ( String args[]){
	 int []arr={8,7,6,5,4,3,2,1,0};

	 int start=0;
	 int end=arr.length-1;
     mergeArray(arr,0,end);
      System.out.println(Arrays.toString(arr));

	}
	private static void mergeArray(int[]arr, int start, int end){
		
		if(start<end){
		int mid=(end+start)/2;
	 	mergeArray(arr,start,mid);
	 	mergeArray(arr,mid+1,end);
	 	merge(arr,start,mid,end);
	 	
	 }
	
	}
	//merge
	private static void merge(int[]arr,int start, int mid,int end){

		//deaclare auxilary array
		int[]aux=new int[end-start+1];
		int i=start;
		int j=mid+1;
		int k=0;

		//check in both
		while(i<=mid && j<=end){

			if(arr[i]<arr[j]){
				aux[k]=arr[i];
				k++;
				i++;
			}
			else{
				aux[k]=arr[j];
				k++;
				j++;
			}
		}

		//check the remaining in array 1
		while(i<=mid){
			aux[k]=arr[i];
			i++;
			k++;
		}

//check the remaining in array 2
		while(j<=end){
			aux[k]=arr[j];
			j++;
			k++;
		}

//copying aux to array;
		for( i=start;i<=end;i++){
			arr[i]=aux[i-start];
			 System.out.println("i == "+ i );
			 System.out.println("start == "+ start );
		}

	}
}


//		;
