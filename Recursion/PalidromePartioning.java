/*131. Palindrome Partitioning

Given a string s, partition s such that every substring of the partition is a palindrome. 
Return all possible palindrome partitioning of s.

Example 1:
Input: s = "aab"
Output: [["a","a","b"],["aa","b"]]

Example 2:
Input: s = "a"
Output: [["a"]]
 
Constraints:
1 <= s.length <= 16
s contains only lowercase English letters. */

import java.util.ArrayList;
import java.util.List;

public class PalidromePartioning {

   static  boolean isPalidrome(String s)
    {
        StringBuilder res=new StringBuilder(s);
        
        return s.equals(res.reverse().toString());
    }

    static void set( List<List<String>> ans,List<String> list, String s)
    {

        if(s.length()==0)
        {
            ans.add(new ArrayList<>(list));
            return ;
        }


        for(int i=0;i<s.length();i++)
        {
            String part= s.substring(0,i+1);

            if(isPalidrome(part))
            {
                list.add(part);
                set(ans, list, s.substring(i+1));
                list.remove(list.size()-1);
            }
        }
    }

    static  public List<List<String>> partition(String s) {

        List<List<String>> ans= new ArrayList<>();
        List<String> list= new ArrayList<>();

        set(ans,list,s);
        return ans;

        
    }
    public static void main(String[] args) {
        

        System.out.println("Test Case 1:"+partition("aab"));
        System.out.println("Test Case 2:"+partition("a"));
        
    }
    



}
