import java.util.ArrayList;
import java.util.List;
/*
118. Pascal's Triangle
Solved
Easy
Topics
premium lock icon
Companies
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly 
above it as shown:

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]] 
*/

public class pascleTrangle {

    private List<Integer> rows(int row)
    {
        List<Integer> R=new ArrayList<>();
        int ans=1;
        R.add(ans);

        for(int col=1;col<row;col++)
        {
            ans*=(row-col);
            ans/=col;
            R.add(ans);
        }

        return R;
    }

      public List<List<Integer>> generate(int numRows) 
    {
       List<List<Integer>> A= new ArrayList<>();

       for(int row=1;row<=numRows;row++)
       {
            A.add(rows(row));
       }
        return A;
    }

    public static void main(String[] args) {
        
        pascleTrangle p=new pascleTrangle();
        System.out.println(p.generate(5));
    }
    
}
