Sort a linked list using insertion sort.

We have explained Insertion Sort at Slide 7 of Arrays

Insertion Sort Wiki has some details on Insertion Sort as well.

Example :

Input : 1 -> 3 -> 2

Return 1 -> 2 -> 3
  
  
  
  
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
    public ListNode insertionSortList(ListNode head) {
        
  ListNode start = new ListNode(-5001);
        start.next = head;
        ListNode prev = start;
        ListNode current = head;
        while (current != null) {
             ListNode next = current.next;
            if (current.val < prev.val) {
                prev.next = next;             // prev stays the same
                putInRightPlace(start, current);
            } else {
                prev = current;               // prev moves forward
            }
            current = next;
        }
        return start.next;
    }
    
    private void putInRightPlace(ListNode head, ListNode node) {
        while (head.next != null && node.val > head.next.val) {
            head = head.next;
        }
        
        ListNode next = head.next;
        head.next = node;
        node.next = next;
    }
}
