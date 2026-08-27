public class division 
{
    static int divide(int n,int d)
    {
        if(n==Integer.MAX_VALUE && d==-1)
            return Integer.MIN_VALUE;

        boolean isNegative= n<0 ^ d<0;

        n=Math.abs(n);
        d=Math.abs(d);

        int q=0;

        while (n-d>=0)
        {
            int currD=d;
            int currQ=1;

            while (n-(currD<<1)>=0)
            {
                currD=currD<<1;
                currQ=currQ<<1;
                
            }
            
            n-=currD;
            q+=currQ;
        }

        return isNegative?-q:q;
    }


    public static void main(String[] args) 
    {
        int res=divide(-7, 3);
        
        System.out.println(res);

    }

    
}
