import java.util.Scanner;

public class OddEven {

    static boolean isEven(int n)
    {
        return (n^1)==(n+1);
    }

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTER THE NUMBER:-");
        int x=sc.nextInt();
        boolean res = isEven(x);
        if(!res)
            System.out.println(x+" is ODD");
        else
            System.out.println(x+" is EVEN");
    
        sc.close();
        
    }
    
}
