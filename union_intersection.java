import java.util.ArrayList;

public class union_intersection {

  //intersection of two arrays;
    static ArrayList<Integer> intersection(int arr1[], int arr2[]) 
    {
        
        int i=0;
        int j=0;
        
        ArrayList<Integer> A= new ArrayList<>();
        
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]==arr2[j])
            {
                if(A.isEmpty() || A.get(A.size()-1)!=arr1   [i])
                A.add(arr1[i]);
                i++;
                j++;
                
            }else if(arr1[i]<arr2[j])
            {
                i++;
            }else
            {
                j++;
            }
            
            
            
        }
        
        
        return A;
        
       
        
    }


    //union of 2 arrays


     public static ArrayList<Integer> findUnion(int a[], int b[]) 
    {

        int i=0;
        int j=0;

        ArrayList<Integer> A= new ArrayList<>();

        while (i<a.length && j<b.length)
        {
            if(a[i]<b[j])
            {
                if(A.isEmpty()|| A.get(A.size()-1)!=a[i])
                {
                    A.add(a[i]);
                }
                i++;
            }else if(a[i]>b[j])
            {
                if(A.isEmpty()|| A.get(A.size()-1)!=b[j])
                {
                    A.add(b[j]);
                }
                j++;
            }else 
            {
                if(A.isEmpty()|| A.get(A.size()-1)!=a[i])
                {
                    A.add(a[i]);
                }

                i++;
                j++;
            }


            while (i<a.length) 
            {
                if(A.isEmpty()|| A.get(A.size()-1)!=a[i])
                {
                    A.add(a[i]);
                }
                i++;
                
            }
            while (i<b.length) 
            {
                if(A.isEmpty()|| A.get(A.size()-1)!=b[j])
                {
                    A.add(b[j]);
                }
                j++;
                
            }
            
        }

        return A;
    }



    public static void main(String[] args) {
        
        union_intersection a=new union_intersection();

        int[] s={1,2,3,4,5,5,5};
        int[] p={1,2,3,4,4};


        System.out.println(a.findUnion(s, p));
        System.out.println(a.intersection(s, p));
    }
}

    

