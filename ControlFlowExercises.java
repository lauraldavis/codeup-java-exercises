public class ControlFlowExercises {
    public static void main(String[] args){
        // After each exercise, commit changes & replace code with the next exercise

//        // 1. Loop Basics
//        // a. While
//        // Create an integer variable i w/value of 5. Create a while loop that runs while i <= 15. Each iteration, output value of i & increment.
//        // Output should be: 5 6 7 8 9 10 11 12 13 14 15
//
//        int i = 5;
//        while (i <= 15) {
//            System.out.printf("%d ", i);
//            i++;
//        }

        // 1b. Do While

//        // Create do-while loop that counts by 2's starting w/0 & ending at 100. Follow each w/new line.
//        int i = 0;
//        do {
//            System.out.printf("%d%n", i);
//            i += 2;
//        } while (i <= 100);

//        // Alter loop to count backwards by 5's from 100 to -10
//        int i = 100;
//        do {
//            System.out.printf("%d%n", i);
//            i -= 5;
//        } while (i >= -10);

//        // Create a do-while loop that starts at 2 and displays the number squared on each line while < 1,000,000.
//        // Output should be: 2\n4\n16\n256\n65536
//        long i = 2;
//        do {
//            System.out.printf("%d%n", i);
//            i *= i;
//        } while (i <= 1000000);

        // 1c. For
        // Refactor the previous 2 exercises to use a for loop instead

//        // redo 1a change While -> For Loop
//        for (int i = 5; i <= 15; i++) {
//            System.out.printf("%d ", i);
//        }

        // redo 1b. change Do While -> For Loop

//        // count by 2's starting w/0 & ending at 100. Follow each w/new line.
//        for (int i = 0; i <= 100; i += 2) {
//            System.out.printf("%d%n", i);
//        }

//        // count backwards by 5's from 100 to -10
//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.printf("%d%n", i);
//        }

//        // start at 2 and displays the number squared on each line while < 1,000,000.
//        // Output should be: 2\n4\n16\n256\n65536
//        for (long i = 2; i <= 1000000; i *= i) {
//            System.out.printf("%d%n", i);
//        }

        // 2. Fizzbuzz
        // Print numbers 1 to 100, except for multiple of 3 print "Fizz" / multiple of 5 print "Buzz" / multiple of 3 and 5 print "FizzBuzz"
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }







    }
}
