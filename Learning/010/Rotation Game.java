Problem Description

You are given an integer array A and an integer B. You have to print the same array after rotating it B times towards right.

NOTE: You can use extra memory.



Problem Constraints
1 <= |A| <= 106

1 <= A[i] <= 109

1 <= B <= 109



Input Format
First line begins with an integer |A| denoting the length of array, and then |A| integers denote the array elements.
Second line contains a single integer B



Output Format
Print an array of integers which is the Bth right rotation of input array A, on a separate line.



Example Input
Input 1:

 4 1 2 3 4
 2
Input 2:

 3 1 2 2
 3


Example Output
Output 1:

 3 4 1 2
Output 2:

 1 2 2


Example Explanation
Explanation 1:

 [1,2,3,4] => [4,1,2,3] => [3,4,1,2]

Explanation 2:


 [1,2,2] => [2,1,2] => [2,2,1] => [1,2,2]
 
   
   
   ///////////////////
   
   
   import java.lang.*;
import java.util.*;

public class Main {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt() % n;
        reverse(A, 0, n - 1);
        reverse(A, 0, B - 1);
        reverse(A, B, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("");

    }
        public static void reverse(int[] A, int start, int end) {
        int i, j;
        for (i = start, j = end; i < j; i++, j--) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
    }
}
