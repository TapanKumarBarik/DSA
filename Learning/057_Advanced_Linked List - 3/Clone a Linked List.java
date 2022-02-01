Problem Description

Given a doubly linked list of integers with one pointer of each node pointing to the next node (just like in a single link list) while the second pointer, however, can point to any node in the list and not just the previous node.

You have to create a copy of this list and return the head pointer of the duplicated list.



Problem Constraints
1 <= length of the list <= 100000

1 <= Value of node <= 100000



Input Format
The only argument given is head pointer of the doubly linked list.



Output Format
Return the head pointer of the duplicated list.



Example Input
Input 1:

1 -> 2 -> 3 -> 4 -> 5
random pointer of each node 
1 -> 5 2 -> 4 3 -> 3 4 -> 2 5 -> 1
Input 2:

1 -> 2 -> 3 -> 4 -> 5
random pointer of each node 
1 -> 5 2 -> 4 3 -> 3 4 -> 2 5 -> 1


Example Output
Output 1:

1 -> 2 -> 3 -> 4 -> 5
random pointer of each node 
1 -> 5 2 -> 4 3 -> 3 4 -> 2 5 -> 1
Output 2:

1 -> 2 -> 3 -> 4 -> 5
random pointer of each node 
1 -> 5 2 -> 4 3 -> 3 4 -> 2 5 -> 1


Example Explanation
Explanation 1:

 Just clone the given list.
Explanation 2:

 Just clone the given list









/*
class ListNode {
    int val;
    ListNode next, random;
    ListNode(int x) {
        val = x;
        next = random = null;
    }
} 
*/
ListNode cloneList(ListNode A) {
    
          if(A == null) {
            return A;
        }
    
    ListNode  curr=A;
    
    while(curr!=null){
        
        ListNode temp=curr.next;
        
        ListNode newNode =new ListNode(curr.val);
        
        curr.next=newNode;
        curr.next.next=temp;
        curr=temp;
    }
    
    
    curr=A;
    
    while(curr!=null){
        
        if(curr.random==null){
           curr.next.random=null;
        }else{
            curr.next.random=curr.random.next;
        }
        
        curr=curr.next.next;
    }
    
    
     //separate out both the lists and return the new list
        curr = A;
        ListNode curr1 = A.next;
        ListNode h = curr1;
        while(curr != null) {
            curr.next = curr.next.next;
            if(curr1.next != null) {
                curr1.next = curr1.next.next;
            } 
            curr = curr.next;
            curr1 = curr1.next;
        }
        return h;
    
    
}
