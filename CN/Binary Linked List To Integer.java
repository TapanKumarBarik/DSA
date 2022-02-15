//https://www.codingninjas.com/codestudio/problems/binary-to-integer_2421938?topList=mohammad-fraz-dsa-sheet-problems&leftPanelTab=0


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
    public static int binaryToInteger(int n, Node head) {
        // Write your code here.
        
        int res=0;
        
        while(head!=null){
            res=res*2;
            res+=head.data;
            head=head.next;
        }
        return res;
    }
}
