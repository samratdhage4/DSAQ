import java.util.ArrayList;
import java.util.List;
/*78. Subsets
Given an integer array nums of unique elements, return all possible subsets (the power set).
The solution set must not contain duplicate subsets. Return the solution in any order.

Example 1:
Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

Example 2:
Input: nums = [0]
Output: [[],[0]]

Constraints:
1 <= nums.length <= 10
-10 <= nums[i] <= 10
All the numbers of nums are unique. */

public class subset_I {

    
    static void set(int[] arr,List<Integer> list,int i,List<List<Integer>> ans)
    {
            if(i==arr.length)
            {
                ans.add(new ArrayList<>(list));
                return;
            }


            list.add(arr[i]);
            set(arr, list, i+1, ans);
            list.remove(list.size()-1);
            set(arr, list, i+1, ans);
    }

    public static void main(String[] args) {
        
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        int[] arr={1,2,3};

        set(arr, list, 0, ans);
        System.out.println(ans);
        
    }
    
}
