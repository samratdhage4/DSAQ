/*1358. Number of Substrings Containing All Three Characters
Given a string s consisting only of characters a, b and c.
Return the number of substrings containing at least one occurrence of all these 
characters a, b and c.

Example 1:
Input: s = "abcabc"
Output: 10
Explanation: The substrings containing at least one occurrence of the characters a, b 
and c are "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" 
(again). 

Example 2:
Input: s = "aaacb"
Output: 3
Explanation: The substrings containing at least one occurrence of the characters a, b and c 
are "aaacb", "aacb" and "acb". 

Example 3:
Input: s = "abc"
Output: 1
 
Constraints:
3 <= s.length <= 5 x 104
s only consists of 'a', 'b' or 'c' characters. */

public class mxStrContainAllChar {

    static int longest(String s)
    {
        int mx=0;
        int[] arr={-1,-1,-1};

        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']=i;

            if(arr[0]!=-1 && arr[1]!=-1 && arr[2]!=-1)
            {
                int min=Math.min(arr[0],arr[1]);
                min=Math.min(arr[2], min);

                mx+=1+min;
            }
            
        }
        return mx;
    }
    public static void main(String[] args) {
        
        System.out.println(longest("abcabc"));
    }
    
}
