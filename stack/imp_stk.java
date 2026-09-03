import java.util.Scanner;

public class imp_stk {

    private int n;
    private int[] arr;
    private int top;

    // Constructor
    imp_stk(int n) {
        this.n = n;
        this.arr = new int[n];
        this.top = -1;
    }

    // Push
    void push(int value) {

        if (isFull()) {
            System.out.println("STACK IS FULL..");
            return;
        }

        arr[++top] = value;
        System.out.println("PUSHED: " + value);
    }

    // Pop
    void pop() {

        if (isEmpty()) {
            System.out.println("STACK IS EMPTY..");
            return;
        }

        System.out.println("POPPED: " + arr[top--]);
    }

    // Peek
    int peek() {

        if (isEmpty()) {
            return -1;
        }

        return arr[top];
    }

    // Check if empty
    boolean isEmpty() {
        return top == -1;
    }

    // Check if full
    boolean isFull() {
        return top == n - 1;
    }

    // Display
    void display() {

        if (isEmpty()) {
            System.out.println("STACK IS EMPTY..");
            return;
        }

        System.out.println("STACK:");

        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER STACK SIZE: ");
        int size = sc.nextInt();

        imp_stk stack = new imp_stk(size);

        int choice;

        do {

            System.out.println("\n========== STACK MENU ==========");
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. PEEK");
            System.out.println("4. IS EMPTY");
            System.out.println("5. IS FULL");
            System.out.println("6. DISPLAY");
            System.out.println("7. EXIT");
            System.out.println("================================");

            System.out.print("ENTER YOUR CHOICE: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("ENTER VALUE TO PUSH: ");
                    int value = sc.nextInt();
                    stack.push(value);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    System.out.println("TOP ELEMENT: " + stack.peek());
                    break;

                case 4:
                    System.out.println(
                        stack.isEmpty()
                        ? "STACK IS EMPTY"
                        : "STACK IS NOT EMPTY"
                    );
                    break;

                case 5:
                    System.out.println(
                        stack.isFull()
                        ? "STACK IS FULL"
                        : "STACK IS NOT FULL"
                    );
                    break;

                case 6:
                    stack.display();
                    break;

                case 7:
                    System.out.println("EXITING...");
                    break;

                default:
                    System.out.println("INVALID CHOICE!");
            }

        } while (choice != 7);

        sc.close();
    }
}