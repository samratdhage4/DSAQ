import java.util.ArrayList;

/*39. Combination Sum
Given an array of distinct integers candidates and a target integer target, 
return a list of all unique combinations of candidates where the chosen numbers 
sum to target. You may return the combinations in any order.
The same number may be chosen from candidates an unlimited number of times. 
Two combinations are unique if the frequency of at least one of the chosen numbers 
is different.
The test cases are generated such that the number of unique combinations that sum up to 
target is less than 150 combinations for the given input.

Example 1:
Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.

Example 2:
Input: candidates = [2,3,5], target = 8
Output: [[2,2,2,2],[2,3,3],[3,5]]

Example 3:
Input: candidates = [2], target = 1
Output: []
 
Constraints:
1 <= candidates.length <= 30
2 <= candidates[i] <= 40
All elements of candidates are distinct.
1 <= target <= 40 */

public class Combination_sum_I {
    
   static  void set(ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> list,int[] arr,int idx,int sum,int k)
    {
        if(sum==k)
        {
            ans.add(new ArrayList<>(list));
            return ;
        }

        if (sum>k || idx==arr.length) {
            return ;
        }

        for(int i=idx;i<arr.length;i++)
        {
            list.add(arr[i]);
            set(ans, list, arr, i, sum+arr[i], k);
            list.remove(list.size()-1);
        }
    }

    static  public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {

     ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
     ArrayList<Integer> list= new ArrayList<>();

     set(ans,list,candidates,0,0,target);
     return ans;

    }

    public static void main(String[] args) {

        System.out.println("TestCase 1:"+combinationSum(new int[]{2,3,6,7}, 7));
        System.out.println("TestCase 2:"+combinationSum(new int[]{2,3,5}, 8));
        
        
    }


}
