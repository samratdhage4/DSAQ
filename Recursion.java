public class Recursion {

    /*
        Recursion Problems

        1. Print Name N times
        2. Print 1 to N
        3. Print N to 1
        4. Sum of First N Numbers
        5. Factorial of a Number
        6. Check if String is Palindrome
        7. Fibonacci Number
    */

    // Print name N times
    void name(int n, String Name) {
        if (n == 0)
            return;

        System.out.println(Name);
        name(n - 1, Name);
    }

    // Print 1 to N
    void N(int n, int x) {
        if (n == 0)
            return;

        System.out.println(x);
        N(n - 1, x + 1);
    }

    // Print N to 1
    void reverse(int n) {
        if (n == 0)
            return;

        System.out.println(n);
        reverse(n - 1);
    }

    // Sum of First N Numbers
    int sum(int n) {
        if (n == 0)
            return 0;

        return n + sum(n - 1);
    }

    // Factorial of a Number
    int fact(int n) {
        if (n == 0 || n == 1)
            return 1;

        return n * fact(n - 1);
    }

    // Check if String is Palindrome
    boolean palindrome(String str, int left, int right) {
        if (left >= right)
            return true;

        if (str.charAt(left) != str.charAt(right))
            return false;

        return palindrome(str, left + 1, right - 1);
    }

    // Fibonacci Number
    int fibonacci(int n) {
        if (n <= 1)
            return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    // revers an aaray

    void revarr(int[] a,int start, int end)
    {
        if(start>end) return;

        int temp=a[start];
        a[start]=a[end];
        a[end]=temp;

        revarr(a, start+1, end-1);
    }

    public static void main(String[] args) {

        Recursion f = new Recursion();

        System.out.println("Factorial of 5: " + f.fact(5));

        System.out.println("\nPrint Name 5 Times:");
        f.name(5, "SAMRAT");

        System.out.println("\nPrint 1 to 10:");
        f.N(10, 1);

        System.out.println("\nPrint 10 to 1:");
        f.reverse(10);

        System.out.println("\nSum of First 10 Numbers: " + f.sum(10));

        String str = "madam";
        System.out.println("\nIs \"" + str + "\" a Palindrome? "
                + f.palindrome(str, 0, str.length() - 1));

        System.out.println("\n6th Fibonacci Number: " + f.fibonacci(6));

        int[] a={1,2,3,4,5,6,7,8,9};
        int x=a.length-1;

         f.revarr(a, 0, x);

         for(int i=0;i<9;i++)
        {
            System.out.println(a[i]);
        }
    }
}