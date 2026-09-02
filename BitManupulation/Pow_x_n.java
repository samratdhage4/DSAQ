import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
50. Pow(x, n)
Companies
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

 

Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000
Example 2:

Input: x = 2.10000, n = 3
Output: 9.26100
Example 3:

Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25
 

Constraints:

-100.0 < x < 100.0
-231 <= n <= 231-1
n is an integer.
Either x is not zero or n > 0.
-104 <= xn <= 104
 */

public class Pow_x_n 
{
    static double pow(int x,int N)
    {
        long n=N;
        double res=1.0;

        if(n<0) n=-1*n;

        while (n>0) 
        {
            if(n%2==1)
            {
                res*=x;
            }

            x*=x;
            n/=2;
        }

        if(N<0) res=(double)(1.0)/(double)(res);
        return res;
    }

    public static void main(String[] args) throws Exception {
        
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE INPUTS:- ");
        int x = Integer.parseInt(br.readLine());
        int n=Integer.parseInt(br.readLine());

        System.out.println(pow(x, n));

    }
    
}
