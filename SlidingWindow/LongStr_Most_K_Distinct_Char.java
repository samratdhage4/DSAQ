import java.util.HashMap;
/*Longest Substring with K Uniques
Solved
Difficulty: MediumAccuracy: 34.65%Submissions: 343K+Points: 4
You are given a string s consisting only lowercase alphabets and an integer k. Your
task is to find the length of the longest substring that contains exactly k distinct 
characters.

Note : If no such substring exists, return -1. 

Examples:

Input: s = "aabacbebebe", k = 3
Output: 7
Explanation: The longest substring with exactly 3 distinct characters is "cbebebe",
 which includes 'c', 'b', and 'e'.
Input: s = "aaaa", k = 2
Output: -1
Explanation: There's no substring with 2 distinct characters.
Input: s = "aabaaab", k = 2
Output: 7
Explanation: The entire string "aabaaab" has exactly 2 unique characters 'a' and 'b',
 making it the longest valid substring.
Constraints:

1 ≤ s.size() ≤ 105
1 ≤ k ≤ 26
 */
public class LongStr_Most_K_Distinct_Char {

     public static  int longestKSubstr(String s, int k) {
       
      HashMap<Character,Integer> map= new HashMap<>();
       int len=-1;
       int l=0;
    
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);

            if(map.size()>k)
            {
                char a=s.charAt(l);
                map.put(a,map.getOrDefault(a,0)-1);
                if(map.get(a)==0)
                {
                    map.remove(a);
                }
                l++;
            }
              if(map.size()==k)
            {
                len=Math.max(len,i-l+1);
            }
        }

        return len;

    }

    public static void main(String[] args) {
        

        System.out.println(longestKSubstr("aaaaa", 2));
    }
    
}