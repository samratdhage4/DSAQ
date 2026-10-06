import java.util.HashMap;
/*930. Binary Subarrays With Sum
Given a binary array nums and an integer goal, return the number of non-empty subarrays
with a sum goal.
A subarray is a contiguous part of the array.

Example 1:
Input: nums = [1,0,1,0,1], goal = 2
Output: 4
Explanation: The 4 subarrays are bolded and underlined below:
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]

Example 2:
Input: nums = [0,0,0,0,0], goal = 0
Output: 15

Constraints:
1 <= nums.length <= 3 * 104
nums[i] is either 0 or 1.
0 <= goal <= nums.length */



public class Binary_Subarrays_With_Sum {

    //Brute Forece 

    static int mxSA(int[] arr,int k)
    {
        int count=0;

        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=i;j<arr.length;j++)
            {
                sum+=arr[j];

                if(sum==k)
                {
                    count++;
                }else if(sum>k)
                {
                    break;
                }
            }
        }
        return count;
    }


    //BETTER APROACh
    static int mxArr(int[] arr,int k)
    {
       int count=0;
       int sum=0;
       HashMap<Integer,Integer> map= new HashMap<>();
       map.put(0, 1);
       for(int i:arr)
       {
            sum+=i;

            if(map.containsKey(sum-k))
            {
                count+=map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
       }
       return count;
    }

    //OPTIMAL SOLUTION
    // Reduced Extra O(N) space  

   static  int all(int[] arr,int k)
   {
        if(k<0) return 0;
        int count=0;
        int sum=0;
        int l=0;

        for(int r=0;r<arr.length;r++)
        {
            sum+=arr[r];

            while (l<arr.length && sum>k) {
                sum-=arr[l++];

            }
            count+=(r-l+1);
        }
        return count;
   }

    static int maxSubaarays(int[] nums,int goal)
    {
        return all(nums, goal)-all(nums, goal-1);
    }

    


    public  void main(String[] args) {
        
        System.out.println(mxArr(new int[]{1,0,1,0,1}, 2));
        System.out.println(mxArr(new int[]{1,0,1,0,1}, 2));
        System.out.println(maxSubaarays(new int[]{1,0,1,0,1}, 2));

        System.out.println(mxSA(new int[] {0,0,0,0,0}, 0));
        System.out.println(mxArr(new int[]{0,0,0,0,0}, 0));
        System.out.println(maxSubaarays(new int[] {0,0,0,0,0}, 0));
    }

    
}
