/*42. Trapping Rain Water
Solved
Hard
Topics
premium lock icon
Companies
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

 

Example 1:


Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
Example 2:

Input: height = [4,2,0,3,2,5]
Output: 9
 */
public class trappingwater 
{
    public int water(int[] height)
    {
        int total=0;


        int lmax=height[0];
        int rmax=height[height.length-1];

        int i=0;
        int j=height.length-1;

        while(i<j)
        {
            if(lmax<=rmax)
            {
                lmax=Math.max(lmax, height[i]);
                total+=lmax-height[i];
                i++;

            }else{
                rmax=Math.max(rmax, height[j]);
                total+=rmax-height[j];
                j--;


            }
        }


        return total;
    }


    public static void main(String[] args) {
        trappingwater t= new trappingwater();

        System.out.println(t.water(new int[]{4,2,0,3,2,5}));
    }
    
}
