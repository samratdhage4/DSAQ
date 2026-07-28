public class array
{

    /*
            cheack arr is sorted or not
            [3,4,5,1,2] = true;
     */
    boolean  arrsort(int[] arr)
    {
        int count=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                count++;
            }

            if(arr[0]<arr[arr.length-1])
            {
                count++;
            }


            
        }

         return count<=1; 



    }


    public static void main(String[] args) {
        
        array a=new array();

        int[] nums={3,4,5,1,2};
        int[] nums1={3,4,5,1,8};

        System.out.println(a.arrsort(nums));

        System.out.println(a.arrsort(nums1));

    }
    
}
