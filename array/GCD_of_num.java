public class GCD_of_num 
{

  
    public static int gcd(int a, int b) {
       
       if(Math.min(a,b)==1) return 1;
      
       while (a>0 && b>0) 
       {

        if(a>b)
        {
            a=a%b;
        }else
        {
            b=b%a;
        }
        
       }

       if(a==0)
       {
        return b;
       }else
       {
        return a;
       }
      
        
    }



    public static void main(String[] args) 
    {

        GCD_of_num g= new GCD_of_num();

        System.out.println(g.gcd(10, 20));

        
    }
}

    

