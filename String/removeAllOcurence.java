/*
Remove all occurrences of a character in a string
Solved
Difficulty: EasyAccuracy: 62.51%Submissions: 8K+Points: 2Average Time: 10m
Given a string s and a character c. The task is to remove all the occurrences of the character in the string.

Examples:

Input: s = "geeksforgeeks", c = 'e'
Output: s = "gksforgks"
Input: s = "geeksforgeeks", c = 'g'
Output: s = "eeksforeeks" */
public class removeAllOcurence {
    
    // Function to remove all occurrences of the character from the string
    public void removeCharacter(StringBuilder s, char c) {
        // code here
        
        // String part= Character.toString(c);
        
        // while(s.contains(part))
        // {
        //     s=s.replaceFirst(part,"");
        // }
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c)
            {
                s.deleteCharAt(i);
                i--;
            }
        }
    }
}