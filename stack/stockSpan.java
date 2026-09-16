import java.util.ArrayList;
import java.util.Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 Stock Span Problem
Solved
Difficulty: MediumAccuracy: 43.56%Submissions: 280K+Points: 4
The stock span problem is a financial problem where we have a series of daily price quotes
 for a stock and we need to calculate the span of stock price for all days.

Given an array arr[] representing daily stock prices, the stock span for the i-th day is the
 number of consecutive days up to day i (including day i itself) for which the price of the
  stock is less than or equal to the price on day i. Return the span of stock prices for 
  each day in the given sequence.

Examples:

Input: arr[] = [100, 80, 90, 120]
Output: [1, 1, 2, 4]
Explanation: Consider each day one by one:
Day 1 (100): Span = 1.
Day 2 (80): Span = 1 because the previous price (100) is greater than 80.
Day 3 (90): Span = 2 because 80 ≤ 90, but 100 > 90.
Day 4 (120): Span = 4 because 100, 80, and 90 are all less than or equal to 120.
Hence, the output is [1, 1, 2, 4].

Input: arr[] = [10, 4, 5, 90, 120, 80]
Output: [1, 1, 2, 4, 5, 1]
Explanation: Consider each day one by one:
Day 1 (10): Span = 1.
Day 2 (4): Span = 1 because the previous price (10) is greater than 4.
Day 3 (5): Span = 2 because 4 ≤ 5, but 10 > 5.
Day 4 (90): Span = 4 because 10, 4, and 5 are all less than or equal to 90.
Day 5 (120): Span = 5 because all previous prices are less than or equal to 120.
Day 6 (80): Span = 1 because the previous price (120) is greater than 80.
Hence, the output is [1, 1, 2, 4, 5, 1].

Constraints:
1 ≤ arr.size(), arr[i] ≤ 105

Expected Complexities
Time Complexity: O(n)
Auxiliary Space: O(n)
 */

// class leetCode
// {
   
//     int i;
//     Stack<Pair<Integer,Integer>> stk;

//     public StockSpanner() {
//         stk=new Stack<>();
//         i=0;
//     }
    
//     public int next(int price) {
        
        

//         while(!stk.isEmpty() && stk.peek().getKey()<=price)
//         {
//             stk.pop();
//         }

//         int ans;

//         if(stk.isEmpty())
//             ans=i+1;
//         else
//             ans=i-stk.peek().getValue();
        

//         stk.push(new Pair<>(price,i));
//         i+=1;

//         return ans;     


// }
 public class stockSpan  { //extends  leetCode{

    //GFG Practice

    static ArrayList<Integer> next(int[] arr)
    {
        ArrayList<Integer> res= new ArrayList<>();
        Stack<Integer> stk= new Stack<>();

        for(int i=0;i<arr.length;i++)
        {
            while (!stk.isEmpty() && arr[stk.peek()]<=arr[i]) {
                stk.pop();
            }

            if(stk.isEmpty())
            {
                res.add(i+1);
            }else{
                res.add(i-stk.peek());
            }

            stk.push(i);
        }

        return res;
    }



    public static void main(String[] args) throws Exception {
        
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the test cases");
        int T=Integer.parseInt(br.readLine());

        while (T-->0) {

            System.out.println("Enter the stock day:");
            int n=Integer.parseInt(br.readLine());

            int[] in= new int[n];
            System.out.println("Enter the Stock prices:");
            for(int i=0;i<n;i++)
            {
                in[i]=Integer.parseInt(br.readLine());
            }

            System.out.println(next(in));
            
        }
     
        

    }

}