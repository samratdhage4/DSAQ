/*
14. Longest Common Prefix
Solved
Easy
Topics
premium lock icon
Companies
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
*/
public class longcommonpref {
    
    public String longestCommonPrefix(String[] strs) 
    {
        String str="";
        if(strs.length==0) return str;

        String base=strs[0];
        if(base.length()==0) return str;

        for(int i=1;i<strs.length;i++)
        {
            String temp=strs[i];
            
          int j = 0;

            while (j < base.length() &&
                   j < temp.length() &&
                   base.charAt(j) == temp.charAt(j)) {
                j++;
            }

            base = base.substring(0, j);


        }
      return base;
    }
        
    }
