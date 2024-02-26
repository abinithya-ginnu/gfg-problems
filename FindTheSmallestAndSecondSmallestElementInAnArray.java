/*
Given an array of integers, your task is to find the smallest and second smallest element in the array. If smallest and second smallest do not exist, print -1.

Example 1:

Input :
5
2 4 3 5 6
Output :
2 3 
Explanation: 
2 and 3 are respectively the smallest 
and second smallest elements in the array.

Example 2:

Input :
6
1 2 1 3 6 7
Output :
1 2 
Explanation: 
1 and 2 are respectively the smallest 
and second smallest elements in the array.
Your Task:  
You don't need to read input or print anything. Your task is to complete the function minAnd2ndMin() which takes the array A[] and its size N as inputs and returns a vector containing the smallest and second smallest element if possible, else return {-1,-1}.

 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

 

Constraints:
1<=N<=105
1<=A[i]<=105
*/

//Solution:

class Compute 
{
    public long[] minAnd2ndMin(long a[], long n)  
    {
        a = Arrays.stream(a).distinct().toArray();
        Arrays.sort(a);
        long[] smallest = new long[2];
        if(a.length < 2){
            smallest[0] = -1;
        }
        else{
           smallest[0] = a[0];
           smallest[1] = a[1];
        }
        return smallest;
    }
}
