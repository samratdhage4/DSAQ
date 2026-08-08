/**
 * primeNum
 */
public class primeNum 
{

    
    static boolean isPrime(int n) 
    {
        
        if(n<=1) return false;
        
        int c=0;
        
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            
                if(n/i!=i)
                {
                    c++;
                    
                    
                }
                
               
            }
        }
        
        return c==2;
         
       
         
        
    }


    public static void main(String[] args) 
    {
       

       primeNum p=new primeNum();

       System.out.println(p.isPrime(170));

    }

    
}