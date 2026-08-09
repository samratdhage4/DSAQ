/*
 Given a sorted array arr[] (following 0-based indexing) and a number target, find the lower bound of the target in this given array. The lower bound of a number is defined as the smallest index in the sorted array where the element is greater than or equal to the given number.

Note: If all the elements in the given array are smaller than the target, the lower bound will be the length of the array. 

Examples :

Input:  arr[] = [2, 3, 7, 10, 11, 11, 25], target = 9
Output: 3
Explanation: 3 is the smallest index in arr[] where element (arr[3] = 10) is greater than or equal to 9.
Input: arr[] = [2, 3, 7, 10, 11, 11, 25], target = 11
Output: 4
Explanation: 4 is the smallest index in arr[] where element (arr[4] = 11) is greater than or equal to 11.
Input: arr[] = [2, 3, 7, 10, 11, 11, 25], target = 100
Output: 7
Explanation: As no element in arr[] is greater than 100, return the length of array
*/ 

public class lower_upper 
{
    int lowerBound(int[] arr, int target) {
        
        int ans=arr.length;
        int i=0;
        int j=ans-1;
        
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            
            if(arr[mid]>=target)
            {
               ans=mid;
                j=mid-1;
            }else
            {
               i=mid+1;
            }
        }
        
        return ans;
    }


    int upperBound(int[] arr, int target) {
        
        int ans=arr.length;
        int i=0;
        int j=ans-1;
        
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            
            if(arr[mid]>target)
            {
               ans=mid;
                j=mid-1;
            }else
            {
               i=mid+1;
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        
        lower_upper s= new lower_upper();

        System.out.println(s.lowerBound(new int[]{1,2,3,4,5}, 0));
        System.out.println(s.upperBound(new int[]{1,2,3,4,5}, 0));
        
    }
}


    
