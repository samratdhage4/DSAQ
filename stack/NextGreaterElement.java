import java.util.HashMap;
import java.util.Stack;

/**
496. Next Greater Element I

The next greater element of some element x in an array is the first greater
 element that is to the right of x in the same array.
You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is
a subset of nums2.
For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and 
determine the next greater element of nums2[j] in nums2. If there is no next greater 
element, then the answer for this query is -1.
Return an array ans of length nums1.length such that ans[i] is the next greater element 
as described above.

Example 1:
Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
Output: [-1,3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
- 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
- 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.

Example 2:
Input: nums1 = [2,4], nums2 = [1,2,3,4]
Output: [3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 2 is underlined in nums2 = [1,2,3,4]. The next greater element is 3.
- 4 is underlined in nums2 = [1,2,3,4]. There is no next greater element, so the answer is -1.
 */

public class NextGreaterElement {

     public static  int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> stk= new Stack<>();
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=nums2.length-1;i>=0;i--)
        {
            while(!stk.isEmpty() && nums2[i]>stk.peek())
            {
               stk.pop();
            }

            if(stk.isEmpty())
            {
                map.put(nums2[i],-1);   
            }else
            {
                map.put(nums2[i],stk.peek());   
            }

            stk.push(nums2[i]);
        }
        
        int[] ans= new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
                ans[i]=map.get(nums1[i]);
        }

        return ans;
    }

    
    public  static  int[] element(int[] arr)
    {
        Stack<Integer> stk= new Stack<>();
        int[] res= new int[arr.length];

        for(int i=arr.length-1;i>=0;i--)
        {
            while (!stk.isEmpty() && stk.peek()<=arr[i]) {
                stk.pop();
            }

            if(stk.isEmpty()){
                res[i]=-1;

            }else{
                res[i]=stk.peek();
            }

            stk.push(arr[i]);
        }

        return res;
    } 

    public static void main(String[] args) {
        
        int[] ans= element(new int[]{ 1,2,3,4,5,6});

        System.out.print("GFG:- [ ");
        for(int i:ans)
        {
            System.out.print(i+" ");
        }
        System.out.print("]\n");


        int[] ans2=nextGreaterElement(new int[]{1,2},new int[]{1,2,-1,4,3});

        System.out.print("\nLEETCODE:-[ ");
        for(int i:ans2)
        {
            System.out.print(i+" ");
        }
            System.out.print("]\n ");
    }
}