import java.util.Scanner;

class node {
    int data;
    node next;

    node(int x) {
        this.data = x;
        this.next = null;
    }
}

public class deletion {

    // Deletion at beginning
    public node atHead(node head) {

        if (head == null) {
            System.out.println("List is empty.");
            return head;
        }

        head = head.next;

        return head;
    }

    // Deletion at given index
    public node atIndex(node head, int index) {

        if (head == null) {
            System.out.println("List is empty.");
            return head;
        }

        // Delete first node
        if (index == 0) {
            return atHead(head);
        }

        if (index < 0) {
            System.out.println("Invalid index.");
            return head;
        }

        node temp = head;

        // Move to node before the index
        for (int i = 0; i < index - 1; i++) {

            if (temp.next == null) {
                System.out.println("Index out of range.");
                return head;
            }

            temp = temp.next;
        }

        // Check if index exists
        if (temp.next == null) {
            System.out.println("Index out of range.");
            return head;
        }

        temp.next = temp.next.next;

        return head;
    }

    // Deletion at middle
    public node atMid(node head) {

        if (head == null) {
            System.out.println("List is empty.");
            return head;
        }

        // Only one node
        if (head.next == null) {
            return null;
        }

        node slow = head;
        node fast = head;
        node prev = null;

        // Find middle node
        while (fast != null && fast.next != null) {

            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Delete middle node
        prev.next = slow.next;

        return head;
    }

    // Deletion at tail
    public node atTail(node head) {

        if (head == null) {
            System.out.println("List is empty.");
            return head;
        }

        // Only one node
        if (head.next == null) {
            return null;
        }

        node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        // Remove last node
        temp.next = null;

        return head;
    }

    // Display
    void show(node head) {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        node result = head;

        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        node head = null;

        Scanner sc = new Scanner(System.in);
        deletion s = new deletion();

        int x;

        do {

            System.out.println("\nENTER WHICH DELETION YOU HAVE TO PERFORM:");
            System.out.println("1. Delete at Head");
            System.out.println("2. Delete at Index");
            System.out.println("3. Delete at Middle");
            System.out.println("4. Delete at Tail");
            System.out.println("5. Display");
            System.out.println("6. Exit");

            x = sc.nextInt();

            switch (x) {

                case 1:
                    head = s.atHead(head);
                    break;

                case 2:
                    System.out.println("Enter index:");
                    int index = sc.nextInt();

                    head = s.atIndex(head, index);
                    break;

                case 3:
                    head = s.atMid(head);
                    break;

                case 4:
                    head = s.atTail(head);
                    break;

                case 5:
                    s.show(head);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (x != 6);

        sc.close();
    }
}
