import java.util.Scanner;

class node {
    int data;
    node next;

    node(int x) {
        this.data = x;
        this.next = null;
    }
}

public class insertion {

    // Insertion at beginning
    public node atHead(node head, int data) {

        node nnode = new node(data);

        nnode.next = head;
        head = nnode;

        return head;
    }

    // Insertion at given index
    public node atIndex(node head, int index, int data) {

        node nnode = new node(data);

        // Insert at index 0
        if (index == 0) {
            return atHead(head, data);
        }

        if (head == null) {
            System.out.println("List is empty.");
            return head;
        }

        node temp = head;

        for (int i = 0; i < index - 1; i++) {

            if (temp == null) {
                System.out.println("Index out of range.");
                return head;
            }

            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Index out of range.");
            return head;
        }

        nnode.next = temp.next;
        temp.next = nnode;

        return head;
    }

    // Insertion at middle
    public node atMid(node head, int data) {

        node nnode = new node(data);

        if (head == null) {
            return nnode;
        }

        node slow = head;
        node fast = head;

        // Find middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        nnode.next = slow.next;
        slow.next = nnode;

        return head;
    }

    // Insertion at tail
    public node atTail(node head, int data) {

        node nnode = new node(data);

        if (head == null) {
            return nnode;
        }

        node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = nnode;

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
        insertion s = new insertion();

        int x;

        do {

            System.out.println("\nENTER WHICH INSERTION YOU HAVE TO PERFORM:");
            System.out.println("1. Insert at Head");
            System.out.println("2. Insert at Index");
            System.out.println("3. Insert at Middle");
            System.out.println("4. Insert at Tail");
            System.out.println("5. Display");
            System.out.println("6. Exit");

            x = sc.nextInt();

            switch (x) {

                case 1:
                    System.out.println("Enter data:");
                    int data = sc.nextInt();

                    head = s.atHead(head, data);
                    break;

                case 2:
                    System.out.println("Enter data:");
                    data = sc.nextInt();

                    System.out.println("Enter index:");
                    int index = sc.nextInt();

                    head = s.atIndex(head, index, data);
                    break;

                case 3:
                    System.out.println("Enter data:");
                    data = sc.nextInt();

                    head = s.atMid(head, data);
                    break;

                case 4:
                    System.out.println("Enter data:");
                    data = sc.nextInt();

                    head = s.atTail(head, data);
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