public class pattern {

    public static void main(String[] args) {

        // ============================================
        // Pattern 4 : Solid Rectangle
        // ============================================
        /*
        ******
        ******
        ******
        ******
        */

        int row = 4;
        int col = 6;

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println();

        // ============================================
        // Pattern 5 : Inverted Half Pyramid
        // ============================================
        /*
        *****
        ****
        ***
        **
        *
        */

        int n = 5;

        for (int i = n; i >= 1; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println();

        // ============================================
        // Pattern 6 : Half Pyramid
        // ============================================
        /*
        *
        **
        ***
        ****
        *****
        */

        n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println();

        // ============================================
        // Pattern 7 : Center Pyramid
        // ============================================
        /*
            *
           * *
          * * *
         * * * *
        */

        n = 4;

        for (int i = 1; i <= n; i++) {

            // Print Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println();
    }
}
