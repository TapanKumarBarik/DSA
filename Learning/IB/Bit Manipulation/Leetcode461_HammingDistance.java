class Solution {
    public int hammingDistance(int x, int y) {
        
        
        int count=0;
       while(x>0||y>0){
           
           count+=(x%2)^(y%2);
           
           x=x>>1;
           y=y>>1;
       
        }
        return count;
    }
}
