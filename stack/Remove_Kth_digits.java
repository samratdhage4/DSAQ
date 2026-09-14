import java.util.Stack;

/*
402. Remove K Digits
Solved
Medium
Topics
premium lock icon
Companies
Given string num representing a non-negative integer num, and an integer k, 
return the smallest possible integer after removing k digits from num.

 

Example 1:

Input: num = "1432219", k = 3
Output: "1219"
Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which 
is the smallest.
Example 2:

Input: num = "10200", k = 1
Output: "200"
Explanation: Remove the leading 1 and the number is 200. Note that the output must not 
contain leading zeroes.
Example 3:

Input: num = "10", k = 2
Output: "0"
Explanation: Remove all the digits from the number and it is left with nothing which is 0.
 

Constraints:

1 <= k <= num.length <= 105
num consists of only digits.
num does not have any leading zeros except for the zero itself.
 */

public class Remove_Kth_digits {

    public static String remove (String s,int k)
    {
        if(k==s.length())return "0";

        Stack<Character> stk= new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);

            while (!stk.isEmpty() && k>0 && c<stk.peek()) {
                stk.pop();
                k--;
            }

            stk.push(c);
            
        }

        while (k-->0) {
            stk.pop();
        }

        StringBuilder res= new StringBuilder();

        while (!stk.isEmpty()) {
            res.append(stk.pop());
        }
        int d=0;
        while (d<res.length() && res.charAt(d)=='0') {
            d++;
        }

        if(d==res.length())return "0";

        return res.substring(d).toString();
        
    }

    public static void main(String[] args) {
        
        System.out.println(remove("1002001", 3));
    }
    
}
