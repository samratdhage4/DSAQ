
/*Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
Example 3:

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
*/
public class merge_sorted {

    void sort(int[] a,int[] b,int n,int m)
    {
        int i=m-1;
        int j=n-1;

        int in =m+n-1;

        while (i>=0 && j>=0) 
        {
            if(a[i]>b[j])
            {
                a[in]=a[i];
                in--;
                i--;
            }else
            {
                a[in]=b[j];
                in--;
                j--;
            }
            
        }

        while (j>=0) 
        {
            a[in]=b[j];
            j--;
            in--;

            
        }
    }


    public static void main(String[] args) {
        
        merge_sorted m=new merge_sorted();

        int[] a={1,2,3,0,0,0};
        int[] b={2,5,6};

        m.sort(a, b, 3, 3);

        for(int i=0;i<6;i++)
        {
            System.out.println(a[i]);
        }
    }
    
}
