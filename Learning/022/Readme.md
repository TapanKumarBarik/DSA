
Java has strings as well which are very similar to C++ string. However java strings are immutable. As such, if you plan to keep appending to the string, then better use StringBuilder.

Array declaration :

    String A = new String(); // declares an empty string. O(1)
    
    String A = new String("Hello"); // declares string initialized to "Hello"
    
    OR for mutable string : 
    
    StringBuilder A = new StringBuilder(); // empty string
    
    StringBuilder A = new StringBuilder("Hello"); // stringbuilder initialized to "Hello".
    
Accessing ith element :

    A.charAt(i)     // O(1). Works for both String and StringBuilder
    
Size of the string :


    A.length()  // O(1) operation
    
Adding characters to the string :

    String : A.concat("Hello"); // O(n) operation. Creates another copy of the string as string is immutable. 
    
    StringBuilder : A.append("Hello"); // O(l) operation where l is the length of the string being appended. Much more efficient. 
