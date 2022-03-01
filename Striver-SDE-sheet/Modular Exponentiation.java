//https://www.codingninjas.com/codestudio/problems/1082146?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=0



public class Solution {
    public static int modularExponentiation(int x, int n, int m) {
        // Write your code here.    
    if(n==0)return 1;
        long res=modularExponentiation(x, n/2,m);
        if(n%2==0){
              return (int) ((res * res) % m);
        }else{
            return (int) (((res * res) % m * x % m) % m);
        }
    }

}
