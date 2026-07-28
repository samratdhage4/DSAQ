public class array
{
    // largest element in array

    int large(int[] arr)
    {

        int large=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>large)
            {
                large=arr[i];
            }
        }


        return large;

    }

    // second largest

    int slarge(int[] a)
    {
        int large=a[0];
        int slarge=-1;

        for(int i=1;i<a.length;i++)
        {
            if(a[i]>large)
            {
                slarge=large;
                large=a[i];
            }else if(a[i]<large && a[i]>slarge)
            {
                slarge=a[i];
            }
        }

        return slarge;
    }


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

        System.out.println(a.large(nums1));
        System.out.println(a.slarge(nums1));

    }
    
}
