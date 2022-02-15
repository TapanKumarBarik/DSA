//https://leetcode.com/problems/subsets/




class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        
     List<List<Integer>>list=new ArrayList();
        
        generateSubSet(list, arr, 0,new ArrayList());
        
        return list;
    }
    
     public void generateSubSet(List<List<Integer>> list, int[]arr, int index,List<Integer> ls){
         
         
         
         if(index==arr.length){
             list.add(new ArrayList(ls));
             return;
         }
         
         //call again
           generateSubSet(list, arr, index+1,ls);
         
         ls.add(arr[index]);
         
         generateSubSet(list, arr, index+1,ls);
         
         ls.remove(ls.size()-1);
         
     }
}
