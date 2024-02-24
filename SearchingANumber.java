/*
Given an array arr of n elements and a integer k. Your task is to return the position of first occurence of k in the given array and if element k is not present in the array then return -1 .
Note: Position of first element is considered as 1.

Example 1:

Input:
n = 5, k = 16
Arr[] = {9, 7, 2, 16, 4}
Output: 4
Explanation: K = 16 is found in the
given array at position 4.
Example 2:

Input:
n = 7, k = 98
Arr[] = {1, 22, 57, 47, 34, 18, 66}
Output: -1
Explanation: K = 98 isn't found in
the given array.
Your Task:
Complete the function search() which takes an array arr, two integers n and k, as input parameters and returns an integer denoting the answer. Return -1 if the number is not found in array. You don't to print answer or take inputs.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 <= n <= 106
1 <= k <= 106
1 <= arr[i] <= 106
*/

//Solution:
class Solution {
    public int search(int arr[], int n, int k) {
        for(int i = 0; i < n; i++){
            if(arr[i] == k)
                return i+1;
        }
        return -1;
    }
}
