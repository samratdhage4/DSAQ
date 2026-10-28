import java.util.ArrayList;
import java.util.List;

/**216. Combination Sum III

Find all valid combinations of k numbers that sum up to n such that the following conditions are true:
Only numbers 1 through 9 are used.
Each number is used at most once.
Return a list of all possible valid combinations. The list must not contain the same combination twice,
and the combinations may be returned in any order.

Example 1:
Input: k = 3, n = 7
Output: [[1,2,4]]
Explanation:
1 + 2 + 4 = 7
There are no other valid combinations.

Example 2:
Input: k = 3, n = 9
Output: [[1,2,6],[1,3,5],[2,3,4]]
Explanation:
1 + 2 + 6 = 9
1 + 3 + 5 = 9
2 + 3 + 4 = 9
There are no other valid combinations.

Example 3:
Input: k = 4, n = 1
Output: []
Explanation: There are no valid combinations.
Using 4 different numbers in the range [1,9], the smallest sum we can get is 1+2+3+4 = 10 and since 10 > 1, 
there are no valid combination.
 
Constraints:
2 <= k <= 9
1 <= n <= 60
*/

public class Combination_Sum_III {

     static void get(List<List<Integer>> ans,List<Integer> list,int i,int sum,int k,int n)
    {
        if(sum==n && list.size()==k )
        {
            ans.add(new ArrayList<>(list));
            return ;
        }

        if(sum>=n || list.size()>=k || i>9)
        {
            return ;
        }

        list.add(i);
        get(ans, list, i+1, sum+i, k, n);
        list.remove(list.size()-1);
        get(ans, list, i+1, sum, k, n);

    }

    
    static public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> list= new ArrayList<>();

        get(ans, list, 1, 0, k, n);
        return ans;

    }

    public static void main(String[] args) {
        
        System.out.println("TEST CASE 1:- "+combinationSum3(3, 7));
        System.out.println("TEST CASE 2:- "+combinationSum3(3, 9));
        
    }
}