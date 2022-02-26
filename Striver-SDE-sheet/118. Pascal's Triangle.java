//https://leetcode.com/problems/pascals-triangle/




class Solution {
    public List<List<Integer>> generate(int numRows) {
        

        List<List<Integer>> list=new ArrayList();
        
         if (numRows <=0){
            return list;
        }
        
        for(int i=0;i<numRows;i++){
            
            List<Integer>arr=new ArrayList();
            
            for(int j=0;j<i+1;j++ ){
                
                if(j==0 || i==0 ||  i==j){
                    arr.add(1);
                }
                else{
                    arr.add( list.get(i-1).get(j-1)+list.get(i-1).get(j)  );
                }
                
            }
            list.add(arr);
        }
        return list;
    }
}
