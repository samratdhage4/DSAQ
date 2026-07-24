class armstrong_gfg{
    static boolean armstrongNumber(int n) {

        int digit = 0;
        int cube = 0;
        int arm = 0;
        int y = n;

        while (y != 0) {
            digit = y % 10;
            cube = digit * digit * digit;
            arm += cube;

            if (arm > n)
                return false;

            y /= 10;
        }

        return arm == n;
    }
}
