
Write a program to input from user an integer representing the rating of a person on a platform
You have to print the category of that person
If the rating is greater than or equal to 2100 then that person is "grand master".
If the rating is greater than or equal to 1900 then that person is "candidate master"
If the rating is greater than or equal to 1600 then that person is "expert".
If the rating is greater than or equal to 1400 then that person is "pupil".
If the rating is smaller than 1400 then that person is "newbie".
NOTE: Print all the chars of the category of the person in lowercase if rating is odd otherwise print in UPPERCASE







import java.lang.*;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) 
    {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
        //calculateRating();
        
    //}
   // public static void calculateRating(int num){
       // BuffereReader bfr=new BuffereReader(new InputStreamReader(System.in));
       Scanner scn=new Scanner(System.in);
      int num= scn.nextInt();
        if(num<1400){
            
            if(num%2==0){
        System.out.println("NEWBIE");
        
            }
            else{
                
                System.out.println("newbie");
            }
        }
        //CASE 2
        else if(num>=1400 &&num<1600){
            
            if(num%2==0){
        System.out.println("PUPIL");
        
            }
            else{
                
                System.out.println("pupil");
            }
        }
        //case 3
        else if(num>=1600 &&num<1900){
            
            if(num%2==0){
        System.out.println("EXPERT");
        
            }
            else{
                
                System.out.println("expert");
            }
        }
        //
             else if(num>=1900 &&num<2100){
            
            if(num%2==0){
        System.out.println("CANDIDATE MASTER");
        
            }
            else{
                
                System.out.println("candidate master");
            }
        }
        //
             else if(num>=2100 ){
            
            if(num%2==0){
        System.out.println("GRAND MASTER");
        
            }
            else{
                
                System.out.println("grand master");
            }
        }
    }
}
