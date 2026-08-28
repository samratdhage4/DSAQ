import java.util.*;
/*
191. Number of 1 Bits
Solved
Easy
Topics
premium lock icon
Companies
Given a positive integer n, write a function that returns the number of set bits in its binary representation (also known as the Hamming weight).

Example 1:
Input: n = 11
Output: 3
Explanation:
The input binary string 1011 has a total of three set bits.

Example 2:
Input: n = 128
Output: 1
Explanation:
The input binary string 10000000 has a total of one set bit.

Example 3:
Input: n = 2147483645
Output: 30
Explanation:
The input binary string 1111111111111111111111111111101 has a total of thirty set bits.
*/

public class countBit 
{
    static int aproach1(int n)
    {
        int count=0;

        while (n>1)
        {
            int bit=n%2;
            if(bit==1)
                count++;

            n=n/2;
            
        }
        if(n==1)count++;


        return count;
    }

    static int aproach2(int n)
    {
        int count=0;

        while (n >1)
        {
            count+=n&1;
            n=n>>1;
    
        }

        if(n==1)count++;
        return count;
    }
    static int aproach3(int n)
    {
        int count=0;

        while (n!=0) 
        {
            n=n&n-1;
            count++;
            
        }
        return count;
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("ENTER THE NUMBER:-");
        int x=sc.nextInt();

        int res1=aproach1(x);
        int res2=aproach2(x);
        int res3=aproach3(x);

        System.out.println("APROACH 1:-"+res1);
        System.out.println("APROACH 2:-"+res2);
        System.out.println("APROACH 3:-"+res3);
        
        sc.close();
    }
    
}
