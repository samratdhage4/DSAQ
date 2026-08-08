import java.util.ArrayList;
import java.util.Collections;

public class divisorofnum 
{


    
     public ArrayList<Integer> getDivisors(int n) 
    {
      ArrayList<Integer> ls=new ArrayList<>(); 
        
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                ls.add(i);
            
                if(n/i!=i)
                {
                    ls.add(n/i);
                    
                    
                }
                
               
            }
        }

        Collections.sort(ls);
        
        return ls;
         
       
            
    }


    public static void main(String[] args) 
    {
       

       divisorofnum d=new divisorofnum();

       System.out.println(d.getDivisors(122));

    }

    
}

