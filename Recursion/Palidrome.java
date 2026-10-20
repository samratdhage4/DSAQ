public class Palidrome {
    
    static boolean is(String s,int i,int j)
    {
        if(i>=j)
            return true;

        if(s.charAt(i)!=s.charAt(j))
        {
            return false;
        }

        return  is(s, i+1, j-1);
    }

    public static void main(String[] args) {
        
        String s= "MADAM";
        System.out.println(is(s, 0, s.length()-1));
    }
}
