import java.util.Arrays;
/*
    Aggressive Cows
Solved
Difficulty: MediumAccuracy: 59.57%Submissions: 243K+Points: 4Average Time: 30m
Given an integer array arr[], which denotes the positions of stalls. All the positions 
are distinct. There are k aggressive cows.

Assign the cows to the stalls such that the minimum distance between any two cows is maximized.

Examples:

Input: arr[] = [1, 2, 4, 8, 9], k = 3
Output: 3
Explanation: The first cow can be placed at arr[0], the second at arr[2], 
and the third at arr[3]. The minimum distance between any two cows is 3 
(between arr[0] and arr[2]), which is the maximum possible among all valid arrangements.
Input: arr[] = [10, 1, 2, 7, 5], k = 3
Output: 4
Explanation: The first cow can be placed at arr[0], the second at arr[1], 
and the third at arr[4]. In this arrangement, the minimum distance between any two cows is 4
 (between arr[1] and arr[4]), which is the maximum possible among all valid arrangements.
*/

public class agressiveCows 
{

    boolean ispossible(int[] arr,int mid,int k)
    {
        int cows=1;
        int prev=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]-prev>=mid)
            {
                cows++;
                prev=arr[i];

                if(cows==k)
                {
                    return true;
                }
            }
        }
        return false;
    }

    int minDistacnce(int[] arr,int k)
    {
        Arrays.sort(arr);
        int i=1; int j=arr[arr.length-1]-arr[0];
        int ans=-1;

        while (i<=j) 
        {
            int mid=i+(j-i)/2;

            if(ispossible(arr, mid, k))
            {
                ans=mid;
                i=mid+1;

            }else
            {
                j=mid-1;

            }
            
        }

        return ans;
    }
    public static void main(String[] args) {
        
        agressiveCows a= new agressiveCows();

        System.out.println(a.minDistacnce(new int[] {10, 1, 2, 7, 5}, 3));
    }

    
}
