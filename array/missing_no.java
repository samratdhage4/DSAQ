public class missing_no 
{
     public int missingNumber(int[] nums) 
    {

        int a=0;
        int b=0;


        for(int i=0;i<nums.length;i++)
        {
            a^=(i+1);
            b^=nums[i];
        }


        return a^b;

    }

     public int findMaxConsecutiveOnes(int[] nums) 
    {
        int c=0;
        int m=0;
        for(int i=0;i<nums.length;i++)
        {    if(nums[i]==1 )
                {
                    c++;
                    m=Math.max(c,m);
                }else{
                    c=0;
                }
        }
        return m;
    }


    public static void main(String[] args) {
        
        missing_no m=new missing_no();

        int[] a={1,2,4,5};

        System.out.println(m.missingNumber(a));
    }
    
}
