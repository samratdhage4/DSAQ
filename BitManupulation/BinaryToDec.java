public class BinaryToDec {
    public static int dec(String s)
    {
        int base=2;
        int pow=0;
        int dec=0;

        for(int i=s.length()-1;i>=0;i--)
        {
            int digit=s.charAt(i)-'0';
            
            dec+=Math.pow(base, pow++)*digit;

        }

        return dec;
    } 

    public static void main(String[] args) {
        
        int result=dec("100");

        System.out.println(result);
    }
    
}
