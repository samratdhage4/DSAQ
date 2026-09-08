import  java.util.*;
/*
503. Next Greater Element II
Solved
Medium
Topics
premium lock icon
Companies
Given a circular integer array nums (i.e., the next element of nums[nums.length - 1] is 
nums[0]), 
return the next greater number for every element in nums.

The next greater number of a number x is the first greater number to its traversing-order
 next in the array,
 which means you could search circularly to find its next greater number. If it doesn'
 t exist, return -1 for this number.

 

Example 1:

Input: nums = [1,2,1]
Output: [2,-1,2]
Explanation: The first 1's next greater number is 2; 
The number 2 can't find next greater number. 
The second 1's next greater number needs to search circularly, which is also 2.
Example 2:

Input: nums = [1,2,3,4,3]
Output: [2,3,4,-1,4]
 

Constraints:

1 <= nums.length <= 104
-109 <= nums[i] <= 109
 */
public class NextGreaterElement_II 
{
    public  static  int[] element(int[] arr)
    {
        Stack<Integer> stk= new Stack<>();
        int[] ans= new int[arr.length];
        int n=arr.length;

        for(int i=2*n-1;i>=0;i--)
        {
            int index=i%n;
            int curr= arr[index];
            while (!stk.isEmpty() && stk.peek()<=curr) {
                stk.pop();
            }

            ans[index]=stk.isEmpty() ? -1 :stk.peek();
            stk.push(curr);
        }
        return ans;
    } 

    public static void main(String[] args) {
        
        int[] ans= element(new int[]{1,4,3});


        System.out.print("[1,4,3]=[");

        for(int i:ans)
        {
            System.out.print(i+",");
        }
        System.out.print("]");
    }
    
}
