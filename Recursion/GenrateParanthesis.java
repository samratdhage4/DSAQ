import java.util.ArrayList;
import java.util.List;

/*
22. Generate Parentheses

Given n pairs of parentheses, write a function to generate all combinations of 
well-formed parentheses.
Example 1:
Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]

Example 2:
Input: n = 1
Output: ["()"]
 
Constraints:
1 <= n <= 8 */

public class GenrateParanthesis {
    
    static void print(List<String> ans,StringBuilder s,int open,int close,int n)
    {
        if(s.length()==2*n)
        {
            ans.add(s.toString());
            return ;
        }

        if (open<n) {
            
            s.append("(");
            print(ans, s, open+1, close, n);
            s.deleteCharAt(s.length()-1);
        }
        
        if (close<open) {
            
            s.append(")");
            print(ans, s, open, close+1, n);
            s.deleteCharAt(s.length()-1);
        }
    }

    static List<String> generateParenthesis(int n)
    {
        StringBuilder s= new StringBuilder();
        List<String> list= new ArrayList<>();

        print(list, s, 0, 0, n);

        return list;
    }

    public static void main(String[] args) {
        
        System.out.println("TestCase_1:-"+generateParenthesis(3));
        System.out.println("TestCase_2:-"+generateParenthesis(1));
    }
}
