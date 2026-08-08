import java.util.HashMap;

/*Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1] */

public class twosum
{
    void sum(int[] nums,int target)
    {
        HashMap<Integer,Integer> map=new HashMap<>();

    
        
        

        for(int i=0;i<nums.length;i++)
        {
            int comp=target-nums[i];

            if(map.containsKey(comp))
            {
                System.out.println( map.get(comp)+" "+i);
            }

            map.put(nums[i], i);
        }


        


    }


    public static void main(String args[])
    {
        twosum t=new twosum();

        int[] a={3,3};


      t.sum(a, 6);

    }
    
}
