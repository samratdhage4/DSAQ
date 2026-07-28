import java.util.ArrayList;

/*Input: arr[] = [2, 2, 2, 2, 2]
Output: [2]
Explanation: All the elements are 2, So only keep one instance of 2.

Input: arr[] = [1, 2, 2, 3, 4, 4, 4, 5, 5]
Output: [1, 2, 3, 4, 5]

Input: arr[] = [1, 2, 3]
Output: [1, 2, 3] */

public class removedup 
{

    ArrayList<Integer> dup(int[] arr)
    {
        ArrayList<Integer> A= new ArrayList<>();

        int i=0;
        int j;

        A.add(arr[0]);

        for(j=1;j<arr.length;j++)
        {
            if(arr[i]!=arr[j])
            {
                i++;
                A.add(arr[j]);
                
                arr[i]=arr[j];

            }
        }

        return A;
        
    }

    public static void main(String[] args) {
        
        removedup r= new removedup();

        int[] a={1, 2, 2, 3, 4, 4, 4, 5, 5};

        System.out.println(r.dup(a));


    }
    
}
