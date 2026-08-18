class node
{
    int data;
    node next;

    node(int x)
    {
        this.data=x;
        this.next=null;

    }
}

/**
 * TravesreLL
 */
public class TravesreLL {

    void traversing(node head)
    {
        node temp=head;
        while (temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        
        node n1= new node(0);
        node n2= new node(2);
        node n3= new node(3);
        node n4= new node(4);
        node n5= new node(5);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;


        TravesreLL t= new TravesreLL();
        t.traversing(n1);
        
    }
}