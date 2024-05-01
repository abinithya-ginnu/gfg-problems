/*
Given a string in roman no format (s)  your task is to convert it to an integer . Various symbols and their values are given below.
I 1
V 5
X 10
L 50
C 100
D 500
M 1000

Example 1:

Input:
s = V
Output: 5
Example 2:

Input:
s = III 
Output: 3
Your Task:
Complete the function romanToDecimal() which takes a string as input parameter and returns the equivalent decimal number. 

Expected Time Complexity: O(|S|), |S| = length of string S.
Expected Auxiliary Space: O(1)

Constraints:
1<=roman no range<=3999
*/

//Solution:

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        Map<Character, Integer> dict = new HashMap<>();
        dict.put('I', 1);
        dict.put('V', 5);
        dict.put('X', 10);
        dict.put('L', 50);
        dict.put('C', 100);
        dict.put('D', 500);
        dict.put('M', 1000); 
        int output = 0;
        for(int i = str.length()-1; i >= 0; i--){
            if(i == str.length()-1){
                output += dict.get(str.charAt(i));
            }
            else{
                if(dict.get(str.charAt(i)) < dict.get(str.charAt(i+1))){
                    output -= dict.get(str.charAt(i));
                }
                else{
                    output += dict.get(str.charAt(i)); 
                }
            }
        }  
        return output; 
    }
}
