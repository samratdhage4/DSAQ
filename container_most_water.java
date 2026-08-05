
/*11. Container With Most Water
Medium

You are given an integer array height of length n. 
There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and
 (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container
 contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.
Example 1:
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
 In this case, the max area of water (blue section) the container can contain is 49. */

public class container_most_water {

      public int maxArea(int[] height) 
    {
        int n=height.length-1;
        int maxWater=0;

        int i=0,j=n;

        while(i<j)
        {
            int wd=(j-i);
            int maxh=Math.min(height[i],height[j]);
            int current=wd*maxh;
            maxWater = Math.max(maxWater, current);

          if (height[i] > height[j]) 
          {
                j--;
          } else {
                i++;
          }
        }

        
      return maxWater;
        
       
    }
    public static void main(String[] args) {
        container_most_water c= new container_most_water();

         System.out.println(c.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

}
