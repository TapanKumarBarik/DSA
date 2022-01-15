
import java.util.*;
public class BubbleSort{
	public static void main ( String args[]){
		int []arr={5,4,3,2,1};
		boolean isSorted=false;

		for(int i=0;i<arr.length;i++){
			if(isSorted==false){
				isSorted=true;
				for(int j=0;j<arr.length-1-i;j++){
					if(arr[j]>arr[j+1]){
					 swap(arr,j,j+1);
					 isSorted=false;
					}
				}
			System.out.println(Arrays.toString(arr));
			}
 
		}
	}
	private static void swap(int[]arr, int i, int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
