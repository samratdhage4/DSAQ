class node {
    int data;
    node prev;
    node next;

    node(int x) {
        this.data = x;
        this.prev = null;
        this.next = null;

    }
}

/**
 * DLL
 */
public class DLL {

    static node print(node head)
    {
       node temp = head;

    while(temp.next != null)
    {
        temp = temp.next;
    }

    while(temp != null)
    {
        System.out.println(temp.data);
        temp = temp.prev;
    }
    return head;
    }

    static node arr2ddl(int[] arr)
    {
        node head= new node(arr[0]);
        node previos=head;;

        for(int i=1;i<arr.length;i++)
        {
            node nnode= new node(arr[i]);
            previos.next=nnode;
            nnode.prev=previos;
            previos=nnode;
        }

        return head;
    }
    public static void main(String[] args) {

        
        node head=arr2ddl(new int[]{1,2,3,4,5,6,7,8,9,10});

        print(head);




    }
}