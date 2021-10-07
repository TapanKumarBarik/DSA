import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int[] A = new int[N];
            for(int i = 0;i < N; i++){
                A[i] = sc.nextInt();
            }
            
            int cnte = 0;
            int cnto = 0;
            
            for (int i = 0; i < N;i++){
                
                if(A[i] % 2 == 1){
                    cnto++;
                }
                else{
                    cnte++;
                }
            }
            
            System.out.println(Math.abs(cnte - cnto));
        }
    }
}
