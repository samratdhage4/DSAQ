import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
238. Product of Array Except Self
Solved
Medium
Topics
premium lock icon
Companies
Hint
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 

Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.
 

Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)
*/
public class ExceptSelfOfProduct {
    
    public static  int[] productExceptSelf(int[] nums) {

       int[] res= new int[nums.length];
       int prefix=1;

        for(int i=0;i<nums.length;i++)
        {
            res[i]=prefix;
            prefix*=nums[i];
        }

        int suffix=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            res[i]*=suffix;
            suffix*=nums[i];
        }

        return res;
    }


    public static void main(String args[]) throws Exception
    {   

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter The Array Size:");
        int n=Integer.valueOf(br.readLine());

        int[] arr= new int[n];

        System.out.println("ENTER THE ARRAY ELEMENTS:");
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.valueOf(br.readLine());
        }


        int[] res= productExceptSelf(arr);

        System.out.println("BEFORE:-");
        
        for(int i:arr)
        {
            System.out.print(i +" ");
        }

        System.out.println("\nAFTER PRODUCT:-");

        for(int i:res)
        {
            System.out.print(i+" ");
        }

        br.close();

    }
}
