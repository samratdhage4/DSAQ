/**
 * imp_que
 * 
 * simple working of Queue Data Structure :-
 */
public class imp_que {

    
    int front;
    int rear;
    int currS;
    int[] arr;
    int size;

    imp_que(int n)
    {
        front=-1;
        rear=-1;
        currS=0;
        size=n;
        arr = new int[size];
    }

    boolean isEmpty()
    {
        return currS==0;

    }

    boolean isFull()
    {
        return currS==size;

    }

    void enQueue(int x)
    {
        if(isFull())
        {
            return;
        }if( isEmpty())
        {
            front=0;

            rear=(rear+1)%size;
            arr[rear]=x;
            currS++;
        }else
        {
            rear=(rear+1)%size;
            arr[rear]=x;
            currS++;

        }
    }

    void deQueue()
    {
        if(isFull())
        {
            return;
        }else if(currS==1)
        {
            front=-1;
            rear=-1;
        }else
        {    
            front=(front+1)%size;
            currS--;
        }
}


    int getRear()
    {
        if(isEmpty())
        {
            return-1;
        }

        return arr[rear];

    }

    int getFront()
    {
        if(isFull())
        {
            return -1;
        }

        return arr[front];
    }

    public static void main(String[] args) 
    {
        imp_que Q= new imp_que(5);

        Q.enQueue(1);
        Q.enQueue(2);
        Q.deQueue();

        System.out.println(Q.getFront());
        System.out.println(Q.getRear());
        
        
    }

}