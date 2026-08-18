class node {
    int data;
    node next;

    node(int x) {
        this.data = x;
        this.next = null;
    }
}
public class search {

    public boolean searchKey(node head, int key) {
        // Code here
        
        if(head==null)
        {
            return false;
        }
        
        while(head!=null)
        {
            if(head.data==key)
            {
                return true;
            }
            head=head.next;
        }
        
        return false;
    }

    public static void main(String[] args) {
     
        search s =new search();
          node n1= new node(0);
        node n2= new node(0);
        node n3= new node(0);
        node n4= new node(0);
        node n5= new node(5);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        System.out.println(s.searchKey(n1, 0));
    }
}
