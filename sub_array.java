/*Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

 

Example 1:

Input: nums = [1,1,1], k = 2
Output: 2
Example 2:

Input: nums = [1,2,3], k = 3
Output: 2 */

import java.util.HashMap;

public class sub_array 
{
    int sub(int[] arr,int k)
    {
        int i;
        int count=0;//calculate how many subarrays sum=k

        //prefix sum calculation 
        //adding backs elemnt total in nows array 

        int[] pf=new int[arr.length];

        pf[0]=arr[0];

        for(i=1;i<arr.length;i++)
        {
            pf[i]=pf[i-1]+arr[i];
        }
        //calculated prefix sum of all values

        HashMap<Integer,Integer> map=new HashMap<>();

        map.put(0, 1);

        for(i=0;i<arr.length;i++)
        {
            if(map.containsKey(pf[i]-k))
            {
                count+=map.get(pf[i]-k);
            }

            map.put(pf[i], map.getOrDefault(pf[i],0)+1);
        }


        return count;




    }

    public static void main(String[] args) {
        
        int[] a={1,1,1};

        sub_array s= new sub_array();

        System.out.println(s.sub(a, 2));
    }
    
}
