public class ArrayIsSorted {
    
    static boolean isSorted(int[] arr,int n)
    {
        if(n==0 || n==1 ) return true;
        return (arr[n-1]>=arr[n-2]) && (isSorted(arr, n-1)); 
    }

    public static void main(String[] args)
    {
        
        System.out.println(isSorted(new int[]{1,10,2,4,5,}, 5));
    }
}
