import java.util.Stack;
import java.io.BufferedReader;
import  java.io.InputStreamReader;
/*

Code
Testcase
Testcase
Test Result
32. Longest Valid Parentheses

Given a string containing just the characters '(' and ')', return the length of the longest 
valid (well-formed) parentheses substring.

Example 1:
Input: s = "(()"
Output: 2
Explanation: The longest valid parentheses substring is "()".

Example 2:
Input: s = ")()())"
Output: 4
Explanation: The longest valid parentheses substring is "()()".

Example 3:
Input: s = ""
Output: 0
 */
public class LongestValidParantheses {

    public static int result(String s)
    {
        Stack<Integer> stk= new Stack<>();
        stk.push(-1);
        int res=0;
    
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);

            if(c=='(')
            {
                stk.push(i);
            }else
            {
                stk.pop();

                if(stk.isEmpty())
                {
                    stk.push(i);
                }else
                {
                    res=Math.max(res, i-stk.peek());
                }
            }
        }

        return res;
    }

    public static void main(String[] args) throws Exception {
        
       

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    
        String s= String.valueOf(br.readLine());

        System.out.println("MAXIMUM LONGEST VALID PARANTHESIS:-"+result(s));
    }
    
}
