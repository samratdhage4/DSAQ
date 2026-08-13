
import java.util.Arrays;
/*
567. Permutation in String
Solved
Medium
Topics
premium lock icon
Companies
Hint
Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.

 

Example 1:

Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").
Example 2:

Input: s1 = "ab", s2 = "eidboaoo"
Output: false
 
*/

public class Permutation {

      public boolean checkInclusion(String s1, String s2) 
    {
         if (s1.length() > s2.length()) {
            return false;
        }

        int[]  f1= new int[26];

        for(int i=0;i<s1.length();i++)
        {
            f1[s1.charAt(i)-'a']++;
        }


        int Wsize=s1.length();
        
      for(int i=0;i<s2.length();i++)
      {

        int windex=0;
        int curr=i;
        int[] f2= new int[26];

        while(windex<Wsize && curr<s2.length())
        {
            f2[s2.charAt(curr)-'a']++;
            windex++;
            curr++;

        }

        if(Arrays.equals(f1,f2))return true;
      }
        return false;
    } 

    public static void main(String[] args) {
      Permutation p= new Permutation();

      System.out.println(p.checkInclusion("ab", "eidbaooo"));
    }
    
}
