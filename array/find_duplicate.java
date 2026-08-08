public class find_duplicate 
{
    int dup(int[] a)
    {
        int slow=a[0];
        int fast=a[0];

        do
        {
            slow=a[slow];
            fast=a[a[fast]];
            
        }while(slow!=fast);

        fast=a[0];

        while (slow!=fast) 
        {
            slow=a[slow];
            fast=a[fast];
            
        }


        return slow;
    }


    public static void main(String[] args) 
    {
        find_duplicate d= new find_duplicate();

        int[] a={1,2,2,3,4,5,6};

        System.out.println(d.dup(a));
        
    }
    
}
