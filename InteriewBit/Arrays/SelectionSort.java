import java.util.*;
public class SelectionSort{
	public static void main ( String args[]){
	int[]arr={17,2,1,9,8,7,13};

	//sort the array using Selection sort

	for(int i=0;i<arr.length-1;i++){
		System.out.println(Arrays.toString(arr));
		int min_index=i;
		
		for(int j=i+1;j<arr.length;j++){
	      	if(arr[j]<arr[min_index]){
	      		min_index=j;
	      	}
		}
		swap(arr,i,min_index);

	}
	System.out.println(Arrays.toString(arr));

	}
	private static void swap(int[]arr, int i, int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
