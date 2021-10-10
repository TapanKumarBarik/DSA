
///

import java.util.Date;

public class HelloWorld {
    public static void main(String[] args) {
     
     //binary search squareroot
     
     int num=49;
     
     int start=1;
     int end=num;
     
     while(start<=num){
       int mid=start+(end-start)/2;
       if(mid*mid==num){
         System.out.println(mid);
         break;
       }
       if(mid*mid<num){
         start=mid+1;
       }
         if(mid*mid>num){
         end=mid-1;
       }
     }
     
     System.out.println("Number not found");
    }
}
//////

