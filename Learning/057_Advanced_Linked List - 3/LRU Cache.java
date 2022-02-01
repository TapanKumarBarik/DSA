Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and set.

get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
set(key, value) - Set or insert the value if the key is not already present. When the cache reaches its capacity, it should invalidate the least recently used item before inserting the new item.
The LRUCache will be initialized with an integer corresponding to its capacity. Capacity indicates the maximum number of unique keys it can hold at a time.

Definition of "least recently used" : An access to an item is defined as a get or a set operation of the item. "Least recently used" item is the one with the oldest access time.

 NOTE: If you are using any global variables, make sure to clear them in the constructor. 
Example :

Input : 
         capacity = 2
         set(1, 10)
         set(5, 12)
         get(5)        returns 12
         get(1)        returns 10
         get(10)       returns -1
         set(6, 14)    this pushes out key = 5 as LRU is full. 
         get(5)        returns -1 
           
           
           
          
          
          
  public class Solution {
   
   //made a doubly link list 
   class Node {
	int key;
	int value;
	Node prev;
	Node next;

//doubly link list constructor
	Node(int k, int v) {
		key = k;
		value = v;
	}
}	

//map,head,last , capacity
	private Map<Integer, Node> map = new HashMap<>();
	private Node head;
	private Node last;
	private int capacity;
    
    public Solution(int capacity) {
        this.capacity = capacity;
		head = new Node(0, 0);
		last = new Node(0, 0);
		head.next = last;
		last.prev = head;
    }
    
    public int get(int key) {
        Node node = map.get(key);
		if (node == null) {
			return -1;
		}
		remove(node);
		insert(node);
		return node.value;
    }
    
    public void set(int key, int value) {
        if (map.containsKey(key)) {
			remove(map.get(key));
		}
		if (map.size() == capacity) {
			remove(last.prev);
		}
		insert(new Node(key, value));
    }
    
    private void insert(Node node) {
		map.put(node.key, node);
		node.next = head.next;
		head.next.prev = node;
		node.prev = head;
		head.next = node;
	}	

	private void remove(Node node) {
		map.remove(node.key);
		node.prev.next = node.next;
		node.next.prev = node.prev;
	}
}

           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           public class Solution {
    private LinkedHashMap<Integer, Integer> map;
        private final int CAPACITY;
    public Solution(int capacity) {
          CAPACITY = capacity;
            map = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true){
                protected boolean removeEldestEntry(Map.Entry eldest) {
                    return size() > CAPACITY;
                }
            };
    }
    
    public int get(int key) {
        return map.getOrDefault(key, -1);
    }
    
    public void set(int key, int value) {
         map.put(key, value);
    }
}
