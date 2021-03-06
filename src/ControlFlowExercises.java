import java.util.Scanner;
import java.util.Formatter;

public class ControlFlowExercises {
    public static void main(String[] args){
        // After each exercise, commit changes & replace code with the next exercise
        // Reused variable names, uncomment each problem one at a time...

//        // 1. Loop Basics
//        // a. While
//        // Create an integer variable i w/value of 5. Create a while loop that runs while i <= 15. Each iteration, output value of i & increment.
//        // Output should be: 5 6 7 8 9 10 11 12 13 14 15
//
//        int i = 5;
//        while (i <= 15) {
//            System.out.printf("%d ", i);  // or use print(i + " ")
//            i++;
//        }

//        // 1b. Do While
//        // Create do-while loop that counts by 2's starting w/0 & ending at 100. Follow each w/new line.
//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);

//        // Alter loop to count backwards by 5's from 100 to -10
//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

//        // Create a do-while loop that starts at 2 and displays the number squared on each line while < 1,000,000.
//        // Output should be: 2\n4\n16\n256\n65536 (last number squared overloads an int, need to use long)
//        long i = 2L; // specifying the L for long is a safety measure to ensure the output remains a long value
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i <= 1000000);


//        // 1c. For
//        // Refactor the previous 2 exercises to use a for loop instead

//        // redo 1a change While -> For Loop
//        for (int i = 5; i <= 15; i++) {
//            System.out.printf("%d ", i);  // or use print(i + " ")
//        }

//        // redo 1b. change Do While -> For Loop
//        // count by 2's starting w/0 & ending at 100. Follow each w/new line.
//        for (int i = 0; i <= 100; i += 2) {
//            System.out.println(i);
//        }

//        // count backwards by 5's from 100 to -10
//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        // start at 2 and displays the number squared on each line while < 1,000,000.
//        // Output should be: 2\n4\n16\n256\n65536
//        for (long i = 2; i <= 1000000; i *= i) {
//            System.out.println(i);
//        }


//        // 2. Fizzbuzz
//        // Print numbers 1 to 100, except for multiple of 3 print "Fizz" / multiple of 5 print "Buzz" / multiple of 3 and 5 print "FizzBuzz"
//        for (int i = 1; i <= 100; i++) {
//            if (i % 5 == 0 && i % 3 == 0) {  // alternately you could do (i % 15 == 0)
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        Scanner sc = new Scanner(System.in);

//        // 3. Display a table of powers
//        // Prompt user to enter an integer. Display a table of squares and cubes from 1 to the value entered.
//        // ask if the user wants to continue. Assume user enters valid data. Only continue if user agrees to.
//
//        String proceed;
//        do {
//            System.out.print("What number would you like to go up to? ");
//            int userInt = sc.nextInt();
//            System.out.printf("You entered: %d%n", userInt);
//            System.out.printf("Here is your table! %n%n");
//            System.out.printf("number | squared | cubed%n");
//            System.out.printf("------ | ------- | -----%n");
//            for (int i = 1; i <= userInt; i++) {
//                System.out.printf("%-6d | %-7d | %-5d%n", i, i*i, i*i*i);
//                        // Math.pow(i, 2), Math.pow(i, 3)); // error using %-7d & %-5d for 2nd/3rd columns with Math.pow()
//                        // works with %-7.0f and %-5.0f and Math.pow(), or could cast result to int: (int) Math.pow(n, n)

//            }
//            System.out.print("Would you like to continue? (y/n): ");
//            proceed = sc.next();
//        } while ( proceed.equalsIgnoreCase("y") );


//        // 4. Convert number grades to letter grades
//        // Prompt user for number grade from 0 to 100. Display letter grade, prompt user to continue. Assume valid integers for grades.
//        // Only continue if user agrees to. A: 100-88, B: 87-80, C:79-67, D: 66-60, F: 59-0
//
//        // Bonus: edit grade ranges to include pluses and minuses, ex: 99-100 = A+. (no standards available, just slice off top/bottom 2 pts...)
        String proceed;
        do {
            System.out.print("Please enter a numerical grade from 0 to 100: ");
            int userInt = sc.nextInt();
            if (userInt > 100) {
                System.out.println("That is not a valid grade number.");
            } else if ( userInt >= 99 ) { // 88-100 A
                System.out.println("A+");
            } else if ( userInt >= 90 ) {
                System.out.println("A");
            } else if ( userInt >= 88 ) {
                System.out.println("A-");
            } else if ( userInt >= 86 ) { // 80-87 B
                System.out.println("B+");
            } else if ( userInt >= 82 ) {
                System.out.println("B");
            } else if ( userInt >= 80 ) {
                System.out.println("B-");
            } else if ( userInt >= 78 ) { // 67-79 C
                System.out.println("C+");
            } else if ( userInt >= 69 ) {
                System.out.println("C");
            } else if ( userInt >= 67 ) {
                System.out.println("C-");
            } else if ( userInt >= 65 ) { // 60-66 D
                System.out.println("D+");
            } else if (userInt >= 62 ) {
                System.out.println("D");
            } else if (userInt >= 60 ) {
                System.out.println("D-");
            } else if (userInt >= 0 ) { // 0-59 F
                System.out.println("F");
            } else {
                System.out.println("That is not a valid grade number.");
            }
            System.out.print("Would you like to continue? (y/n): ");
            proceed = sc.next();
        } while ( proceed.equalsIgnoreCase("y") );
//
//        // Sophie's solution used a variable "char letterGrade;" and then assigned each grade with "letterGrade = 'C';"
//        // Then only one printf statement needed at the bottom using %c for the letterGrade variable.


    }
}
