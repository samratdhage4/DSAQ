import java.util.Stack;

/*
20. Valid Parentheses
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

Example 4:
Input: s = "([])"
Output: true

Example 5:
Input: s = "([)]"
Output: false
 

Constraints:
1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
 */

public class balancedParantheses {
    
    public static boolean res(String s)
    {
        Stack<Character> stk= new Stack<>();

        for(char c : s.toCharArray())
        {
            if(c=='{' || c=='(' || c=='[')
            {
                stk.push(c);
            }else 
            {
                if(stk.isEmpty())
                    return  false;
                
                char d=stk.pop();

                if(d !='{' && c=='}')
                {
                    return  false;
                
                }else if(d !='[' && c==']')
                {
                    return  false;
                
                }else if(d !='(' && c==')')
                {
                    return  false;
                }
            }
        }

        return stk.isEmpty();
    }

    public static void main(String[] args) {
        
        System.out.println(res("((())"));
    }
}
