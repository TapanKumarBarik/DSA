Problem Description

Given a list containing head pointers of N sorted linked lists. Merge these N given sorted linked lists and return it as one sorted list.



Problem Constraints
1 <= total number of elements in given linked lists <= 100000



Input Format
First and only argument is a list containing N head pointers.



Output Format
Return a pointer to the head of the sorted linked list after merging all the given linked lists.



Example Input
Input 1:

 1 -> 10 -> 20
 4 -> 11 -> 13
 3 -> 8 -> 9
Input 2:

 10 -> 12
 13
 5 -> 6


Example Output
Output 1:

 1 -> 3 -> 4 -> 8 -> 9 -> 10 -> 11 -> 13 -> 20
Output 2:

 5 -> 6 -> 10 -> 12 ->13


Example Explanation
Explanation 1:

 The resulting sorted Linked List formed after merging is 1 -> 3 -> 4 -> 8 -> 9 -> 10 -> 11 -> 13 -> 20.
Explanation 2:

 The resulting sorted Linked List formed after merging is 5 -> 6 -> 10 -> 12 ->13.
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   /**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode mergeKLists(ArrayList<ListNode> a) {
	    
	      PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>((o1,o2)->o1.val-o2.val);
	      
	   int n = a.size();
	   
        for(int i=0;i<n;i++)
        {
            ListNode curr = a.get(i);
            while(curr != null)
            {
                pq.add(curr);
                curr = curr.next;
            }
        }
            
         ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(!pq.isEmpty())
        {
            ListNode temp = new ListNode(pq.poll().val);
            curr.next = temp;
            curr = temp;
        }
        return dummy.next;
	}
}
