import java.util.Stack;

/*Infix to Postfix
You are given a string s representing an infix expression. Convert this infix
 expression to a postfix expression.
Infix expression: The expression of the form a op b. When an operator is in between 
every pair of operands.
Postfix expression: The expression of the form a b op. When an operator is followed for 
every pair of operands.
Note: The precedence order is as follows: (^) has the highest precedence and is evaluated
 from right to left, (* and /) come next with left to right associativity, and (+ and -)
have the lowest precedence with left to right associativity.

Examples :

Input: s = "a*(b+c)/d"
Output: abc+*d/
Explanation: The expression is a*(b+c)/d. First, inside the brackets, b+c becomes bc+. 
Now the expression looks like a*(bc+)/d. Next, multiply a with (bc+), so it becomes abc+* . 
Finally, divide this result by d, so it becomes abc+*d/.
Input: s = "a+b*c+d"
Output: abc*+d+
Explanation: The expression a+b*c+d is converted by first doing b*c -> bc*, 
then adding a -> abc*+, and finally adding d -> abc*+d+.
 */
public class InfixToPostfix {

    static  int priority(char c)
    {
        if(c=='+' || c=='-')return 1;
        if(c=='*' || c=='/')return 2;
        if(c=='^')return 3;

        return 0;
    }
    
    static String conversion(String s)
    {
        StringBuilder result= new StringBuilder();
        Stack<Character> stk= new Stack<>();

        for(int i=0;i<s.length();i++){

            char c= s.charAt(i);

            if(Character.isLetterOrDigit(c))
            {
                    result.append(c);
            
            }else if (c=='(') {
                
                stk.push(c);

            }else if(c==')'){

                while (!stk.isEmpty() && stk.peek()!='(') {
                    
                    result.append(stk.pop());
                }
                stk.pop();
            }else{

                  while(!stk.isEmpty() &&stk.peek() != '(' && (priority(c) < priority(stk.peek()) ||
                (priority(c) == priority(stk.peek()) && c != '^')))
                {
                    result.append(stk.pop());
                }
                stk.push(c);
            } 

          
        }
          while (!stk.isEmpty()) {
                result.append(stk.pop());
                
            }


        return result.toString();
    }

    public static void main(String[] args) {
     
       System.out.println( conversion("a*(b+c)/d"));
    }
}