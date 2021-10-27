JAVA :
 Now we come to one of the most popular data structures in Java, HashMap. 
Declaration :
    HashMap<Integer, Integer> A = new HashMap<Integer, Integer>(); // declares an empty map.
Adding an key, value pair :
    A.put(key, value); // O(1) time on average
Find the value for key = K:
    A.get(K) // null if the key K is not present
    A.containsKey(K) tells if the key K is present. 
    // Both operations O(1) average time. O(n) rare worst case
Size ( number of elements ) of the vector :
    A.size()  // O(1)
Erase from the map :
    A.remove(K);
