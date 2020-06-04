import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        // 1. Copy this code into your main method (pi variable). Write code that uses variable pi to output: "The value of pi is approximately 3.14."
        // Don't change the value of the variable, use System.out.format to display it (works the same as System.out.printf).
        // %.2f formats float to 2 decimal places, n.nn
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f.%n", pi);

        // Explore the Scanner Class
        // 1. Prompt user to enter a integer and store value in int variable using nextInt method. What happens if you input something not an integer?
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        System.out.print("Please enter an integer: ");
        int userInt = sc.nextInt();
        System.out.println("The user entered: " + userInt);
        /* Works if you enter an int (5), errors if you enter a decimal number (5.5)
        Exception in thread "main" java.util.InputMismatchException
            at java.base/java.util.Scanner.throwFor(Scanner.java:939)
            at java.base/java.util.Scanner.next(Scanner.java:1594)
            at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
            at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
            at ConsoleExercises.main(ConsoleExercises.java:14)
        Process finished with exit code 1
        */

        // 2. Prompt a user to enter 3 words, store each in a separate variable, display them in console - each on a new line.
        // What happens if you enter less than 3 words? more than 3 words?
        System.out.println("You will be asked to enter 3 words. Enter the first word now: ");
        String word1 = sc.next();
        // Don't need the nextLine() here because we're not switching from next() to nextLine(), so the tokens are separated by new line
        System.out.println("Enter the second word: ");
        String word2 = sc.next();
        System.out.println("Enter the third word: ");
        String word3 = sc.next();
        System.out.printf("The 3 words are: %s %s %s%n", word1, word2, word3);

        // 3. Prompt a user to enter a sentence, store it in a String variable using the next method, display back to the user
//        System.out.println("Enter a sentence: ");
//        String line1 = sc.next();
//        System.out.println(line1);

        // 4. Rewrite #3 using the nextLine method.
        sc.nextLine(); // required before the next multi-word capture with nextLine will work
        System.out.println("Enter a sentence: ");
        String line1 = sc.nextLine();
        System.out.printf("The user entered: %s%n", line1);


        // Calculate the perimeter and area of Codeup's classrooms.

        // 1. Prompt user to enter values - length and width of codeup classroom. Use nextLine method to get input, parse string to numeric type.
        // Assume the rooms are perfect rectangles and the user will enter valid numeric data for length and width.
        System.out.print("Enter the length in feet of your classroom (as an integer): ");
        int userLength = Integer.parseInt(sc.next());
        System.out.print("Enter the width in feet of your classroom (as an integer): ");
        int userWidth = Integer.parseInt(sc.next());
        System.out.printf("You entered length: %d and width: %d%n", userLength, userWidth);
        // 2. Display the area and perimeter of that classroom. area = length x width, perimeter = (2 x length) + (2 x width)
        System.out.printf("The area is %d ft, the perimeter is %d ft%n", userLength * userWidth, (userLength * 2) + (userWidth * 2) );


        // Bonuses
        // In your perimeter/area calculator, accept decimal entries, calculate volume in addition to area/perimeter.
        System.out.println("Enter the length in feet of your classroom (as a decimal number): ");
        float bLength = Float.parseFloat(sc.next());
        System.out.println("Enter the width in feet of your classroom (as a decimal number): ");
        float bWidth = Float.parseFloat(sc.next());
        System.out.println("Enter the height in feet of your classroom (as a decimal number): ");
        float bHeight = Float.parseFloat(sc.next());
        System.out.printf("You entered length: %.2f and width: %.2f and height: %.2f.%n", bLength, bWidth, bHeight);
        // Display area, perimeter and volume. area = length x width, perimeter = (2 x length) + (2 x width), volume = area x height.
        System.out.printf("The area is %.2f ft%n", bLength * bWidth);
        System.out.printf("The perimeter is %.2f ft%n", (bLength * 2) + (bWidth * 2) );
        System.out.printf("The volume is %.2f ft%n", bLength * bWidth * bHeight );
        // Change the scanner class delimiter, after it's created, to sc.useDelimiter("\n");
        // How does it change the way your program operates? (It didn't seem to change, new line is part of what's caught by the default?)

        // Rewrite to use the nextInt method, after changing the delimiter it should handle multiple pieces of user input.
        // Don't understand the point of this bonus...
        System.out.println("Enter the size of your classroom, in feet (as integers)");
        System.out.println("Enter Length, Width, and Height (for example: 8 <Enter>, 9 <Enter>, 10 <Enter>)");
        int userL = sc.nextInt();
        int userW = sc.nextInt();
        int userH = sc.nextInt();
        System.out.printf("Area: %d ft, Perimeter: %d ft, Volume: %d ft%n", userL * userW, (userL * 2) + (userW * 2), userL * userW * userH);

    }
}
