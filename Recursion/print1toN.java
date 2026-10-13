import java.io.*;

class print1toN
{
    static void print(int n)
    {
        if(n==0)
            return ;

         print(n-1);

        System.out.println(n);
    }

    public static void main(String[] args) throws Exception {
        
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE NUMBER");
        int n=Integer.parseInt(br.readLine());

        print(n);

    }
}