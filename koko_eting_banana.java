public class koko_eting_banana 
{

    private long mineat(int[] a,int h)
    {
        long mx=0;
        for(int i=0;i<a.length;i++)
        {
          mx += (a[i] + h - 1) / h;
        }

        return mx;
    }

     public int minEatingSpeed(int[] p, int h) 
     {
        int maxi=0;
        for(int i=0;i<p.length;i++)
        {
            maxi=Math.max(maxi,p[i]);
        }

        int i=1;
        int j=maxi;

        while (i<=j)
        {
            int mid=i+(j-i)/2;
           long total=mineat(p, mid);

            if(total<=h)
            {
                j=mid-1;
            }else
            {
                i=mid+1;
            }
            
        }
        return i;
     }

    public static void main(String[] args) 
    {
        
        koko_eting_banana k= new koko_eting_banana();

        System.out.println(k.minEatingSpeed(new int[] {30,11,23,4,20}, 5));

    }
    
}
