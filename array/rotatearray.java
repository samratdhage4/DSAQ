public class rotatearray 
{
    /*
    Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
  */


    void rotate(int[] arr,int x)
    {
        int n=arr.length;
        int d=x%n;


        int i=0;
        int j=n-d-1;

        while (i<j) 
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
            
        }

        i=n-d;
        j=n-1;

        while (i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
            
        }


        for(i=0;i<n/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;


        }


        
    }

    public static void main(String[] args) {
        
        rotatearray r= new rotatearray();

        int[] A={1,2,3,4,5,6,7};

        r.rotate(A, 3);


        for(int i:A)
        {
            System.out.println(i);
        }


    }
    
}
