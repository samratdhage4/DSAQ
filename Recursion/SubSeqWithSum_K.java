/*Subsequence with Sum K
Given an array arr[] and target sum k, check if there exists a subsequence such that 
the sum of all elements in the subsequence equals to k.

Examples:
Input: arr = [10, 1, 2, 7, 6, 1, 5], k = 8.
Output: true
Explanation: Subsequences like [2, 6], [1, 7] sum upto 8

Input: arr = [2, 3, 5, 7, 9], k = 100. 
Output: false
Explanation: No subsequence can sum upto 100
Constraints:

1 ≤ k, arr.size() ≤ 2000
1 ≤ arr[i] ≤ 1000
*/

public class SubSeqWithSum_K {

    static boolean check(int[] arr,int k,int i,int sum)
    {
        if(sum==k)
        {
            return true;
        }

        if(i==arr.length)
        {
            return false;
        }

        if(check(arr, k, i+1, sum+arr[i]))
        {
            return true;
        }

        if(check(arr, k, i+1, sum))
        {
            return true;
        }

        return false;
    }

    static int countSub(int[] arr,int k,int i,int sum)
    {
        if(arr.length==i)
        {
            return 0;
        }

        if(sum==k)
        {
            return 1;
        }

        int left=countSub(arr, k, i+1, sum+arr[i]);
        int right=countSub(arr, k, i+1, sum);

        return left+right;
    }

     static public boolean checkSubsequenceSum(int[] arr, int k) {
        
        return check(arr,k,0,0);
    
    }  
    static public int countSubans(int[] arr, int k) {
        
        return countSub(arr, k, 0, 0);
    
    }  
    
    
    public static void main(String[] args) {
        

        System.out.println("T_1:-"+checkSubsequenceSum(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
        System.out.println("T_2:-"+checkSubsequenceSum(new int[]{2, 3, 5, 7, 9}, 100));

        System.out.println("Count subSqs");
          System.out.println("T_1:-"+countSubans(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
        System.out.println("T_2:-"+countSubans(new int[]{2, 3, 5, 7, 9}, 100));
        
    }
    
}
