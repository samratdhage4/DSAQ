/*Given an unsorted array arr containing both positive and negative numbers. Your task is to rearrange the array and convert it into an array of alternate positive and negative numbers without changing the relative order.

Note:

Resulting array should start with a positive integer (0 will also be considered as a positive integer).
If any of the positive or negative integers are exhausted, then add the remaining integers in the answer as it is by maintaining the relative order.
Examples:

Input: arr[] = [9, 4, -2, -1, 5, 0, -5, -3, 2]
Output: [9, -2, 4, -1, 5, -5, 0, -3, 2]
Input: arr[] = [-5, -2, 5, 2, 4, 7, 1, 8, 0, -8]
Output: [5, -5, 2, -2, 4, -8, 7, 1, 8, 0]
Input: arr[] = [9, 5, -2, -1, 5, 0, -5, -3, 2]
Output: [9, -2, 5, -1, 5, -5, 0, -3, 2]
*/

import java.util.ArrayList;

public class alternet_bysign 
{
    void rearrange(ArrayList<Integer> arr) 
    {
        ArrayList<Integer> P= new ArrayList<>();
        ArrayList<Integer> N= new ArrayList<>();

        for(int i=0;i<arr.size();i++)
        {
            int x=arr.get(i);
            if(x>=0)
            {
                P.add(x);
            }else{
                N.add(x);
            }
        }

            int i=0,p=0,n=0;

        while (p<P.size() && n<N.size())
        {
            arr.set(i++, P.get(p++)); //   0 1  .
            arr.set(i++, N.get(n++));
            

        }

        while (p<P.size()) {
            
            arr.set(i++,P.get(p++) );
        }
        
        while (n<N.size()) {
            
            arr.set(i++,N.get(n++) );
        }
        
    }
    
}
