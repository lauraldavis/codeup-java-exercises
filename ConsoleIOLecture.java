import java.util.Scanner;
// Keyboard shortcut to import a missing class, highlight class, Opt + Enter

public class ConsoleIOLecture {

    public static void main(String[] args) {

        System.out.println("Hello Ganymede!");
        // Keyboard shortcut to run code: Ctrl + R
        // Hover over System, Cmd + B to open System.java to read source code

        // ================================== print() and println()

        // this:
//            System.out.println("here");
//            System.out.println("there");

        // is equivalent to this:
//            System.out.print("here\n");
//            System.out.print("there\n");

        // without the newline characters, print outputs this:
//            System.out.print("here");
//            System.out.print("there");

        // to concatenate, just like JS:
//            System.out.println("Hello" + " " + "World");

        String helloWorld = "Hello World";
        System.out.println(helloWorld + " - how are you today?");

        // ================================== printf()

        // Print a formatted string using the following... printf(formatString, data)

        // same output as print():
//            System.out.printf("Hello");
//            System.out.printf("World!");


        // creating a string variable:
            String bigBall = "World";
//            System.out.printf("Hello %s", bigBall);
//            System.out.printf("Hello %S", bigBall); // all caps
        System.out.printf("Hello %n%S%n", bigBall); // %n new line, %s string, %S string all caps

        // multiple variables:
            int three = 3;
            String typeOfPetGroup = "cats";
            System.out.printf("I have %d %s.%n", three, typeOfPetGroup); // %d is only for integers (double integer)
        // %f for float is needed if three was a double set to 3.5
        // %.2f would format it to 2 decimal places, 3.50


        // currency:
            int currencyPennies = 1000;
            System.out.printf("I'll sell you swamp land for $%.2f an acre!%n", currencyPennies / 100.00);

// write a program that will print our name with a greeting, Welcome, YOUR_NAME_HERE!
        String name = "Laura Davis";
        System.out.printf("Welcome, %s!%n", name);


        // ================================== USER INPUT

        Scanner sc = new Scanner(System.in);
//        System.out.println(sc); // scanner settings

//        System.out.printf("Please enter your first name:%n");
//        String userInput = sc.next(); // next() expects a string, use nextInt() for a number
//        System.out.println("You entered the following: " + userInput);


        // .next() captures each input separated by whitespace:
//            System.out.print("Please enter your first, middle, and last name: ");
//            String firstName = sc.next();
//            String lastName = sc.next();
//            String what = sc.next();
//
//            System.out.println(firstName);
//            System.out.println(lastName);
//            System.out.println(what);

        // .nextInt() captures the first valid int value:
//            System.out.print("Please enter your age: ");
//            int age = sc.nextInt();
//            System.out.println(age);


        // .nextLine():

//            System.out.print("Favorite quote: ");
//            String quote = sc.nextLine();
//            System.out.println(quote);


        // unexpected behaviour

        System.out.println("Enter a word:");
        String word1 = sc.next();
            sc.nextLine(); // needed to clear out hitting enter when switching from next() to nextLine()
        System.out.println("Enter a sentence:");
        String line1 = sc.nextLine();

        System.out.println(line1);

        System.out.printf("The word is: %s%nThe sentence is: %s%n", word1, line1);
        // prints out after the first entry, reads the Enter as \n as input to second prompt/variable

//            String word2 = sc.next();
//            sc.nextLine(); // needed to clear out hitting enter
//            String line2 = sc.nextLine();

//            System.out.printf("%s%n%s%n%s%n%s%n", word1, line1, word2, line2);

        // check for presence of various data types

//            int userInt = 0;
//            if (sc.hasNextInt()) {
//                userInt = sc.nextInt();
//                System.out.printf("The user entered %d. This number times two is %d.", userInt, userInt * 2);
//            } else {
//                System.out.println("The user did not enter an integer");
//            }


    }

}