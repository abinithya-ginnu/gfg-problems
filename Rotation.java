/*
Given an ascending sorted rotated array arr of distinct integers of size n. The array is right-rotated k times. Find the value of k.

Example 1:

Input:
n = 5
arr[] = {5, 1, 2, 3, 4}
Output: 1
Explanation: The given array is 5 1 2 3 4. 
The original sorted array is 1 2 3 4 5. 
We can see that the array was rotated 
1 times to the right.
Example 2:

Input:
n = 5
arr[] = {1, 2, 3, 4, 5}
Output: 0
Explanation: The given array is not rotated.
Your Task:
Complete the function findKRotation() which takes array arr and size n, as input parameters and returns an integer representing the answer. You don't have to print answers or take inputs.

Expected Time Complexity: O(log(n))
Expected Auxiliary Space: O(1)

Constraints:
1 <= n <=105
1 <= arri <= 107
*/

//Solution:

class Solution {
    int findKRotation(int arr[], int n) {
        int min = arr[0];
        int index = 0;
        for (int i = 0; i < n; i++){
            if (min > arr[i]){
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
}
