import java.util.*;
/** 
13. Roman to Integer

Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */

public class romanToInteger {

    public int romanToInt(String s) 
    {
        HashMap<Character,Integer> map= new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result=0;

        for(int i=0;i<s.length();i++)
        {
            int current=map.get(s.charAt(i));

            if(i+1<s.length() && current<map.get(s.charAt(i+1)) )
            {
                result-=current;
            }else
            {
                result+=map.get(s.charAt(i));
            }
        }  
        
        return result;
    }

    public static void main(String[] args) {
        
        romanToInteger r= new romanToInteger();

        System.out.println(r.romanToInt("LVIII"));
    }
}