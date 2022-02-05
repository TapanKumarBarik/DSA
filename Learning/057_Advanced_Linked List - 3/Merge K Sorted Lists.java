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



×



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
	    
	   PriorityQueue<ListNode>minHeap=new PriorityQueue<>((o1,o2)->o1.val-o2.val);

       ListNode dummy=new ListNode(-1);
       ListNode head=dummy;


       for(ListNode list :a){
           while(list!=null){
               minHeap.add(list);
               list=list.next;
           }
       }


       while(!minHeap.isEmpty()){
           dummy.next=minHeap.poll();
           dummy=dummy.next;
           dummy.next=null;
       }

       return head.next;
	}
	
	
}











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
	    
	    ListNode p=new ListNode(-1);
	    ListNode ans=p;
	   
	    
	    while(true){
	         int min=-1;
	        
	        for(int i=0;i<a.size();i++){
	            
	            if(a.get(i)!=null)
	            {
	                if(min==-1)min = i;
    	            else {
    	                if(a.get(i).val<a.get(min).val) min = i;
    	            }

	            }
	            
	            
	        }
	        if(min==-1)break;
	        
	        p.next=a.get(min);
	        
	        p=p.next;
	        a.set(min, a.get(min).next);
	        
	    }
	    return ans.next;
	}
	
	
}
