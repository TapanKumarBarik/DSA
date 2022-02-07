//https://leetcode.com/problems/lru-cache/

class LRUCache {

    
    //initialized the DLL
    class Node{
        int key;
        int value;
        Node next;
        Node prev;
        
          //constructor
    Node(int k,int v){
        key=k;
        value=v;
    }
    }
    
  
    
    //creating space
    
    private HashMap<Integer,Node>map=new HashMap();
    
    private Node head;
    private Node last;
    private int capacity;
    
    public LRUCache(int capacity) {
        
        this.capacity=capacity;
         head=new Node(-1,-1);
         last=new Node (-1,-1);
        
        //connect;
        head.next=last;
        last.prev=head;
        
    }
    
    public int get(int key) {
       
       Node node=map.get(key);
        
        if(node==null){
            return -1;
        }
        
        remove(node);
        
        insert(node);
        return node.value;
        
    }
    
    public void put(int key, int value) {
        
        Node node=map.get(key);
         if(node!=null){
            remove(node);
        }
        
        if(map.size()==capacity){
            remove(last.prev);
        }
        insert(new Node(key,value));
        
        
    }
    
    private void remove(Node node){
        
        map.remove(node.key);
       
        node.prev.next=node.next;
         node.next.prev=node.prev;
    }
    
    private void insert(Node node){
        
        map.put(node.key,node);
        
        Node temp=head.next;
        
        head.next=node;
        node.prev=head;
        node.next=temp;
        temp.prev=node;
    }
    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
