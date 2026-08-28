import java.util.*;

/*
Unset Kth Bit
Solved
Difficulty: BasicAccuracy: 48.37%Submissions: 21K+Points: 1
Given two numbers n and k, change the kth bit (1-based indexing, 
counted from the left) of n's binary representation to 0 if it is currently 1.

No changes is made in the following cases:

If kth bit is already 0
k exceeds the total number of bits in n
Examples:

Input: n = 13, k = 2
Output: 9
Explanation: Binary representation of 13 is 1101. the 2nd bit from the left is 1,
 so it becomes 0, giving 1001 = 9.
Input: n = 13, k = 6
Output: 13
Explanation: Binary representation of 13 is 1101, which only has 4 bits. 
there's no 6th bit from the left, so n is returned unchanged.
Constraints:
1 ≤ n ≤ 106
1 ≤ k ≤ 20

*/
public class clear_ith_bit 
{
    static int clear(int n,int k)
    {
        int bits=Integer.toBinaryString(n).length();

        int pos=bits-k;

        return n & ~(1<<pos);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("ENTER THE NUMBER AND Kth INDEX FROM LEFT:");
        int n=sc.nextInt();
        int k=sc.nextInt();

        int res=clear(n, k);

        System.out.println("AFTER CLEAR BITS:-"+res);
        sc.close();
    }
    
}
