import java.util.ArrayList;
// import java.util.HashMap;
import java.util.List;

/*229. Majority Element II
Given an integer array of size n, find all elements that appear more than ⌊n / 3⌋ times.

 

Example 1:

Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]
Example 3:

Input: nums = [1,2]
Output: [1,2]
 

Constraints:

1 <= nums.length <= 5 * 104
-109 <= nums[i] <= 109 */



public class majority_II{
    
    //  public List<Integer> majorityElement(int[] nums) 
    // {
    //     HashMap<Integer,Integer> map=new HashMap<>();
    //     List<Integer> A= new ArrayList<>();

    //     int min=1+nums.length/3;

    //     for(int i:nums)
    //     {
    //         map.put(i,map.getOrDefault(i,0)+1);

    //          if(map.get(i)==min )
    //         {
                  
    //             A.add(i);
    //         }
    //         if(A.size()==2) break;

    //     }
    //     return A;
    // }

    public List<Integer> majorityElement(int[] nums)
    {
        List<Integer> result=new ArrayList<>();
        int count1=0; int count2=0;
        int candidate1=0; int candidate2=0;


        for(int num:nums)
        {
            if(candidate2!=num && count1==0)
            {
                candidate1=num;
                count1=1;

            }else if(candidate1!=num && count2==0)
            {
                candidate2=num;
                count2=1;

            }else if(candidate1==num)
            {
                count1++;
            }else if(candidate2==num)
            {
                count2++;
            }else {
                count1--;
                count2--;
            }

        }

        int thread=(int)(nums.length/3)+1;

        count1=0;
        count2=0;
        for(int num:nums)
        {
            if(num==candidate1) count1++;
            if(num==candidate2) count2++;
            
        }

        if(count1>=thread && candidate1!=candidate2) result.add(candidate1);
        if(count2>=thread ) result.add(candidate2);

        return result;
    } 

    public static void main(String[] args) {
        
        majority_II m= new majority_II();

        System.out.println(m.majorityElement(new int[] {3,2,3}));
    }
    

    
}
