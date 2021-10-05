class Solution {
    public int maxArea(int[] height) {
        
        int a_pointer=0;
        int b_pointer=height.length-1;
        
        int max_area=0;
        
        while(a_pointer<b_pointer){
            
            if(height[a_pointer]<height[b_pointer]){
                
                max_area=Math.max(max_area,(b_pointer-a_pointer)*height[a_pointer]);
                a_pointer++;
            }
            else{
                
                max_area=Math.max(max_area,(b_pointer-a_pointer)*height[b_pointer]);
                b_pointer--;
            }
            
        }
        return max_area;
        
    }
}
