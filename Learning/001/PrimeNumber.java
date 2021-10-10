


public class HelloWorld {
    public static void main(String[] args) {
     
boolean isPrime=solve(4);
System.out.println(isPrime);
    }
    static boolean solve(int num){
       if(num==1){
      return false;
    }
  for(int i=2;i*i<=num;i++){
    
   if(num%i==0){
     return false;
   }
   
  }
      return true;
      
    }
}
