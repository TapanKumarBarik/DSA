Problem Description

Given an array A of N strings, return all groups of strings that are anagrams.

Represent a group by a list of integers representing the index(1-based) in the original list. Look at the sample case for clarification.

NOTE: Anagram : a word, phrase, or name formed by rearranging the letters of another, such as 'spar', formed from 'rasp'.



Problem Constraints
1 <= N <= 104

1 <= |A[i]| <= 104

Each string consists only of lowercase characters.

Sum of length of all the strings doesn't exceed 107



Input Format
Single Argument A which is an array of strings.



Output Format
Return a two-dimensional array where each row describes a group.

Note:

Ordering of the result :
You should not change the relative ordering of the strings within the group suppose within a group containing A[i] and A[j], A[i] comes before A[j] if i < j.



Example Input
Input 1:

 A = [cat, dog, god, tca]
Input 2:

 A = [rat, tar, art]


Example Output
Output 1:

 [ [1, 4],
   [2, 3] ]
Output 2:

 [ [1, 2, 3] ]


Example Explanation
Explanation 1:

 "cat" and "tca" are anagrams which correspond to index 1 and 4 and "dog" and "god" are another set of anagrams which correspond to index 2 and 3.
 The indices are 1 based ( the first element has index 1 instead of index 0).
Explanation 2:

 All three strings are anagrams.
   
   
   
   
   
   public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        
 ArrayList<ArrayList<Integer>> arr=new  ArrayList<ArrayList<Integer>> ();
        HashMap<String,ArrayList<Integer>>hm=new HashMap<String,ArrayList<Integer>>();
        
        for(int i=1;i<A.size()+1;i++){
            
            String s=sortString(A.get(i-1));
            
            
            if(hm.containsKey(s)){
                ArrayList<Integer>temp=hm.get(s);
                
               temp.add(i);
                
            }
            else{
                ArrayList<Integer>t=new ArrayList<Integer>();
                t.add(i);
                hm.put(s,t);
            }
            
        }
        
        
        
 
        
    for (Map.Entry mapElement : hm.entrySet()) {
      // String key = (String) mapElement.getKey();

      // Add some bonus marks
      // to all the students and print it
      ArrayList<Integer> value =(ArrayList<Integer>)  mapElement.getValue();
      arr.add(value);
     

    }
        
        
        
        return arr;
    }
    
    
    
private  String sortString(String inputString)
    {
        // Converting input string to character array
        char tempArray[] = inputString.toCharArray();
 
        // Sorting temp array using
        Arrays.sort(tempArray);
 
        // Returning new sorted string
        return new String(tempArray);
    }
}

   
