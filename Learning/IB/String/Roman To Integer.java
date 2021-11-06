Given a string A representing a roman numeral.

Convert A into integer.

A is guaranteed to be within the range from 1 to 3999.

NOTE: Read more 

details about roman numerals at Roman Numeric System




Input Format

The only argument given is string A.
Output Format

Return an integer which is the integer verison of roman numeral string.
For Example

Input 1:
    A = "XIV"
Output 1:
    14

Input 2:
    A = "XX"
Output 2:
    20
    
    
    
    
    
    public class Solution {
    public int romanToInt(String A) {

        int [] num = new int[A.length()];
        for(int i=0;i<A.length();i++){

           char t=A.charAt(i);

           switch (t){


                case 'M':
                    num[i]=1000;
                    break;
                case 'D':
                    num[i]=500;
                    break;
                case 'C':
                    num[i]=100;
                    break;
                case 'L':
                    num[i]=50;
                    break;
                case 'X':
                    num[i]=10;
                    break;
                case 'V':
                    num[i]=5;
                    break;
                case 'I':
                    num[i]=1;
                    break;

           }

        }

        int res=0;
        for(int i=0;i<num.length-1;i++){

            if(num[i]<num[i+1]){
             res=res-num[i];
            }
            else{
                res=res+num[i];
            }
        }

        res=res+num[num.length-1];
        return res;

    }
}
