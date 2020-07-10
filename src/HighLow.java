import java.util.Scanner;

public class HighLow {

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n"); // Use keyword static before definition, or include inside every method
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

    public static void guessingGame(int guess, int answer) {
        if (guess == answer) {
            System.out.println("You got it!");
        } else if (guess < answer) {
            System.out.println("HIGHER");
            guessingGame(getInteger(1,100), answer);
        } else {
            System.out.println("LOWER");
            guessingGame(getInteger(1,100), answer);
        }
    }

}
