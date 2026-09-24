import java.io.*;;
/*
1004. Max Consecutive Ones III
Given a binary array nums and an integer k, return the maximum number of 
consecutive 1's in the array if you can flip at most k 0's.

Example 1:
Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

Example 2:Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 
Constraints:
1 <= nums.length <= 105
nums[i] is either 0 or 1.
0 <= k <= nums.length
*/

public class MaxConsOnes_III {

    static int maxones(int[] arr,int k)
    {
        int res=0;

        int l=0;
        int z=0;

        for(int r=0;r<arr.length;r++)
        {
            if(arr[r]==0)
            {
                z++;
            }

            if(z>k)
            {
                if(arr[l]==0)
                    z--;
                l++;
            }

            res=Math.max(res, r-l+1);   
        }
        return res;
    }

    public static void main(String[] args) throws Exception{

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        System.out.println("ENTER THE TEST CASES:");
        int t= Integer.valueOf(br.readLine());

        while (t-->0) {
            
            System.out.println("ENTER THE ARRAY SIZE:");
            int n=Integer.valueOf(br.readLine());

            int[] arr= new int[n];

            System.out.println("ENTER THE Kth SIZE:-");
            int k=Integer.valueOf(br.readLine());

            System.out.println("THE MAX LEN OF CONSECUTIVE ONES IS "+maxones(arr, k));


        }
        br.close();
     
    }
    
}
