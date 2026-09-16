import java.io.*;

/*
input =" samrat dhage"
output ="DHAGE"

input="samrat"
output="LESS"
*/

public class secondWordCapital {
    
    static String second(String s)
    {
        s=s.trim();
        if(s.length()==0)return "LESS";

        String[] word= s.split("\\s+");

        if(word.length<2)
        {
            return "LESS";
        }

        String res=word[1];

        return res.toUpperCase();
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the test Cases:-");
        int t=Integer.valueOf(br.readLine());
        
        while (t-->0) {
            System.out.println("Enter the String:");    
            System.out.println(second(String.valueOf(br.readLine())));
        }

        br.close();
        

    }
}
