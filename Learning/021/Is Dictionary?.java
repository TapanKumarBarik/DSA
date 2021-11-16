Problem Description

In an alien language, surprisingly they also use english lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.

Given an array of words A of size N written in the alien language, and the order of the alphabet denoted by string B of size 26, return 1 if and only if the given words are sorted lexicographicaly in this alien language else return 0.



Problem Constraints
1 <= N, length of each word <= 105

Sum of length of all words <= 2 * 106



Input Format
First argument is a string array A of size N.

Second argument is a string B of size 26 denoting the order.



Output Format
Return 1 if and only if the given words are sorted lexicographicaly in this alien language else return 0.



Example Input
Input 1:

 A = ["hello", "scaler", "interviewbit"]
 B = "adhbcfegskjlponmirqtxwuvzy"
Input 2:

 A = ["fine", "none", "no"]
 B = "qwertyuiopasdfghjklzxcvbnm"


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 The order shown in string B is: h < s < i for the given words. So return 1.
Explanation 2:

 "none" should be present after "no". Return 0.



int Solution::solve(vector<string> &A, string B) {
    int n = A.size();
    int index[26];
    for(int i = 0; i < B.size(); i++){
        index[B[i] - 'a'] = i;
    }
    for(int i = 0; i < A.size()-1; i++){
        string word1 = A[i], word2 = A[i+1];
        int flag = 0;
        for(int k = 0; k < min(word1.length(), word2.length()); k++){
            if(word1[k] != word2[k]){
                if(index[word1[k] - 'a'] > index[word2[k] - 'a']){
                    return 0; 
                }
                   
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            if(word1.size() > word2.size()){
                return 0;
            }
        }
    }
    return 1;
}
