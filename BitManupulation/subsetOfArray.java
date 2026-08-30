import java.util.*;
/*
78. Subsets
premium lock icon
Companies
Given an integer array nums of unique elements, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

 

Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]]
 */

public class subsetOfArray 
{
    static ArrayList<ArrayList<Integer>> subsets(int[] arr)
    {
        ArrayList<ArrayList<Integer>> result= new ArrayList<>();

        int s=1<<arr.length;

        for(int i=0;i<s;i++)
        {
            ArrayList<Integer> temp=new ArrayList<>();

            for(int j=0;j<arr.length;j++)
            {
                if((i & (1<<j))!=0)
                {
                    temp.add(arr[j]);
                }
            }

            result.add(temp);
        }
        return result;
    }

    public static void main(String[] args) {
        
        ArrayList<ArrayList<Integer>> res= subsets( new int[] {1,2,3});

        for(int i=0;i<res.size();i++)
        {
            for(int j=0;j<res.get(i).size();j++)
            {
                System.out.print(res.get(i).get(j)+" ");
            }

            System.out.println("");
        }

    }
    
}
