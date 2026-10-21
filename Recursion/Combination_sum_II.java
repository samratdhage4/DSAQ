import java.util.ArrayList;
import java.util.Arrays;

/*40. Combination Sum II

Given a collection of candidate numbers (candidates) and a target number (target), find all unique 
combinations in candidates where the candidate numbers sum to target.
Each number in candidates may only be used once in the combination.
Note: The solution set must not contain duplicate combinations.

 
Example 1:
Input: candidates = [10,1,2,7,6,1,5], target = 8
Output: 
[[1,1,6],[1,2,5],[1,7],[2,6]]

Example 2:
Input: candidates = [2,5,2,1,2], target = 5
Output: 
[[1,2,2],[5]]
 

Constraints:
1 <= candidates.length <= 100
1 <= candidates[i] <= 50
1 <= target <= 30 */


public class Combination_sum_II {
    
    static  void set(ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> list,int[] arr,int i,int sum,int k)
    {
        if(sum==k)
        {
            ans.add(new ArrayList<>(list));
            return ;
        }

        if (sum>k || i==arr.length) {
            return ;
        }

        
        list.add(arr[i]);
        set(ans, list, arr, i+1, sum+arr[i], k);
        list.remove(list.size()-1);

        int idx=i+1;

        while (idx<arr.length && arr[idx-1]==arr[idx]) {
            
            idx++;
        }

        set(ans, list, arr, idx, sum, k);
    }

    
    static public ArrayList<ArrayList<Integer>> combinationSum2(int[] candidates, int target) {
        

        Arrays.sort(candidates);
        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
        ArrayList<Integer> list= new ArrayList<>();

       set(ans, list, candidates, 0, 0, target);

        return ans;
    }

    public static void main(String[] args) {
        
        
        System.out.println("Test Case 1:"+combinationSum2( new int[]{10,1,2,7,6,1,5}, 8));
        System.out.println("Test Case 2:"+combinationSum2( new int[]{2,5,2,1,2}, 5));
        
    }
}
