Problem Description

Given an integer array A of size N. You need to count the number of special elements in the given array.

A element is special if removal of that element make the array balanced.

Array will be balanced if sum of even index element equal to sum of odd index element.



Problem Constraints
1 <= N <= 105

1 <= A[i] <= 109



Input Format
First and only argument is an integer array A of size N.



Output Format
Return an integer denoting the count of special elements.



Example Input
Input 1:

 A = [2, 1, 6, 4]
Input 2:

 A = [5, 5, 2, 5, 8]


Example Output
Output 1:

 1
Output 2:

 2


Example Explanation
Explanation 1:

 After deleting 1 from array : {2,6,4}
    (2+4) = (6)
 Hence 1 is the only special element, so count is 1
Explanation 2:

 If we delete A[0] or A[1] , array will be balanced
    (5+5) = (2+8)
 So A[0] and A[1] are special elements, so count is 2.
   
   
   
   
   
   
   public class Solution {
    public int solve(int[] A) {

        int res=0;

        int evenSum=0;
        int oddSum=0;

        for(int i=0;i<A.length;i++){
            //even
            if(i%2==0){
                evenSum+=A[i];
            }
            //odd
           else {
               oddSum+=A[i];
            }

        } 

        //Now we have even and odd sum;
        //if i remove an even index --> odd index will be even and even index will be odd;

        int kEvenSum=0;
        int kOddSum=0;

        for(int i=0;i<A.length;i++){

            if(i%2==0){
                    if((evenSum - (A[i]+kEvenSum) + kOddSum) == ((oddSum-kOddSum) + kEvenSum)){
                    res++;
                }

                kEvenSum+=A[i];
            }
            else{
                    if((oddSum - (A[i]+kOddSum) + kEvenSum) == (kOddSum + (evenSum-kEvenSum))){
                    res++;
                }
                kOddSum+=A[i];
            }

        }

        return res;
        
    }
}








import java.util.Arrays;

public class BalanceArray {

    public static void main(String[] args) {

        // Scanner scn = new Scanner(System.in);

        // System.out.println("Enter the size of the array ...");
        // int n = scn.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        // System.out.println("Enter " + i);
        // arr[i] = scn.nextInt();
        // }
        // System.out.println(Arrays.toString(arr));

        //
        int[] arr = { 2, 1, 6, 4 };

        int evenSum = 0;
        int oddSum = 0;
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }

        //
        int kEvenSum = 0;
        int kOddSum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("------------------------------------");

            if (i % 2 == 0) {

                if (evenSum - (arr[i] + kEvenSum) + kOddSum == (oddSum - kOddSum) + kEvenSum) {

                    res++;
                }
                System.out.println("oddSum == " + oddSum);
                System.out.println("evenSum == " + evenSum);
                System.out.println("kOddSum == " + kOddSum);
                System.out.println("kEvenSum == " + kEvenSum);
                System.out.println("res == " + res);

                kEvenSum += arr[i];
            } else {
                if (oddSum - (arr[i] + kOddSum) + kEvenSum == (evenSum - kEvenSum) + kOddSum) {
                    res++;
                }
                System.out.println("oddSum == " + oddSum);
                System.out.println("evenSum == " + evenSum);
                System.out.println("kOddSum == " + kOddSum);
                System.out.println("kEvenSum == " + kEvenSum);
                System.out.println("res == " + res);
                kOddSum += arr[i];
            }

        }
        System.out.println("The final result is ------....");
        System.out.println(res);

    }
}
