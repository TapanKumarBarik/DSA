Given a string A representing an absolute path for a file (Unix-style).

Return the string A after simplifying the absolute path.

Note:

Absolute path always begin with '/' ( root directory ).

Path will not have whitespace characters.


Input Format

The only argument given is string A.
Output Format

Return a string denoting the simplified absolue path for a file (Unix-style).
For Example

Input 1:
    A = "/home/"
Output 1:
    "/home"

Input 2:
    A = "/a/./b/../../c/"
Output 2:
    "/c"
      
      
      
      
      
//       //Split the string to array
//       stack
//       if stack is not empty  and arr[i]==.. then pop
      
//       else if arr[i]=!. , !="", !=.. then push
      
//       return
      
        
        
        
        public class Solution {
    public String simplifyPath(String path) {
        
   Stack<String> stack = new Stack<>();
        
    String[] p = path.split("/");
        
    for (int i = 0; i < p.length; i++) {
        
        if (!stack.empty() && p[i].equals(".."))
        {
            stack.pop();
        }
        else if (!p[i].equals(".") && !p[i].equals("") && !p[i].equals(".."))
        {
             stack.push(p[i]);
        }
    }
    List<String> list = new ArrayList(stack);
    return "/"+String.join("/", list);
    }
}
