import  java.util.Scanner;
public class bigWordsInString {
    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        String str=sc.nextLine();

        String[] word=str.split("\\s+");

        int max=0;
        for(String s:word)
        {
            max=Math.max(max, s.length());
        }
        for(String s:word)
        {
            if(s.length()==max)
            {
                System.out.println(s);
            }
        }
        sc.close();
    }
}
