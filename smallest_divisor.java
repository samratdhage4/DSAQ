/*
1283. Find the Smallest Divisor Given a Threshold
Solved
Medium
Topics
premium lock icon
Companies
Hint
Given an array of integers nums and an integer threshold, we will choose a positive integer divisor, divide all the array by it, and sum the division's result. Find the smallest divisor such that the result mentioned above is less than or equal to threshold.

Each result of the division is rounded to the nearest integer greater than or equal to that element. (For example: 7/3 = 3 and 10/2 = 5).

The test cases are generated so that there will be an answer.

 

Example 1:

Input: nums = [1,2,5,9], threshold = 6
Output: 5
Explanation: We can get a sum to 17 (1+2+5+9) if the divisor is 1. 
If the divisor is 4 we can get a sum of 7 (1+1+2+3) and if the divisor is 5 the sum will be 5 (1+1+1+2). 
Example 2:

Input: nums = [44,22,33,11,1], threshold = 5
Output: 44
 
 */
public class smallest_divisor 
{
    int t(int[] nums,int mid)
    {
        int total=0;
        for(int i:nums)
        {
            total+=Math.ceil(i/mid);

        }
        return total;
    }
     public int smallestDivisor(int[] nums, int threshold) 
     {
        int mx=0;

        for(int k:nums)
        {
            mx=Math.max(mx,k);
        }

        int i=1;
        int j=mx;
        int ans=-1;

        while(i<=j)
        {
            int mid=i+(j-i)/2;

            if(t(nums, mid)<=threshold)
            {
                ans=mid;
                j=mid-1;
            }else{
                j=mid-1;

            }

        }


        return ans;
     }
    public static void main(String[] args) {

        smallest_divisor s= new smallest_divisor();

        System.out.println(s.smallestDivisor(new int[]{1,2,5,9}, 5));
        
    }
    
}
