import java.util.HashSet;

/**
 * longestconsecutive
 * 128. Longest Consecutive Sequence
Solved
Medium
Topics
premium lock icon
Companies
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

 

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
Example 3:

Input: nums = [1,0,1,2]
Output: 3
 
 */
public class longestconsecutive {

      public int longestConsecutive(int[] nums) 
    {
        if(nums.length==0) return 0;
        int l=1;
          
        HashSet<Integer> A= new HashSet<>();

        for(int i=0;i<nums.length;i++)
        {
            A.add(nums[i]);
        }


        for(int i:nums)
        {
              int c=1;
            if(!A.contains(i-1))
            {
                int x=i;
              
                while (A.contains(x+1)) 
                {
                    c++;
                    x++;
                    
                }
            }

            l=Math.max(c, l);
        }


        return l;

    }

    public static void main(String[] args) {
        longestconsecutive l= new longestconsecutive();

        System.out.println(l.longestConsecutive(new int[] {100,4,200,1,3,2}));
    }
}