import java.util.HashMap;
import  java.util.*;

/*
387. First Unique Character in a String

Given a string s, find the first non-repeating character in it and return 
its index. If it does not exist, return -1.

Example 1:
Input: s = "leetcode"
Output: 0
Explanation:
The character 'l' at index 0 is the first character that does not occur at any other index.

Example 2:
Input: s = "loveleetcode"
Output: 2

Example 3:
Input: s = "aabb"
Output: -1

 

Constraints:
1 <= s.length <= 105
s consists of only lowercase English letters.
 */

public class FirstUniqueElem {
    

    // space- O(1)
    // time - O(n)

    static int uniqueSol1(String s)
    {
        
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            
            if(s.indexOf(c)==s.lastIndexOf(c))
            {
                return i;
            }
        }
        return -1;
    }

    //space- O(n)
    //time -O(n)

    static int uniqueSol2(String s)
    {
        HashMap<Character,Integer> map =new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c, 0)+1);
        }

        for(int i=0;i<s.length();i++)
        {
               char c=s.charAt(i);
            if(map.get(c)==1)
            {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {

        Scanner sc= new  Scanner(System.in);

        String s= sc.nextLine();
        sc.close();

        System.out.println(uniqueSol1(s));
        System.out.println(uniqueSol2(s));

       
    }

}
