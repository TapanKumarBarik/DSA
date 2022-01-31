Sort a linked list in O(n log n) time using constant space complexity.

Example :

Input : 1 -> 5 -> 4 -> 3

Returned list : 1 -> 3 -> 4 -> 5
  
  
  
  
  /**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode A) {

    if(A==null || A.next==null)return A;

    ListNode temp=A;
    ListNode mid=mid(temp);

    ListNode A2=mid.next;
    mid.next=null;

    A=sortList(A);
    A2=sortList(A2);

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



    private ListNode mid(ListNode head){

        ListNode fast=head;
        ListNode slow=head;

        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        return slow;
    }
}
