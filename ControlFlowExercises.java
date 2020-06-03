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

        // Alter loop to count backwards by 5's from 100 to -10
        int i = 100;
        do {
            System.out.printf("%d%n", i);
            i -= 5;
        } while (i >= -10);





    }
}
