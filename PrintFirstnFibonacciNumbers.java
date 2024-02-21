/*
Given a number N, find the first N Fibonacci numbers. The first two number of the series are 1 and 1.

Example 1:

Input:
N = 5
Output: 1 1 2 3 5
Example 2:

Input:
N = 7
Output: 1 1 2 3 5 8 13
Your Task:
Your task is to complete printFibb() which takes single argument N and returns a list of first N Fibonacci numbers.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).
Note: This space is used to store and return the answer for printing purpose.

Constraints:
1<= N <=84
*/

//Solution:

class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        long n1 = 0;
        long n2 = 1;
        long n3 = 0;
        long[] out = new long[n];
        out[0] = n2;
        for(int i = 1; i < n; i++){
            n3 = n1 + n2;
            out[i] = n3;
            n1 = n2;
            n2 = n3;        
        }
        return out;
    }
}
