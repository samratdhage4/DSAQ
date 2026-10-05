/*424. Longest Repeating Character Replacement

You are given a string s and an integer k. You can choose any character of the string and
 change it to any other uppercase English character. You can perform this operation at most
 k times.Return the length of the longest substring containing the same letter you can get 
 after performing the above operations.

 

Example 1:
Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.

Example 2:
Input: s = "AABABBA", k = 1
Output: 4
Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.
There may exists other ways to achieve this answer too.
 
Constraints:
1 <= s.length <= 105
s consists of only uppercase English letters.
0 <= k <= s.length */

public class mx_reapeate_str_replacement {
    
    static  public int characterReplacement(String s, int k) {
    
        int[] map= new int[26];
        int mf=0;
        int l=0;
        int mlen=0;
        for(int i=0;i<s.length();i++)
        {
            map[s.charAt(i)-'A']++;
            
            mf=Math.max(mf, map[s.charAt(i)-'A']);
            
            if((i-l+1)-mf>k)
            {
                map[s.charAt(l)-'A']--;
                mf=0;
                l++;
            }

            if((i-l+1)-mf<=k)
            {
                mlen=Math.max(mlen, i-l+1);
            }
        }

        return mlen;
    }

    public static void main(String[] args) {
        
        System.out.println(characterReplacement("ABAB", 2));
        System.out.println(characterReplacement("AABABBA", 1));
    }
}
