/*3. Longest Substring Without Repeating Characters

Given a string s, find the length of the longest substring without duplicate characters.

Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are
 also correct answers.

 Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

import java.util.HashMap;

public class LongSubStringWithoutCharacter {

    static int substr(String s)
    {
        HashMap<Character,Integer> map= new HashMap<>();
        int l=0;
        int mx=0;

        for(int r=0;r<s.length();r++)
        {
            char ch=s.charAt(r);

            if(map.containsKey(ch))
            {
                l=Math.max(l, map.get(ch)+1);
            }

            map.put(ch,r);
            mx=Math.max(mx,r-l+1);

        }

        return mx;
    }

    
    public static void main(String[] args) {
        
        System.out.println(substr("abcabcbb"));
    }
    

}
