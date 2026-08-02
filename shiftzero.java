public class shiftzero 
{
   
    public void moveZeroes(int[] nums) {

    int i=0;
    int j;

    for(j=0;j<nums.length;j++)
    {
        // if(nums[i]==0 && nums[j]!=0)
        // {
        //     nums[i]=nums[j];
        //     nums[j]=0;
        //     i++;
        // }else if(nums[i]!=0)
        // {
        //     i++;
        // }

        if(nums[j]!=0)
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
        }
    }

    
       
    }

    public static void main(String[] args) {
        
        shiftzero s= new shiftzero();
        int[] a={1,2,0,0,7,5,0};
        s.moveZeroes(a);

        for (int i = 0; i < a.length; i++) 
        {
            System.out.println(a[i]);
            
        }
    }
}
    

