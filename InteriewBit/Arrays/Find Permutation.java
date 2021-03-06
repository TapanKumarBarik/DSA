Given a positive integer n and a string s consisting only of letters D or I, you have to find any permutation of first n positive integer that satisfy the given input string.

D means the next number is smaller, while I means the next number is greater.

Notes

Length of given string s will always equal to n - 1
Your solution should run in linear time and space.
Example :

Input 1:

n = 3

s = ID

Return: [1, 3, 2]







public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> findPerm(final String A, int B) {
        ArrayList<Integer>arr=new ArrayList<Integer>();

        int start=1;
        int end=0;
        for(int i=0;i<A.length();i++){
            end++;
            if(A.charAt(i)=='I'){
                for(int j=end;j>=start;j--){
                    arr.add(j);
                }
                start=end+1;
            }
        }
        end++;
         for(int j=end;j>=start;j--){
            arr.add(j);
         }
         return arr;
    }
}

