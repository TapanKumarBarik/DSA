List Cycle
Problem Description

Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

Try solving it using constant additional space.

Example:

Input: 

                  ______
                 |     |
                 \/    |
        1 -> 2 -> 3 -> 4

                    
                    
                    
                    
                    
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode detectCycle(ListNode head) {
	    
	      
	        ListNode slow = head;
                ListNode fast = head;
        
                while (fast!=null && fast.next!=null){
                    fast = fast.next.next;
                    slow = slow.next;
                    
                    if (fast == slow){
                        ListNode slow2 = head; 
                        while (slow2 != slow){
                            slow = slow.next;
                            slow2 = slow2.next;
                        }
                        return slow;
                    }
                }
                return null;


	}
}
