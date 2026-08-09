/*
33. Search in Rotated Sorted Array
Solved
Medium
Topics
premium lock icon
Companies
There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly left rotated at an unknown index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1 
*/

public class search_in_roteted {

    boolean seach(int[] arr,int T)
    {
        int i=0;
        int j=arr.length-1;
        int mid;

        while (i<=j) 
        {
            mid=i+(j-i)/2;

            if(arr[mid]==T)
            {
                return true;
            
            } 
             if(arr[i]<=arr[mid])
            {
                if(arr[mid]>=T && arr[i]<=T)
                {
                    j=mid-1;
                }else
                {
                    i=mid+1;

                }
                
            }else
            {
                if(arr[j]>=T && arr[mid]<=T)
                {
                    i=mid+1;
                }else
                {
                    j=mid-1;
                }
            }
            
        }
        return false;
    }

    public static void main(String[] args) {
        
        search_in_roteted s= new search_in_roteted();

        System.out.println(s.seach(new int[] {4,5,6,7,0,1,2}, 3));
    }

    
}
