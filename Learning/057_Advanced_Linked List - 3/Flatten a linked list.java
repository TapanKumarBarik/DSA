Problem Description

Given a linked list where every node represents a linked list and contains two pointers of its type:

Pointer to next node in the main list (right pointer)
Pointer to a linked list where this node is head (down pointer). All linked lists are sorted.
You are asked to flatten the linked list into a single list. Use down pointer to link nodes of the flattened list. The flattened linked list should also be sorted.



Problem Constraints
1 <= Total nodes in the list <= 100000

1 <= Value of node <= 109



Input Format
The only argument given is head pointer of the doubly linked list.



Output Format
Return the head pointer of the Flattened list.



Example Input
Input 1:

   3 -> 4 -> 20 -> 20 ->30
   |    |    |     |    |
   7    11   22    20   31
   |               |    |
   7               28   39
   |               |
   8               39
Input 2:

   2 -> 4 
   |    |       
   7    11    
   |            
   7


Example Output
Output 1:

 3 -> 4 -> 7 -> 7 -> 8 -> 11 -> 20 -> 20 -> 20 -> 22 -> 28 -> 30 -> 31 -> 39 -> 39 
Output 2:

 2 -> 4 -> 7 -> 7 -> 11


Example Explanation
Explanation 1:

 The return linked list is the flatten sorted list.




   
   
   
   
   
   
   
   
   import java.lang.*;
import java.util.*;
import java.io.*;

public class Main {

class ListNode {
    int val;
    ListNode right, down;
    ListNode(int x) {
        val = x;
        right = down = null;
    }
}
  

  
  
  
  
  
  
  
  
  /*
class ListNode {
    int val;
    ListNode right, down;
    ListNode(int x) {
        val = x;
        right = down = null;
    }
}
*/
ListNode flatten(ListNode root) {
    
    
        // Base Cases
        if (root == null || root.right == null)
            return root;
  
        // recur for list on right
        root.right = flatten(root.right);
  
        // now merge
        root = merge(root, root.right);
  
        // return the root
        // it will be in turn merged with its left
        return root;
    
}



 // An utility function to merge two sorted linked lists
   private ListNode merge(ListNode a, ListNode b)
    {
        // if first linked list is empty then second
        // is the answer
        if (a == null)     return b;
  
        // if second linked list is empty then first
        // is the result
        if (b == null)      return a;
  
        // compare the data members of the two linked lists
        // and put the larger one in the result
        ListNode result;
  
        if (a.val < b.val)
        {
            result = a;
            result.down =  merge(a.down, b);
        }
  
        else
        {
            result = b;
            result.down = merge(a, b.down);
        }
  
        result.right = null; 
        return result;
    }
  
  
  
  
  
  
  
    BufferedReader br;
    PrintWriter out;
    
    void solve() {
        int t = ni();
        while(t-- > 0) {
            int n = ni();
            ListNode head = null;
            ListNode pre = null;
            for(int i = 0; i < n; i++) {
                int m = ni();
                ListNode p1 = null;
                while(m-- > 0) {
                    int x = ni();
                    ListNode temp = new ListNode(x);
                    if(head == null)    head = temp;
                    if(p1 == null) {
                        if(pre != null) pre.right = temp;
                        pre = temp;
                    } else {
                        p1.down = temp;
                    }
                    p1 = temp;
                }
            }
            ListNode flat = flatten(head);
            ListNode temp = flat;
            boolean first = true;
            while(temp != null) {
                if( !first )    out.print("-> ");
                out.print(temp.val +" ");
                temp = temp.down;
                first = false;
            }
            out.println();
        }
    }

    int ni() {
        return Integer.parseInt(ns());
    }
    
    StringTokenizer ip;
    
    String ns() {
        if(ip == null || !ip.hasMoreTokens()) {
            try {
                ip = new StringTokenizer(br.readLine());
            } catch(IOException e) {
                throw new InputMismatchException();
            }
        }
        return ip.nextToken();
    }
    
    void run() {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        solve();
        out.flush();
    }
    
    public static void main(String[] args) {
        new Main().run();
    }

}
