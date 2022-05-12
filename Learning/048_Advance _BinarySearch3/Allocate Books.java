Problem Description
Given an array of integers A of size N and an integer B.

The College library has N books. The ith book has A[i] number of pages.

You have to allocate books to B number of students so that the maximum number of pages allocated to a student is minimum.

A book will be allocated to exactly one student.
Each student has to be allocated at least one book.
Allotment should be in contiguous order, for example: A student cannot be allocated book 1 and book 3, skipping book 2.
Calculate and return that minimum possible number.

NOTE: Return -1 if a valid assignment is not possible.



Problem Constraints
1 <= N <= 105
1 <= A[i], B <= 105



Input Format
The first argument given is the integer array A.
The second argument given is the integer B.



Output Format
Return that minimum possible number.



Example Input
A = [12, 34, 67, 90]
B = 2


Example Output
113


Example Explanation
There are two students. Books can be distributed in following fashion : 

1)  [12] and [34, 67, 90]
    Max number of pages is allocated to student 2 with 34 + 67 + 90 = 191 pages
2)  [12, 34] and [67, 90]
    Max number of pages is allocated to student 2 with 67 + 90 = 157 pages 
3)  [12, 34, 67] and [90]
    Max number of pages is allocated to student 1 with 12 + 34 + 67 = 113 pages
    Of the 3 cases, Option 3 has the minimum pages = 113.


  
  
  
  
  
  
  public class Solution {
    public int books(int[] A, int B) {
        return findPages(A, A.length, B);
    }
    
    
    // Utility method to check if current minimum value
    // is feasible or not.
    static boolean isPossible(int arr[], int n, int m, int curr_min)
    {
        int studentsRequired = 1;
        int curr_sum = 0;
     
        // iterate over all books
        for (int i = 0; i < n; i++)
        {
            // check if current number of pages are greater
            // than curr_min that means we will get the result
            // after mid no. of pages
            if (arr[i] > curr_min)
                return false;
     
            // count how many students are required
            // to distribute curr_min pages
            if (curr_sum + arr[i] > curr_min)
            {
                // increment student count
                studentsRequired++;
     
                // update curr_sum
                curr_sum = arr[i];
     
                // if students required becomes greater
                // than given no. of students,return false
                if (studentsRequired > m)
                    return false;
            }
     
            // else update curr_sum
            else
                curr_sum += arr[i];
        }
        return true;
    }
     
    // method to find minimum pages
    static int findPages(int arr[], int n, int m)
    {
        long sum = 0;
     
        // return -1 if no. of books is less than
        // no. of students
        if (n < m)
            return -1;
     
        // Count total number of pages
        for (int i = 0; i < n; i++)
            sum += arr[i];
     
        // initialize start as 0 pages and end as
        // total pages
        int start = 0, end = (int) sum;
        int result = Integer.MAX_VALUE;
     
        // traverse until start <= end
        while (start <= end)
        {
            // check if it is possible to distribute
            // books by using mid is current minimum
            int mid = (start + end) / 2;
            if (isPossible(arr, n, m, mid))
            {
                // update result to current distribution
                // as it's the best we have found till now.
                result = mid;
     
                // as we are finding minimum and books
                // are sorted so reduce end = mid -1
                // that means
                end = mid - 1;
            }
     
            else
                // if not possible means pages should be
                // increased so update start = mid + 1
                start = mid + 1;
        }
     
        // at-last return minimum no. of  pages
        return result;
    }
    
}
