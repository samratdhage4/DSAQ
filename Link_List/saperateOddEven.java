class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class saperateOddEven {

    public Node segregateEvenOdd(Node head)
    {

        if(head==null || head.next==null)
        {
            return head;
        }

        Node odd=head;
        Node even=head.next;
        Node evenhead=head.next;
        

        while (even!=null && even.next!=null)
        {
            odd.next=odd.next.next;
            even.next=even.next.next;
            
            odd=odd.next;
            even=even.next;
        }

        odd.next=evenhead;

        return head;
    }
    

 public static void main(String[] args) {
        saperateOddEven sol = new saperateOddEven();

        // Creating linked list: 17 -> 15 -> 8 -> 12 -> 10 -> 5 -> 4
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);

        // Call segregation function
        Node newHead = sol.segregateEvenOdd(head);

        // Print result
        while (newHead != null) {
            System.out.print(newHead.data + " ");
            newHead = newHead.next;
        }
    }
}
