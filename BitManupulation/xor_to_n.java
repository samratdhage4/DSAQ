import java.io.BufferedReader;
import java.io.InputStreamReader;

public class xor_to_n 
{
    //LeetCode
    public static int xor(int start,int n)
    {
        int res=0;

        for(int i=0;i<n;i++)
        {
            res^=start+i*2;

        }

        return res;
    }

    //GFG

    static int res(int n)
    {
        if(n%4==0) return n;
        if(n%4==1) return 1;
        if(n%4==2) return n+1;

        return 0;

    }
     static int rangeXor(int s,int e)
    {
        return res(e) ^res(s);

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter start: ");
        int start = Integer.parseInt(br.readLine());

        System.out.print("Enter n: ");
        int n = Integer.parseInt(br.readLine());

        System.out.println("LeetCode XOR: " + xor(start, n));

        System.out.print("Enter range start: ");
        int s = Integer.parseInt(br.readLine());

        System.out.print("Enter range end: ");
        int e = Integer.parseInt(br.readLine());

        System.out.println("Range XOR: " + rangeXor(s, e));
    }
}
