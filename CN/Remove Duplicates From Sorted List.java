//https://www.codingninjas.com/codestudio/problems/unique-sorted-list_2420283?topList=mohammad-fraz-dsa-sheet-problems&leftPanelTab=0






/********************************************************

    Following is the class structure of the Node class:
    
    class Node
    {
        public:
            int data;
            Node next;
            Node(int data)
            {
                this.data = data;
                this.next = null;
            }
    };

********************************************************/

public class Solution {
    public static Node uniqueSortedList(Node head) {
        // Write your code here.
        Node temp=head;
        
        while(temp!=null){
            
            if(temp.next==null){
                return head;
            }
            
            if(temp.data==temp.next.data){
             temp.next=temp.next.next;
            } 
            else{
                temp=temp.next;
            }
        }
        return head;
    }
}
