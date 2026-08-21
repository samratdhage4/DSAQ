class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
public class sort012 {


    public static Node segregate(Node head) {

        if (head == null || head.next == null)
            return head;

        Node zero = new Node(0);
        Node one = new Node(1);
        Node two = new Node(2);

        Node Hzero = zero;
        Node Hone = one;
        Node Htwo = two;

        Node temp = head;

        while (temp != null) {

            Node next = temp.next;
            temp.next = null;

            if (temp.data == 0) {
                zero.next = temp;
                zero = zero.next;
            }
            else if (temp.data == 1) {
                one.next = temp;
                one = one.next;
            }
            else {
                two.next = temp;
                two = two.next;
            }

            temp = next;
        }

        // Connect 0 list to 1 list if it exists,
        // otherwise connect directly to 2 list
        zero.next = (Hone.next != null) ? Hone.next : Htwo.next;

        // Connect 1 list to 2 list
        one.next = Htwo.next;

        // Return first non-empty list
        if (Hzero.next != null)
            return Hzero.next;

        if (Hone.next != null)
            return Hone.next;

        return Htwo.next;
    }

    public static void main(String[] args) {

        // Input: 2 -> 0
        Node head = new Node(2);
        head.next = new Node(0);

        // Segregate
        head = segregate(head);

        // Print result
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null)
                System.out.print(" -> ");

            temp = temp.next;
        }
    }




}

