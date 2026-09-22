import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LongSumLessK {
    
   static  int longest(int[] arr,int k)
   {

        int l=0;
        int r=0;
        int maxLen=0;
        int sum=0;

        while (r<arr.length) {
            
            sum+=arr[r];

            if(sum>k)
            {
                sum-=arr[l++];
            }

            if(sum<=k)
            {
                maxLen=Math.max(maxLen, r-l+1);
            }
            r++;
        }
        return maxLen;
   }  
   
   public static void main(String args[]) throws Exception
   {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter test case:");
        int T=Integer.valueOf(br.readLine());

        while (T-->0) {

            System.out.println("Enter The Array Length:-");
            int n = Integer.valueOf(br.readLine());
            System.out.println("Enter The Window Size:-");
            int k = Integer.valueOf(br.readLine());

            
            int[] arr = new int[n];
            System.out.println("Enter the Array Elemet:-");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.valueOf(br.readLine());
            }

            System.out.println("Maximum Window Size Of Sum <= "+k+" Is "+longest(arr, k));
        }
        


            
   }
}
