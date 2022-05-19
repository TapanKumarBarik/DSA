import java.util.* ;
import java.io.*; 
public class Solution{
    public static int[][] pairSum(int[] arr, int s) {
        // Write your code here.
		
		Arrays.sort(arr);
		
		ArrayList<ArrayList<Integer>>list=new ArrayList();
		int n=arr.length;
		for(int i=0;i<n;i++){
			
			for(int j=i+1;j<n;j++){
				
				if(arr[i]+arr[j]==s){
					
					ArrayList<Integer>temp=new ArrayList();
					temp.add(arr[i]);
					temp.add(arr[j]);
					list.add(temp);
				}
			}
		}
		
		int [][]res=new int[list.size()][2];
		
		for(int i=0;i<res.length;i++){
			res[i][0]=list.get(i).get(0);
			res[i][1]=list.get(i).get(1);
		}
		return res;
    }
}
