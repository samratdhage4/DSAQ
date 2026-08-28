import java.util.Scanner;

public class isPowOfTwo 
{
    static boolean isPow(int x)
    {
        return (x & x-1)==0;
    }

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.out.println("ENTER THE NUBER:");
        int x=sc.nextInt();

        boolean res=isPow(x);

        if(res)
        {
            System.out.println(x+" is power of 2");
            
        }else
        {
            System.out.println(x+" is not power of 2");
            
        }

        sc.close();
    }
    
}
