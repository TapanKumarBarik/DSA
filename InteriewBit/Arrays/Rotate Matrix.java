You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

You need to do this in place.

Note that if you end up using an additional array, you will only receive partial score.

Example:

If the array is

[
    [1, 2],
    [3, 4]
]
Then the rotated array becomes:

[
    [3, 1],
    [4, 2]
]






public class Solution {
	public void rotate(ArrayList<ArrayList<Integer>> a) {
        for(int i=0;i<a.size();i++){
            for(int j=i+1;j<a.size();j++){
              //swap
              int temp=a.get(i).get(j);
              a.get(i).set(j,a.get(j).get(i));
           a.get(j).set(i,temp);
            }
        }
            for(int i=0;i<a.size();i++){
           int start=0;
           int end=a.size()-1;
           while(start<end){
            int temp=a.get(i).get(start);
              a.get(i).set(start,a.get(i).get(end));
           a.get(i).set(end,temp);
           start++;
           end--;
           }
        }
	}
}

