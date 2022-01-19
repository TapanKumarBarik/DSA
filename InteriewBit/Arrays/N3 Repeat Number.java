Problem Description

You're given a read only array of n integers. Find out if any integer occurs more than n/3 times in the array in linear time and constant additional space.
If so, return the integer. If not, return -1.

If there are multiple solutions, return any one.

Example:

Input: [1 2 3 1 1]
Output: 1 
1 occurs 3 times which is more than 5/3 times.



  public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) {

if(a.size()==1)return a.get(0);
        //vote algo

        int v1=Integer.MAX_VALUE;
        int v2=Integer.MAX_VALUE;
        int c1=0;
        int c2=0;

       for(int i=0;i<a.size();i++){
	        //condition 1
	        int x=a.get(i);
	        if(x==v1 || x==v2){
	            
	            if(x==v1){
	                c1++;
	            }
	              else {
	                c2++;
	            }
	        }
	        //condition 2 ;
	        
	        else if(c1==0 || c2==0){
	            
	            if(c1==0){
	                c1++;
	                v1=x;
	            }
	            else{
	                c2++;
	                v2=x;
	            }
	        }
	        //condition 3
	        else{
	            c1--;
	            c2--;
	        }
	        
	    }
	    int limit=a.size()/3;
	    int count=0;
	    for(int i=0;i<a.size();i++){
	        
	      
	        if(v1==a.get(i)){
	            count++;
	        }
	          if(count>limit){
	            return v1;
	        }
	    }
	    count=0;
	        for(int i=0;i<a.size();i++){
	        
	      
	        if(v2==a.get(i)){
	            count++;
	        }
	          if(count>limit){
	            return v2;
	        }
	    }


       

return -1;

	}
}
