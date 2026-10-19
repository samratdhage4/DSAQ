import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
90. Subsets II
Given an integer array nums that may contain duplicates, return all possible subsets (the power set).
The solution set must not contain duplicate subsets. Return the solution in any order.

Example 1:
Input: nums = [1,2,2]
Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]

Example 2:
Input: nums = [0]
Output: [[],[0]]
 
Constraints:
1 <= nums.length <= 10
-10 <= nums[i] <= 10
*/

public class Subset_II {
    
    static void print(List<List<Integer>> ans,List<Integer> list,int[] arr,int i)
    {
        if(i==arr.length)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        
        list.add(arr[i]);
        print(ans, list, arr, i+1);
        list.remove(list.size()-1);
        int idx=i+1;

        while (idx<arr.length && arr[idx-1]==arr[idx]) {
            idx++;    
        }

        print(ans, list, arr, idx);
    }

      static  public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        print(ans, list, nums, 0);
        return ans;        
    }
    public static void main(String[] args) {
        
        System.out.println("TestCase 1:"+subsetsWithDup(new int[]{1,2,2}));
        System.out.println("TestCase 2:"+subsetsWithDup(new int[]{0}));
        System.out.println("TestCase 3:"+subsetsWithDup(new int[]{1,1,1}));
        

    }

}