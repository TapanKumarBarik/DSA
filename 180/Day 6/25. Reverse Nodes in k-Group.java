Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

You may not alter the values in the list's nodes, only nodes themselves may be changed.

 

Example 1:


Input: head = [1,2,3,4,5], k = 2
Output: [2,1,4,3,5]
Example 2:


Input: head = [1,2,3,4,5], k = 3
Output: [3,2,1,4,5]
 

Constraints:

The number of nodes in the list is n.
1 <= k <= n <= 5000
0 <= Node.val <= 1000
 

Follow-up: Can you solve the problem in O(1) extra memory space?
  
  
  
  
  
  
  
  
  /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        
        
        
        //if the node is null or k==1 we cant reverse
        if(head==null || k==1 ){
            return head;
        }
        
        
        //
        ListNode dummy=new ListNode();
        dummy.next=head;
        
        ListNode cur=dummy, pre=dummy,next=dummy;
        
        
        //Calculate the length of linkList
        
        int count=0;
        
        while(cur.next!=null){
            cur=cur.next;
            count++;
        }
        
        while(count>=k){
           cur=pre.next;//2
            next=cur.next;//3
                for(int i=1;i<k;i++){
                    cur.next=next.next;
                    next.next=pre.next;
                    pre.next=next;
                    next=cur.next;
                }
            pre=cur;
            count-=k;
            
        }
        
        
        return dummy.next;
    }
}
