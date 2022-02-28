//https://leetcode.com/problems/merge-intervals/



class Solution {
    public int[][] merge(int[][] intervals) {
        
        
        // [[1,3],[2,6],[8,10],[15,18]]
        if(intervals.length<=1){
            return intervals;
        }
        
        List<int[]>arr=new ArrayList();
        
        
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
       // Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
        
        
        int[]curr_inerval=intervals[0];
        
        arr.add(curr_inerval);//{1,3}
        
        for(int i=1;i<intervals.length;i++){
            
            
            if(curr_inerval[1]>=intervals[i][0]){
                curr_inerval[1]=Math.max(curr_inerval[1],intervals[i][1]);
            }
            
            else{
                curr_inerval=intervals[i];
                arr.add(curr_inerval);
            }
            
        }
        
        return arr.toArray(new int[arr.size()][]);
        
        
        
        
        
    }
}
