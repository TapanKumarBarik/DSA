Problem Description
There is a dictionary A of N words, and ith word has a unique weight Wi.

Another string array B of size M contains the prefixes. For every prefix B[i], output atmost 5 words from the dictionary A that start with the same prefix.

Output the words in decreasing order of their weight.

NOTE: If there is no word that starts with the given prefix output -1.



Problem Constraints
1 <= T <= 5

1 <= N <= 20000
1 <= M <= 10000

1 <= Wi <= 106

1 <= length of any string either in A or B <= 30



Input Format
First line is an integer T denoting the number of test cases.
For each test case,

First line denotes two space seperated integer N and M.
Second line denotes N space seperated strings denoting the words in dictionary.
Third line denotes N space seperated integers denoting the weight of each word in the dictionary.
Fourth line denotes M space seperated integers denoting the prefixes.


Output Format
For every prefix B[i], print the space seperated output on a new line.

NOTE: After every output there should be a space.



Example Input
Input 1:

 1
 6 3
 abcd aecd abaa abef acdcc acbcc
 2 1 3 4 6 5
 ab abc a
Input 2:

 1
 5 3
 aaaa aacd abaa abaa aadcc
 3 4 1 2 6 
 aa aba abc


Example Output
Output 1:

 abef abaa abcd 
 abcd 
 acdcc acbcc abef abaa abcd 
Output 2:

 aadcc aacd aaaa 
 abaa abaa 
 -1 


Example Explanation
Explanation 1:

 For the prefix "ab" 3 words in the dictionary have same prefix: ("abcd" : 2, "abaa" : 3, "abef" : 4). Ouput them in decreasing order of weight.
 For the prefix "abc" only 1 word in the dictionary have same prefix: ("abcd" : 2).
 For the prefix "a" all 6 words in the dictionary have same prefix: ("abcd" : 2, "aecd" : 1, "abaa" : 3, "abef" : 4, "acdcc" : 6, "acbcc" : 5).
 Since we can output atmost 5 words. Output top 5 weighted words in decreasing order of weight.
Explanation 2:

 For the prefix "aa" 3 words in the dictionary have same prefix: ("aaaa" : 3, "aacd" : 4, "aadcc" : 6). Ouput them in decreasing order of weight.
 For the prefix "aba" 2 words in the dictionary have same prefix: ("abaa" : 1, "abaa" : 2).
 For the prefix "abc" there is no word in the dictionary which have same prefix. So print -1.
   
   
   
   
   
   
   
   
   
   import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Main obj = new Main();
        Scanner in = new Scanner(System.in);
        int cases = Integer.valueOf(in.nextLine());
        Pair[] arr;
        for (int i = 1; i <= cases; i++) {
            in.nextLine();
            String words = in.nextLine();
            String weightage = in.nextLine();
            TrieNode root = new TrieNode();
            String[] searchArr = in.nextLine().split(" ");
            arr = obj.createPairArr(words.split(" "), weightage.split(" "));
            Arrays.sort(arr, new PairComparator());
            obj.insertWords(root, arr);
            obj.search(root, searchArr, arr);
        }
    }

    private void insertWords(TrieNode root, Pair[] wordsArr) {
        TrieNode node;
        for (int n = 0; n < wordsArr.length; n++) {
            Pair pair = wordsArr[n];
            node = root;
            String word = pair.word;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (node.words[ch - 'a'] == null) {
                    node.words[ch - 'a'] = new TrieNode();
                }
                if(node.words[ch - 'a'].idx.size() < 5) {
                    node.words[ch - 'a'].idx.add(n);
                }
                if (i == word.length() - 1) {
                    node.words[ch - 'a'].isWord = true;
                }
                node = node.words[ch - 'a'];
            }
        }
    }

    private Pair[] createPairArr(String[] words, String[] weights) {
        Pair[] output = new Pair[words.length];
        for(int i = 0; i < words.length; i++) {
            output[i] = new Pair(words[i], Integer.valueOf(weights[i]));
        }
        return output;
    }

    private void search(TrieNode root, String[] searchArr, Pair[] wordsArr) {
        TrieNode node;
        for (String word : searchArr) {
            node = root;
            boolean notFound = false;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (node.words[ch - 'a'] == null) {
                    notFound = true;
                    break;
                } else {
                    node = node.words[ch - 'a'];
                }
            }
            if (notFound) {
                System.out.println(-1 + " ");
            } else {
                String[] names = node.idx.stream().map(i -> wordsArr[i].word).toArray(String[]::new);
                System.out.println(String.join(" ", names) + " ");
            }
        }
    }
}

class PairComparator implements Comparator<Pair> {

    @Override
    public int compare(Pair o1, Pair o2) {
        int w1 = o1.weight;
        int w2 = o2.weight;
        return w2 - w1;
    }
}

class Pair {
    String word;
    int weight;
    public Pair(String w, int wt) {
        this.word = w;
        this.weight = wt;
    }
}

class TrieNode {
    boolean isWord;
    ArrayList<Integer> idx;
    TrieNode[] words;

    public TrieNode() {
        isWord = false;
        idx = new ArrayList<Integer>();
        words = new TrieNode[26];
    }
}
