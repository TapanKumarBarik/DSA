Problem Description

Given a linked list which contains some loop.

You need to find the node, which creates a loop, and break it by making the node point to NULL.



Problem Constraints
1 <= number of nodes <= 1000



Input Format
Only argument is the head of the linked list.



Output Format
return the head of the updated linked list.



Example Input
Input 1:

 
1 -> 2
^    |
| - - 
Input 2:

3 -> 2 -> 4 -> 5 -> 6
          ^         |
          |         |    
          - - - - - -


Example Output
Output 1:

 1 -> 2 -> NULL
Output 2:

 3 -> 2 -> 4 -> 5 -> 6 -> NULL


Example Explanation
Explanation 1:

 Chain of 1->2 is broken.
Explanation 2:

 Chain of 4->6 is broken.
   
   
   
   
   
   
   //Brut force
   
   /**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode solve(ListNode A) {
        
        HashMap<ListNode , Integer>map=new HashMap();
        
        ListNode prev=A;
        ListNode cur=A;
        
        while(cur!=null){
            
             if(map.containsKey(cur)){
                prev.next=null;
                break;
            }
            
            prev=cur;
            cur=cur.next;
            map.put(prev,prev.val);
            
           
        }
        
        return A;
    }
}





//optimal

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode solve(ListNode A) {
        detectAndRemoveLoop(A);
        return A;
    }
    int detectAndRemoveLoop(ListNode node) {
        ListNode slow = node, fast = node;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If slow and fast meet at same point then loop is present 
            if (slow == fast) {
                removeLoop(slow, node);
                return 1;
            }
        }
        return 0;
    }

    // Function to remove loop 
    void removeLoop(ListNode loop, ListNode curr) {
        ListNode ptr1 = null;
        ListNode ptr2 = null;
        /* Set a pointer to the beginning of the Linked List and 
         move it one by one to find the first node which is 
         part of the Linked List */
        ptr1 = curr;
        while (1 == 1) {
            /* Now start a pointer from loop_node and check if it ever 
             reaches ptr2 */
            ptr2 = loop;
            while (ptr2.next != loop && ptr2.next != ptr1) {
                ptr2 = ptr2.next;
            }
            /* If ptr2 reahced ptr1 then there is a loop. So break the 
             loop */
            if (ptr2.next == ptr1) {
                break;
            }
            /* If ptr2 did't reach ptr1 then try the next node after ptr1 */
            ptr1 = ptr1.next;
        }
        /* After the end of loop ptr2 is the last node of the loop. So 
         make next of ptr2 as NULL */
        ptr2.next = null;
    }

}
