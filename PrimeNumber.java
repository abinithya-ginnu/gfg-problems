/*
For a given number N check if it is prime or not. A prime number is a number which is only divisible by 1 and itself.
 

Example 1:

Input:
N = 5
Output:
1
Explanation:
5 has 2 factors 1 and 5 only.
Example 2:

Input:
N = 25
Output:
0
Explanation:
25 has 3 factors 1, 5, 25

Your Task:
You don't need to read input or print anything. Your task is to complete the function isPrime() which takes an integer N as input parameters and returns an integer, 1 if N is a prime number or 0 otherwise.
 

Expected Time Complexity: O(sqrt(N))
Expected Space Complexity: O(1)
 

Constraints:
1 <= N <= 109
*/

// Solution:

class Solution{
    static int isPrime(int N){
        // code here
        int count = 0;
        for(int i = 1; i <= N; i++){
            if(N % i == 0){
                count++;
            }
            if(count > 2){
                return 0;
            }
        }
        if(count == 2){
            return 1;
        } 
        return 0;
    }
}
