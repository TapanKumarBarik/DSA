Problem Description

Given a Linked List A consisting of N nodes.

The Linked List is binary i.e data values in the linked list nodes consist of only 0's and 1's.

You need to sort the linked list and return the new linked list.

NOTE:

Try to do it in constant space.


Problem Constraints
 1 <= N <= 105

 A.val = 0 or A.val = 1



Input Format
First and only argument is the head pointer of the linkedlist A.



Output Format
Return the head pointer of the new sorted linked list.



Example Input
Input 1:

 1 -> 0 -> 0 -> 1
Input 2:

 0 -> 0 -> 1 -> 1 -> 0


Example Output
Output 1:

 0 -> 0 -> 1 -> 1
Output 2:

 0 -> 0 -> 0 -> 1 -> 1


Example Explanation
Explanation 1:

 The sorted linked list looks like:
  0 -> 0 -> 1 -> 1
Explanation 2:

 The sorted linked list looks like:
  0 -> 0 -> 0 -> 1 -> 1


    
    
    
    
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

        if(A==null || A.next==null)return A;

        ListNode temp=A;
        ListNode mid=mid(temp);

        ListNode A2=mid.next;
        mid.next=null;

        A=solve(A);
        A2=solve(A2);
        return merge(A,A2);
    }



private ListNode merge(ListNode head,ListNode head2){

    if(head==null)return head2;
    if(head2==null)return head;


ListNode temp=new ListNode(0);
ListNode output=temp;


while(head!=null && head2!=null){

    if(head.val<head2.val){
        temp.next=head;
        temp=temp.next;
        head=head.next;
    }
    else{
        temp.next=head2;
        temp=temp.next;
        head2=head2.next;
    }
}

if(head!=null){
    temp.next=head;
}
if(head2!=null){
    temp.next=head2;
}

return output.next;



}

    private ListNode mid(ListNode temp){

        ListNode slow=temp;
        ListNode fast=temp;

        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        return slow;
    }
}
