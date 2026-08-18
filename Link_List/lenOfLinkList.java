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

public class lenOfLinkList {

     public int getCount(node head)
     {
        int count=0;
        node temp=head;

        while (temp!=null)
        {
            count++;
            temp=temp.next;
            
        }
        return count;
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


       lenOfLinkList l = new lenOfLinkList();
       System.out.println("LENGTH OF GIVEN LINKED LIST:-"+l.getCount(n1));
        
    }
}
