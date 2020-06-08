public class RecursionLecture {

    public static void count(int n) {
        if (n <= 0) {
            System.out.println("All done!");
            return; // exits
        }
        System.out.println(n);
        count(n - 1);
    }

    // getPower using recursion
    public static long getPower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else if (exponent == 2) {
            return base * base;
        }
        // return base * getPower(base, exponent - 1);
        // replace with console logs to understand what it's doing...
        System.out.println("base: " + base);
        System.out.println("exponent: " + exponent);
        long count = base * getPower(base, exponent - 1);
        System.out.println("current count: " + count);
        return count;
    }


    public static void main(String[] args) {
        count(5);
        // prints out 5, calls count (5-1)
        // prints out 4, calls count (4-1)
        // prints out 3, calls count (3-1)
        // prints out 2, calls count (2-1)
        // prints out 1, calls count (1-1)
        // prints out All done! and exits
        System.out.println(getPower(3,5));
        // 3 * getPower(3,4)         // doesn't meet exceptions so calls recursion statement w/exponent 5-1
        // 3 * 3 * getPower(3,3)     // doesn't meet exceptions so calls recursion statement w/exponent 4-1
        // 3 * 3 * 3 * getPower(3,2) // doesn't meet exceptions so calls recursion statement w/exponent 3-1
        // (3 * 3 * 3 * 3) * 3       // final result meets exception (exponent = 2) so returns previous * base

    }
}
