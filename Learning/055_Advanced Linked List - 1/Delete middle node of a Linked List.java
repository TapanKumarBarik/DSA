Given a singly linked list, delete middle of the linked list.

For example, if given linked list is 1->2->3->4->5 then linked list should be modified to 1->2->4->5

If there are even nodes, then there would be two middle nodes, we need to delete the second middle element.

For example, if given linked list is 1->2->3->4->5->6 then it should be modified to 1->2->3->5->6.

Return the head of the linked list after removing the middle node.

If the input linked list has 1 node, then this node should be deleted and a null node should be returned.


Input Format

The only argument given is the node pointing to the head node of the linked list






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
        
        //2 pass apparoach
        // ListNode temp=A;
        
        // if(A==null)return null;
        // if(A.next==null)return null;
        
        // int count=0;
        // while(temp!=null){
        //     count++;
        //     temp=temp.next;
            
        // }
        // count=count/2;
        // temp=A;
        
        // while(count>1 ){
        //     A=A.next;
        //     count--;
        // }
        
        // A.next=A.next.next;
        
        // return temp;
        
        //1 pass approach
        
        if(A==null || A.next==null){
            return null;
        }
        
        ListNode prev=A;
        ListNode slow=A;
        ListNode fast=A;
        
        
        while(fast!=null && fast.next!=null){
            
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        
        prev.next=slow.next;
        return A;
        
        
        
        
    }
}
