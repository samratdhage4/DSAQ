import java.util.ArrayList;
import java.util.List;

/*46. Permutations

Given an array nums of distinct integers, return all the possible permutations. 
You can return the answer in any order.
Example 1:
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
Example 2:
Input: nums = [0,1]
Output: [[0,1],[1,0]]
Example 3:
Input: nums = [1]
Output: [[1]]
 
Constraints:
1 <= nums.length <= 6
-10 <= nums[i] <= 10
All the integers of nums are unique. */

public class permutaionOfArray {
    
   static  void swap(int[] arr, int i, int j) {

     int temp=arr[i];
     arr[i] = arr[j];
     arr[j] =   temp;
  }

    static void print(List<List<Integer>> ans, int[] arr,int idx)
    {
        if(idx==arr.length)
        {
            List<Integer> temp= new ArrayList<>();
            for(int i:arr)
            {
                temp.add(i);
            }
            ans.add(temp);
            return ;
        }

        for(int i=idx;i<arr.length;i++)
        {
            swap(arr, idx, i);
            print(ans, arr, idx+1);
            swap(arr, idx, i);
        }
    }
    
     static public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        print(ans,nums,0);

        return ans;
    }

    public static void main(String[] args) {
        
        
        System.out.println("TestCase_1:"+permute(new int[]{1,2,3}));
    }
}
