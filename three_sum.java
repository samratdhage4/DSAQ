import java.util.ArrayList;
import java.util.Arrays;

/*Three Sum
Solved
Difficulty: MediumAccuracy: 51.43%Submissions: 9K+Points: 4
Given an integer array arr, return all the unique triplets [arr[i], arr[j], arr[k]] such that i != j, i != k, and j != k, and arr[i] + arr[j] + arr[k] == 0.

Note: The triplets must be returned in sorted order, the solution vector should also be sorted, and the answer must not contain any duplicate triplets.

Examples:

Input: arr = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: arr[0] + arr[1] + arr[2] = (-1) + 0 + 1 = 0.
arr[1] + arr[2] + arr[4] = 0 + 1 + (-1) = 0.
arr[0] + arr[3] + arr[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Input: arr = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0
 */
public class three_sum 
{
    public static ArrayList<ArrayList<Integer>> triplets(int[] arr) {
    
        Arrays.sort(arr);
        int n=arr.length;
        ArrayList<ArrayList<Integer>> result= new ArrayList<>();
        
        for(int i=0;i<n-2;i++)
        {
            if(i>0 && arr[i]==arr[i-1])
                continue;
            
            int j=i+1;
            int k=n-1;
            
            while(j<k)
            {
                int sum=arr[i]+arr[j]+arr[k];
                
                if(sum==0)
                {
                    ArrayList<Integer> temp=new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[k]);
                    
                    result.add(temp);
                    j++;
                    k--;
                    
                    
                    while(j<k && arr[j]==arr[j-1])
                    {
                        j++;
                    }
                    while(j<k && arr[k]==arr[k+1])
                    {
                        k--;
                    }
                    
                }else if(sum<0)
                {
                    j++;
                }else
                {
                    k--;
                }
            }
            
        }
        
        return result;
    }
}

    
