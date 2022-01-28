Problem Description

Given a singly linked list A

 A: A0 → A1 → … → An-1 → An 
reorder it to:

 A0 → An → A1 → An-1 → A2 → An-2 → … 
You must do this in-place without altering the nodes' values.



Problem Constraints
1 <= |A| <= 106



Input Format
The first and the only argument of input contains a pointer to the head of the linked list A.



Output Format
Return a pointer to the head of the modified linked list.



Example Input
Input 1:

 A = [1, 2, 3, 4, 5] 
Input 2:

 A = [1, 2, 3, 4] 


Example Output
Output 1:

 [1, 5, 2, 4, 3] 
Output 2:

 [1, 4, 2, 3] 


Example Explanation
Explanation 1:

 The array will be arranged to [A0, An, A1, An-1, A2].
Explanation 2:

 The array will be arranged to [A0, An, A1, An-1, A2].

   
   
   
   
   
   
   
   
   
   
   
   
   /**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
 
    public ListNode reorderList(ListNode head) {
        
        ListNode midNode =  midNode(head);
        ListNode nextToMid =  midNode.next;
        midNode.next = null;
        ListNode p2 =  reverse(nextToMid);
        
        ListNode p1 =  head ;
        ListNode nextP1=head;    
        while(p1!=null && p2!=null){
            nextP1 =  p1.next;                                    
			p1.next =  p2;
			           
            p1 =  p2;
            p2=p1Next;                        
        } 
        return head;
    }            
  
  
  
   public ListNode midNode(ListNode head){
        ListNode fast =  head, slow  =  head;
        while(fast.next!=null && fast.next.next!=null){
            fast =  fast.next.next;
            slow =  slow.next;
        }
        return slow;
    }
    
    public ListNode reverse(ListNode head){
        ListNode curr =  head, prev=  null, next = null;
        while(curr!=null){
            next  =  curr.next;
            curr.next =  prev ;
            prev =  curr;
            curr  =  next;
        }
        return prev;
    }
}
