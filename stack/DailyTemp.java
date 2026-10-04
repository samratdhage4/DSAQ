import java.util.*;
/*739. Daily Temperatures
Given an array of integers temperatures represents the daily temperatures,
return an array answer such that answer[i] is the number of days you have to wait a
fter the ith day to get a warmer temperature. If there is no future day for which
this is possible, keep answer[i] == 0 instead.

 Example 1:
Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]

Example 2:
Input: temperatures = [30,40,50,60]
Output: [1,1,1,0]

Example 3:
Input: temperatures = [30,60,90]
Output: [1,1,0]
 
Constraints:
1 <= temperatures.length <= 105
30 <= temperatures[i] <= 100 */

/**
 * DailyTemp
 */
public class DailyTemp {

    static int[] temp(int[] arr)
    {
        Stack<Integer> stk= new Stack<>();
        int[] ans= new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            while (!stk.isEmpty() && arr[stk.peek()]<arr[i]) {
                
                int index=stk.pop();
                ans[index]=i-index;
            }
            stk.push(i);
        }
        return ans;
    } 

    public static void main(String[] args) {

        int[] ans= temp(new int[]{73,74,75,71,69,72,76,73});
        for(int i:ans)
        {
            System.out.println(i);
        }
        

    }
}