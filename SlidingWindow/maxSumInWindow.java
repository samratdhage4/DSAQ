import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * maxSumInWindow
 * 
 * arr [1 2 3 4 5],  k=2
 * -> 9
 * 
 */
public class maxSumInWindow {

    static int sum(int[] arr, int k) {
        int maxSum = 0;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        maxSum = sum;
        int left = 0;
        int right = k;

        while (right < arr.length) {

            sum -= arr[left++];
            sum += arr[right++];

            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter The Test Cases");
        int T = Integer.valueOf(br.readLine());

        while (T-- > 0) {

            System.out.println("Enter The Array Length:-");
            int n = Integer.valueOf(br.readLine());
            System.out.println("Enter The Window Size:-");
            int k = Integer.valueOf(br.readLine());

            int[] arr = new int[n];
            System.out.println("Enter the Array Elemet:-");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.valueOf(br.readLine());
            }

            int sum = sum(arr, k);
            System.out.println("Max Sum in Window:");
            System.out.println(sum);
        }
    }
}