import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {
    static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    // 1. a. Create 4 separate methods to perform arithmetic operations (Addition, Subtraction, Multiplication, Division - account for divide by zero)
    // b. Each function takes in 2 parameters. c. Test your methods & verify output. d. Add a modulus method.

    public static double addition(double num1, double num2) { return num1 + num2; }
    public static double subtraction(double num1, double num2) { return num1 - num2; }
    public static double multiplication(double num1, double num2) { return num1 * num2; }

//    Bonus: a. rewrite the Multiplication method without the * operator (hint: use a loop)
    public static double loopMultiply (double num1, double num2) {
        double result = 0;
        if (num1 == 0 || num2 == 0) {
            return 0;
        } else {
            for (int i = 0; i < num1; i++) {
                result += num2;
            }
            return result;
        }
    }
//        Bonus 1.b. rewrite multiplication using recursion
    public static double recursiveMultiply (double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        }
        return num1 + recursiveMultiply(num1, num2 - 1);
    }

    public static double division(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }
    }
    public static double modulus(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return num1 % num2;
        }
    }

    // 2. Create a method that validates user input is in a certain range. Method should look like: public static int getInteger(int min, int max);

    public static int getInteger(int min, int max) {
//        Scanner sc = new Scanner(System.in).useDelimiter("\n"); // Use keyword static before definition, or include inside every method
        System.out.printf("Enter a number between %s and %s: ", min, max);
        int userInput = sc.nextInt();
        if (userInput >= min && userInput <= max) {
            System.out.println("Thanks for entering a valid number.");
            return userInput;
        } else {
            System.out.println("Please enter a number within the range.");
            return getInteger(min, max);
        }
    }

    // 3. Calculate the factorial of a number. Prompt user for an integer between 1 and 10. Display the factorial of the number entered.
    // Ask if user wants to continue. Use a for loop to calculate the factorial. Assume user will enter an integer, verify it's 1-10.
    // Use long type to store factorial. Continue only if user agrees to. A factorial is a number multiplied by each of the numbers before it.
    // Factorials are denoted by the exclamation point (n!).
    public static void factorialUsingLoop(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
            if (i < n) {
                System.out.print(i + " x ");
            } else {
                System.out.println(i + " = " + fact);
            }
        }
    }

    // 3. Bonus Find the highest factorial that can be calculated, modify the prompt to reflect the highest integer that is accurate. Use recursion to implement the factorial
    public static long factorialUsingRecursion(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorialUsingRecursion(n - 1);
    }

    // 4. Create an application to simulate dice rolling. Ask user to enter #sides for a pair of dice. Prompt user to roll the dice. "Roll" 2 n-sided dice, display results of each,
    // ask user if they want to roll again. Use static methods to implement methods to generate random numbers. Use .random method of the java.lang.Math class to generate random numbers.

    public static void rollDice (int n) {
        int dice1 = (int) (Math.random() * n) + 1;
        int dice2 = (int) (Math.random() * n) + 1;
        System.out.printf("1st die: %d, 2nd die: %d%n", dice1, dice2);
    }


    public static void validateArithmetic() {
        System.out.println(addition(20, 5));      // 25
        System.out.println(subtraction(20, 5));   // 15
        System.out.println(multiplication(7, 3)); // 21
        System.out.println(division(21, 5));      // 4.2
        System.out.println(modulus(21, 5));       // 1
        System.out.println(loopMultiply(7, 3));   // 21
        System.out.println(recursiveMultiply(7, 3)); // 21
    }

    public static void main(String[] args) {
        // 1.
        validateArithmetic();

        // 2.
        int myInt = getInteger(1, 10);
        System.out.println(myInt);

        // 3. factorial
        int n;
        String proceed;
        long fact = 1;
        do {
            n = getInteger(1,26);
            System.out.printf("Do you want to calculate the factorial of %d? Continue? (y/n): ", n);
            proceed = sc.next();
        } while (!proceed.equalsIgnoreCase("y"));

        System.out.print(n + "! = ");
        // 3. without recursion
//        factorialUsingLoop(n);

//        for (int i = 1; i <= n; i++) {
//            fact = fact * i;
//            if (i < n) {
//                System.out.print(i + " x ");
//            } else {
//                System.out.println(i + " = " + fact);
//            }
//        }

        // 3. with recursion
        fact = factorialUsingRecursion(n);
        System.out.println("Factorial of " + n + " is: " + fact);


        // 4. roll dice
        do {
            System.out.println("Let's roll a pair of dice... choose how many sides you would like?");
            rollDice(getInteger(1, 10));
            System.out.println("Would you like to continue?(y/n)");
        } while (sc.next().equalsIgnoreCase("y"));

        // 5. high low game
        System.out.println("Let's play a game.");

        do {
            int answer = (int) (Math.random() * 100) + 1;
            System.out.println("See if you can guess my random number, it's between 1 and 100: ");
            HighLow.guessingGame(getInteger(1,100), answer);
            System.out.println("Would you like to continue? (y/n): ");
        } while (sc.next().equalsIgnoreCase("y"));

    }
}
