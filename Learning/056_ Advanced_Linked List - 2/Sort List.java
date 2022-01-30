Problem Description

Sort a linked list, A in O(n log n) time using constant space complexity.



Problem Constraints
0 <= |A| = 105



Input Format
The first and the only arugment of input contains a pointer to the head of the linked list, A.



Output Format
Return a pointer to the head of the sorted linked list.



Example Input
Input 1:

A = [3, 4, 2, 8]
Input 2:

A = [1]


Example Output
Output 1:

[2, 3, 4, 8]
Output 2:

[1]


Example Explanation
Explanation 1:

 The sorted form of [3, 4, 2, 8] is [2, 3, 4, 8].
Explanation 2:

 The sorted form of [1] is [1].

   
   
   
   
   
   /**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        
        if(head==null || head.next==null)return head;
        
        ListNode mid =findMid(head);
        ListNode head2=mid.next;
        mid.next=null;
        head=sortList(head);
        head2=sortList(head2);
        
        return merge(head,head2);
    }
    
    
    
    private ListNode merge(ListNode A,ListNode B){
        
        if(A==null)return B;
        if(B==null)return A;
        
        ListNode temp=new ListNode(0);
        ListNode output=temp;
        
        while(A!=null && B!=null){
            if(A.val<B.val){
                temp.next=A;
                temp=temp.next;
                A=A.next;
                
            }
            else{
                 temp.next=B;
              temp=temp.next;
              B=B.next;
            }
        }
        
        if(A!=null){
            temp.next=A;
        }
        if(B!=null){
            temp.next=B;
        }
        return output.next;
        
    }
    
    
    private ListNode findMid(ListNode A){
        ListNode fast=A;
        ListNode slow=A;
        
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
