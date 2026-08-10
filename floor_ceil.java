/*
floor is nothing but lower bound  
0 1 2 3 4 5 6 7 8 9
*/

public class floor_ceil 
{
    private int floor(int[] arr,int x)
    {
        int i=0;
        int j=arr.length-1;
        int ans=-1;

        while(i<=j)
        {
            int mid=i+(j-i)/2;

            if(arr[mid]<=x)
            {
                ans=mid;
                i=mid+1;
            }else
                {
                j=mid-1;
            }
        }

        return ans;
    }
    
    private int ceil(int[] arr,int x)
    {
        int i=0;
        int j=arr.length-1;
        int ans=-1;

        while(i<=j)
        {
            int mid=i+(j-i)/2;

            if(arr[mid]>=x)
            {
                ans=mid;
                j=mid-1;
            }else{
                i=mid+1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        
        floor_ceil s=new floor_ceil();

        System.out.println(s.floor(new int[] {0,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,6,7,8,9}, 1));
        System.out.println(s.ceil(new int[] {0,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,6,7,8,9},  1));
        
    }
    
}
