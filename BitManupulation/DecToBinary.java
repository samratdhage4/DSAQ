/**
 * DecToBinary
 */
public class DecToBinary {

    
    public static String binary(int n)
    {
        int base=2;
        StringBuilder s= new StringBuilder();

        while (n!=0)
        {
            int carry=n%base;
            s.append(carry);
            n/=2;
            
        }

        return s.reverse().toString();
    } 

    public static void main(String[] args) {
        
        String s=binary(7);
        System.out.println(s);
    }
}