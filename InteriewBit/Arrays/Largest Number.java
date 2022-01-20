Given a list of non negative integers, arrange them such that they form the largest number.

For example:

Given [3, 30, 34, 5, 9], the largest formed number is 9534330.

Note: The result may be very large, so you need to return a string instead of an integer.

  
  
  
  
  
  public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public String largestNumber(final int[] A) {

 ArrayList<Integer>arr=new ArrayList<Integer>();
       
         for(int i=0;i<A.length;i++){
            arr.add(A[i]);
        }
        arr.sort((a,b)->(""+b+a).compareTo(""+a+b));
       // arr.sort((a,b)->(""+b+a).compareTo(""+a+b));
        if(arr.get(0)==0){
            return "0";
        }
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<arr.size();i++){
          sb.append(arr.get(i));
        }
        
        return sb.toString();

 
    }
}
