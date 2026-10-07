import java.util.*;

public class removeDupPairs {

    public static String str(String s)
    {
        Stack<Character> stk= new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);

           if(!stk.isEmpty() && stk.peek()==c)
           {
                stk.pop();
           }else
           {
               stk.push(c);
           }

        }

        StringBuilder res=new StringBuilder();

        for(char c :stk)
        {
            res.append(c);
        }
        

        return res.toString();
    }

    public static void main(String[] args) {
        
        System.out.println(str("LeetCode"));
        System.out.println(str("GeeksForGeeks"));
        
    }
}
