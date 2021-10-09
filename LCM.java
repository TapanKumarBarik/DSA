public class Solution {
    public int LCM(int A, int B) {
        int lcm=Math.max(A,B);
        while(true){
            if(lcm%A==0 && lcm%B==0){
                break;
            }
            lcm++;
        }
        return lcm;
    }
}
