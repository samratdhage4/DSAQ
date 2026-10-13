import java.io.*;

public class ArrayIsSorted {
    
    static boolean isSorted(int[] arr,int n)
    {
        if(n==0 || n==1 ) return true;
        return (arr[n-1]>=arr[n-2]) && (isSorted(arr, n-1)); 
    }

    public static void main(String[] args) throws Exception
    {        
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
         System.out.print("Enter array size: ");
        int n = Integer.parseInt(br.readLine());


        int[] arr= new int[n];
        String[] s= br.readLine().trim().split("\\s+");

        for(int i=0;i<s.length;i++)
        {
            arr[i]=Integer.parseInt(s[i]);
        }
        
        System.out.println("Is array sorted? "+ isSorted(arr, arr.length));
    }
}
