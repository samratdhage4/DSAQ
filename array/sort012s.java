/**
 * leet code 75
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
 */
public class sort012s {

   /*   the bruite force:
    public void sortColors(int[] nums) 
    {
       int red=0;
       int white=0;
       int blue=0;
       int i;


       for( i=0;i<nums.length;i++)
       {
            if(nums[i]==0)
            {
                red++;
            }else if(nums[i]==1)
            {
                white++;
            }else
            {
                blue++;
            }
       }


         i=0;
       while(i<red)
       {
            nums[i]=0;
            i++;
       }

       while(i<red+white)
       {
        nums[i]=1;
        i++;
       }

       while(i<nums.length)
       {
            nums[i]=2;
        i++;
       }


    } */

       public void sortColors(int[] nums) 
       {
            int low=0;
            int mid=0;
            int high=nums.length-1;


            while (mid<high)
            {
                if(nums[mid]==0)
                {
                    int temp=nums[mid];
                    nums[mid]=nums[low];
                    nums[low]=temp;

                    mid++;
                    low++;

                }else if(nums[mid]==1)
                {
                    mid++;
                    low++;
                    
                }else if(nums[mid]==2)
                {
                    int temp=nums[mid];
                    nums[mid]=nums[high];
                    nums[high]=temp;

                    high--;
                    mid++;

                }
                
            }

       }

       public static void main(String[] args) 
       {

            sort012s s= new sort012s();

            int[] a={2,0,2,1,1,0};

            s.sortColors(a);

            for(int i:a)
            {
                System.out.println(i);
            }
        
       }



}
