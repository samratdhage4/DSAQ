import java.util.Stack;

public class Q_using_stk 
{
    Stack<Integer> s1;
    Stack<Integer> s2;
    

    Q_using_stk()
    {
        s1= new Stack<>();
        s2= new Stack<>();
    }

    void push(int x)
    {
        s1.push(x);
    }

    int pop()
    {
        int n=s1.size();

        for(int i=1;i<n;i++)
        {
            s2.push(s1.pop());
        }
        int x=s1.pop();
        int n2=s2.size();
        for(int i=0;i<n2;i++)
        {
            s1.push(s2.pop());
        }

        return x;

    }

    int top()
    {
        
        int n=s1.size();

        for(int i=1;i<n;i++)
        {
            s2.push(s1.pop());
        }
        int x=s1.peek();
        int n2=s2.size();
        for(int i=0;i<n2;i++)
        {
            s1.push(s2.pop());
        }

        return x;

    }

    boolean isEmpty()
    {
            return s1.isEmpty();
    }

     void display()
    {
        System.out.println(s1);
    }


    public static void main(String[] args) {
        
        Q_using_stk q= new Q_using_stk();

        q.push(0);
        q.push(2);
        System.out.println(q.pop());
        System.out.println(q.top());
        q.push(0);
        q.push(1);
        System.out.println(q.isEmpty()); 
        
        q.display();
    }

    
    
}
