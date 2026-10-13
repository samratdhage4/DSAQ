import java.util.Scanner;

public class Nth_fibonacci {
    
    static int fibb(int n)
    {
        if(n==0) return 0;
        if(n==1) return 1;

        return fibb(n-1)+fibb(n-2);
    }

    static int fibb2(int n)
    {
         if(n==0) return 0;
        if(n==1) return 1;

        int a=0;
        int b=1;
        for(int i=2;i<=n;i++)
        {
            int c=a+b;
            a=b;
            b=c;
        }
        return b;

    }
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        int n=sc.nextInt();
        System.out.println("By Recursion \n  Nth pos of ans in sereis "+fibb(n-1));
        System.out.println("By Loop \n Nth pos of ans in sereis "+fibb(n-1));
        
        sc.close();

    }
}
