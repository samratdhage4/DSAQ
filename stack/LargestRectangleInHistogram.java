import java.util.Stack;
import  java.io.*;
/*
84. Largest Rectangle in Histogram Hard
Given an array of integers heights representing the histogram's bar height where 
the width of each bar is 1, return the area of the largest rectangle in the histogram.

Example 1:
Input: heights = [2,1,5,6,2,3]
Output: 10
Explanation: The above is a histogram where width of each bar is 1.
The largest rectangle is shown in the red area, which has an area = 10 units.

Example 2:
Input: heights = [2,4]
Output: 4
 
Constraints:
1 <= heights.length <= 105
0 <= heights[i] <= 104
*/


public class LargestRectangleInHistogram {

   public static  int area(int[] arr)
   {
        int n=arr.length;
        Stack<Integer> stk= new Stack<>();
        int[] left=new int[n];
        int[] right= new int[n];

        //from right smaller boundary

        for(int i=n-1;i>=0;i--)
        {
            while (!stk.isEmpty() && arr[stk.peek()]>=arr[i] ){
                stk.pop();
            }

            right[i]=stk.isEmpty() ? n :stk.peek();
            stk.push(i);
        }

         //from left smaller boundary

        for(int i=0;i<n;i++)
        {
            while (!stk.isEmpty() && arr[stk.peek()]>=arr[i] ){
                stk.pop();
            }

            left[i]=stk.isEmpty() ? -1 :stk.peek();
            stk.push(i);
        }

        //ACTUAL AREA:
        int ans=0;
        for(int i=0;i<n;i++)
        {
            int h=arr[i];
            int w=right[i]-left[i]-1;
            int curr=h*w;

            ans=Math.max(ans, curr);
        }

        return ans;
   }

   public static void main(String[] args) throws Exception {
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

    System.out.println("ENTER THE HISTOGRAM LENGTH:-");
    int n=Integer.parseInt(br.readLine());
    int[] h= new int[n];
    System.out.println("ENTER THE HISOGRAM HEIGHTS:-");
    for(int i=0;i<n;i++)
    {
        h[i]=Integer.parseInt(br.readLine());
    }

    System.out.println("MAXIMUM AREA OF REACTANGLE:-"+area(h));
   }

    
}