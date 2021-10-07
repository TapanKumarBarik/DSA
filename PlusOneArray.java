public class Solution {
    public int[] plusOne(int[] A) {
        //0,0,0,0,6
        // 6 + 1 = 7
        // 06 + 1 = 7
        // 0900667 + 1 = 7
        // 0123456
        int firstNonZeroIndex=0;
        
        for(int i=0;i<A.length;i++){
            if(A[i]!=0){
                break;
            }
            firstNonZeroIndex++;
        }
        
        
        // StringBuilder sb=new StringBuilder(); // 0001
        Stack<Integer> stack = new Stack<Integer>();
        int carry=1;
        for(int i=A.length-1;i>=firstNonZeroIndex;i--){
            
           int ans = A[i] + carry;//1
            carry = ans / 10;//0
            int mod = ans % 10;//7
            // sb.append(mod);//7   
            stack.push(mod);
        
        }
        if(carry!=0){
            // sb.append(carry);//01
            stack.push(carry);
            
        }
        // String s=sb.reverse().toString();
        //"1000"
        int []arr=new int[stack.size()];
        int it = 0;
        while (!stack.isEmpty()){
            arr[it] = stack.pop();
            it++;
        }
        
        return arr;
    }
}

    
//fase,1




