class Node {
    int data;
    Node next;
    Node prev;

    Node(int x) {
        data = x;
        next = null;
        prev = null;
    }
}
public class removeAllOccurence {
    

    static Node deleteAllOccurOfX(Node head, int x) {
        // code here
        if(head==null) return null;
        
        Node dummy=new Node(-1);
        dummy.next=head;
        head.prev=dummy;
        
        Node previous=dummy;
        
        while(previous.next!=null)
        {
            if(previous.next.data==x)
            {
                
                Node curr=previous.next;
                
                Node next=curr.next;
                previous.next=next;
                
                if(next!=null)
                next.prev=previous;
                
                
                curr.prev=null;
                curr.next=null;
            }else
            {
                previous=previous.next;
            }
            
        }
        
        Node nnode=dummy.next;
        
        if(nnode!=null)
        {
            nnode.prev=null;
        }
        return nnode;
    }

    public static void main(String[] args) {
        
        Node n1= new Node(0);
        Node n2= new Node(0);
        Node n3= new Node(0);
        Node n4= new Node(0);
        Node n5= new Node(1);
        Node n6= new Node(1);
        Node n7= new Node(2);
        Node n8= new Node(2);
        Node n9= new Node(2);
        Node n10= new Node(1);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;
        n7.next=n8;
        n8.next=n9;
        n9.next=n10;

        
        
        
        n2.prev=n1;
        n3.prev=n2;
        n4.prev=n3;
        n5.prev=n4;
        n6.prev=n5;
        n7.prev=n6;
        n8.prev=n7;
        n9.prev=n8;
        n10.prev=n9;
    
        
        Node head=deleteAllOccurOfX(n1, 0);

        Node temp=head;
        while (temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
            
        }

        
        
        
        
    }
}
