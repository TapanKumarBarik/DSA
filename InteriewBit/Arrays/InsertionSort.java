import java.util.*;
public class InsertionSort{
	public static void main ( String args[]){
		int []arr={8,6,5,9,3,11};
		int currentIndex=1;
		int n=arr.length;

		while(currentIndex<n){
			int currentValue=arr[currentIndex];
            if(currentValue<arr[currentIndex-1]){

            	int i=currentIndex-1;

            	while( i>-1 &&  currentValue<arr[i]){
            		arr[i+1]=arr[i];
            		i--;
            	}

            	arr[i+1]=currentValue;
            }

			currentIndex++;
			System.out.println(Arrays.toString(arr));

		}
	}
}


//		System.out.println(Arrays.toString(arr));
