import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/*
239. Sliding Window Maximum
Solved
Hard
Topics
premium lock icon
Companies
Hint
You are given an array of integers nums, there is a sliding window of size k which
 is moving from the very left of the array to the very right. You can only see the k 
numbers in the window. Each time the sliding window moves right by one position.

Return the max sliding window.

Example 1:
Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
Explanation: 
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7

 Example 2:
Input: nums = [1], k = 1
Output: [1]
 

Constraints:
1 <= nums.length <= 10^5
-104 <= nums[i] <= 10^4
1 <= k <= nums.length
 */

public class MaxInKthSWindow {

    static ArrayList<Integer> window(int[] arr,int k)
    {
        Deque<Integer> q= new LinkedList<>();
        ArrayList<Integer> res= new ArrayList<>();

        for(int i=0;i<arr.length;i++)
        {
            //checking the element is of curr window
            while (!q.isEmpty() && q.peekFirst()<=i-k) {
                q.pollFirst();
            }

            //checking the q cointaining small elements
            while (!q.isEmpty() && arr[q.peekLast()]<=arr[i]) {
                q.pollLast();
            }
            q.offerLast(i);

            if(i>=k-1)
            {
                res.add(arr[q.peekFirst()]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        
        System.out.println(window(new int[]{1,3,-1,-3,5,3,6,7}, 3));
    }
}
