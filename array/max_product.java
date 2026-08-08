/*152. Maximum Product Subarray
Solved
Medium
Topics
premium lock icon
Companies
Given an integer array nums, find a subarray that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.

Note that the product of an array with a single element is the value of that element.

 

Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray. */
public class max_product 
{

    public int max(int[] arr)
    {
        int ans=Integer.MIN_VALUE;
        int pf=1;
        int sf=1;
        int n=arr.length;
        

        for(int i=0;i<n;i++)
        {
            if(pf==0) pf=1;
            if(sf==0) sf=1;

            pf*=arr[i];
            sf*=arr[n-i-1];

            ans=Math.max(ans, Math.max(pf, sf));
        }

        return ans;
    }


    public static void main(String[] args) {
        
        max_product m= new max_product();

        int[] a ={2,3,-2,4};

        System.out.println(m.max(a));
    }
    
}
