Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).

You may assume that the intervals were initially sorted according to their start times.

Example 1:

Given intervals [1,3],[6,9] insert and merge [2,5] would result in [1,5],[6,9].

Example 2:

Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] would result in [1,2],[3,10],[12,16].

This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].

Make sure the returned intervals are also sorted.


  
  
  
  
  /**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
   Interval current = newInterval;
        int i = 0;
        while(i < intervals.size()){
            Interval in = intervals.get(i);
            if(in.end < current.start){
                i++;
            }else if(in.start > current.end){
                intervals.add(i, current);
                break;
            }else{
                current.start = Math.min(in.start, current.start);
                current.end = Math.max(in.end, current.end);
                intervals.remove(i);
            }
        }
        if(i == intervals.size()){
            intervals.add(current);
        }
        return intervals;

    }
}

