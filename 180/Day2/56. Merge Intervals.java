Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

 

Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 

Constraints:

1 <= intervals.length <= 104
intervals[i].length == 2
0 <= starti <= endi <= 104
  
  
  
  class Solution {
    public int[][] merge(int[][] intervals) {

        List<int[]>arr=new ArrayList();
        
        if(intervals.length==0 || intervals.length==1){
            return intervals;
        }
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        arr.add(intervals[0]);
        
        int[] current_interval=intervals[0];
        
        for(int i=0;i<intervals.length;i++){
        
            int current_interval_0=current_interval[0];
            int current_interval_1=current_interval[1];
            int next_interval_0=intervals[i][0];
            int next_interval_1=intervals[i][1];
            
            if(current_interval_1>=next_interval_0){
               current_interval[1]=Math.max(current_interval_1,next_interval_1); 
            }
            else{
               current_interval= intervals[i];
                arr.add(intervals[i]);
            }
        }
        
        return arr.toArray(new int[arr.size()][]);
        
    }
}
