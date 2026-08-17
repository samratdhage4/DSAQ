/*
8. String to Integer (atoi)
Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.
Whitespace: Ignore any leading whitespace (" ").
Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity if neither present.
Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain in the range. Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.
Return the integer as the final result.

 

Example 1:
Input: s = "42"
Output: 42

Example 2:
Input: s = " -042"
Output: -42

Example 3:
Input: s = "1337c0d3"
Output: 1337


*/

public class strToInt {
    
      public int myAtoi(String s) 
    {
       
        s= s.trim();
         if (s.length() == 0) {
            return 0;
        }

        int i=0;
        int sign=1;

        if(s.charAt(i)=='-')
        {
            sign=-1;
            i++;
        }else if(s.charAt(i)=='+')
        {
            i++;
        }

        int res=0;

        while (i<s.length() && (s.charAt(i)>='0' && s.charAt(i)<='9'))
        {

            if(res>Integer.MAX_VALUE/10 ||( res==Integer.MAX_VALUE/10 && s.charAt(i)>'7'))
            {
                if(sign<0)
                {
                    return Integer.MIN_VALUE;
                }else
                {
                    return Integer.MAX_VALUE;
                }
            }

            int digit=(s.charAt(i) - '0');

            res = res * 10 + digit;
                 i++;

        }

        return res*sign;

    }

    public static void main(String[] args) {
        
        strToInt s= new strToInt();

        System.out.println(s.myAtoi("-1337c0d3"));
    }
}
