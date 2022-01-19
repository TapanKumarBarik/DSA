Problem Description

Given two array of integers A and B describing a pair of (A[i], B[i]) coordinates in 2D plane. A[i] describe x coordinates of the ith point in 2D plane whereas B[i] describes the y-coordinate of the ith point in 2D plane.

Find and return the maximum number of points which lie on the same line.



Problem Constraints
1 <= (length of the array A = length of array B) <= 1000

-105 <= A[i], B[i] <= 105



Input Format
First argument is an integer array A.
Second argument is an integer array B.



Output Format
Return the maximum number of points which lie on the same line.



Example Input
Input 1:

 A = [-1, 0, 1, 2, 3, 3]
 B = [1, 0, 1, 2, 3, 4]
Input 2:

 A = [3, 1, 4, 5, 7, -9, -8, 6]
 B = [4, -8, -3, -2, -1, 5, 7, -4]


Example Output
Output 1:

 4
Output 2:

 2


Example Explanation
Explanation 1:

 The maximum number of point which lie on same line are 4, those points are {0, 0}, {1, 1}, {2, 2}, {3, 3}.
Explanation 2:

 Any 2 points lie on a same line.




   
   
   
   
   
   int Solution::solve(vector<int> &A, vector<int> &B) {
     // Do not write main() function.
    // Do not read input, instead use the arguments to the function.
    // Do not print the output, instead return values as specified
    // Still have a doubt. Checkout www.interviewbit.com/pages/sample_codes/ for more details
    
    if(A.size() == 0 || B.size() == 0){
        return 0;
    }
    
    unordered_map<double, int> myMap;
    int sol = 1;
    for(int i = 0; i < A.size(); i++){
        int duplicate = 1;
        int vertical = 0;
        for(int j = i+1; j < A.size(); j++){
            if(A[i] == A[j]){
                if(B[i] == B[j]){
                    duplicate++;
                }
                else{
                    vertical++;
                }
            }
            else{
                double slope = 0.0;
                double x = A[j] - A[i];
                double y = B[j] - B[i];
                if(B[j] != B[i]){
                    slope = (1.0 * (y/x));
                }
                if(myMap.find(slope) != myMap.end()){
                    myMap[slope]++;
                }
                else{
                    myMap[slope] = 1;
                }
            }
        }
        auto it = myMap.begin();
        while(it != myMap.end()){
            int t = it->second;
            if((t + duplicate) > sol){
                sol = t + duplicate;
            }
            it++;
        }
        if((vertical + duplicate) > sol){
            sol = vertical + duplicate;
        }
        myMap.clear();
    }
    
    return sol;
}

