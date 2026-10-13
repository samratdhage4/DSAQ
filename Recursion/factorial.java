import java.io.*;

public class factorial {
    
    static int fact(int n)
    {
        if(n==0 || n==1) return 1;

        return n*fact(n-1);
    }

    public static void main(String[] args) throws Exception {
        
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the TestCase:-");

        int T=Integer.parseInt(br.readLine());
    
        while (T-->0) {        
        System.out.println("\nEnter the Number:-");
        int n=Integer.valueOf(br.readLine());
        System.out.println("Factorial Of "+n+" "+fact(n));
        }
    }
}
