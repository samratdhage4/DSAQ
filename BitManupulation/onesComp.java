public class onesComp {
    
    public static int ones(int n)
    {
        int mask= Integer.highestOneBit(n)*2-1;
        return n^mask;
    }

    public static void main(String[] args) {
        
        int res=ones(5);
        System.out.println(res);
    }
}
