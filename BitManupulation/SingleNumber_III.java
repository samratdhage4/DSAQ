import java.util.Scanner;

/*
260. Single Number III

Given an integer array nums, in which exactly two elements appear only once and all the other
elements appear exactly twice. Find the two elements that appear only once. You can return the 
answer in any order.

You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.

 

Example 1:

Input: nums = [1,2,1,3,2,5]
Output: [3,5]
Explanation:  [5, 3] is also a valid answer.
Example 2:

Input: nums = [-1,0]
Output: [-1,0]
Example 3:

Input: nums = [0,1]
Output: [1,0]
 

Constraints:

2 <= nums.length <= 3 * 104
-231 <= nums[i] <= 231 - 1
Each integer in nums will appear twice, only two integers will appear once.
 */

//USING HASHMAP

  //    HashMap<Integer,Integer> map= new HashMap<>();

    //    int[] x= new int[2];

    //    for(int i:nums)
    //    {
    //      map.put(i,map.getOrDefault(i,0)+1);
    //    }
    //     int j=0;
    //    for(int i:nums)
    //    {
    //         if(map.get(i)==1)
    //         {
    //             x[j++]=i;
    //         }
    //    }

    //    return x;

public class SingleNumber_III 
{
    static int[] singleNo(int[] nums)
    {
        int[] res= new int[2];
        int xor=0;

        for(int i:nums)
        {
            xor^=i;
        }

        int rightMostSetBit=xor & (-xor);
       // int rightMostSetBit = xor & (~(xor-1));

       for(int i:nums)
       {
            if((i & rightMostSetBit) ==0)
            {
                res[0]^=i;
            }else
            {
                res[1]^=i;
            }
         
       }
        
       return res;
    } 
    

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the array size:");
        int n=sc.nextInt();
        int[] nums= new int[n];
        System.out.println("enter the array elements:");
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }

        int[] res=singleNo(nums);

        System.out.println(res[0] +" "+res[1]);

        // int x=5;

        // System.out.println((x & (-x)));
        // System.out.println((x & (~(x-1))));

        sc.close();
    }
}
