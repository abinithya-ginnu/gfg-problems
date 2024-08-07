/*
Given a string S. For each index i(1<=i<=N-1), erase it if s[i] is equal to s[i-1] in the string.

Example 1:

Input:
S = aabb
Output:  ab 
Explanation: 'a' at 2nd position is
appearing 2nd time consecutively.
Similiar explanation for b at
4th position.

Example 2:

Input:
S = aabaa
Output:  aba
Explanation: 'a' at 2nd position is
appearing 2nd time consecutively.
'a' at fifth position is appearing
2nd time consecutively.
 

Your Task:
You dont need to read input or print anything. Complete the function removeConsecutiveCharacter() which accepts a string as input parameter and returns modified string.
 

Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(|S|).
 

Constraints:
1<=|S|<=105
All characters are lowercase alphabets.
*/

//Solution:

class Solution{
    public String removeConsecutiveCharacter(String S){
        char ref = S.charAt(0);
        String output = String.valueOf(ref);
        int length = S.length();
        int i = 1;
        while (i < S.length()) {
            if (S.charAt(i) == ref) {
                i++;
            } else {
                output += String.valueOf(S.charAt(i));
                ref = S.charAt(i);
                i++;
            }
        }
        return output;
    }
}
