Given the head of a linked list, rotate the list to the right by k places.

 

Example 1:


Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]
Example 2:


Input: head = [0,1,2], k = 4
Output: [2,0,1]
 

Constraints:

The number of nodes in the list is in the range [0, 500].
-100 <= Node.val <= 100
0 <= k <= 2 * 109
  
  
  
  
  
  
  
  
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
    public ListNode rotateRight(ListNode head, int k) {
      
       if (head == null || head.next == null|| k == 0) return head;
        
        
        //count
        int count=1;
        
       ListNode fast=head;
        
        while(fast.next!=null){
            fast=fast.next;
            count++;
        }
        
        k=k%count;
        k = count - k;
        
        //now fast points to null;
        //lets point fast to head;
        fast.next=head;
        
        //now its a circular linked list
        
        //till k iteration move pointer 
        
        while(k>0){
            fast=fast.next;
            k--;
        }
        
        
        ///
        
    //now we ll cut the connection
        
        head=fast.next;
        
        fast.next=null;
        
        
        return head;
    }
}
