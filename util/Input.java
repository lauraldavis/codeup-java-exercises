package util;

import java.util.Scanner;
//    Scanner sc = new Scanner(System.in).useDelimiter("\n");

public class Input {
    private Scanner sc = new Scanner(System.in);

    public String getString() {
        return this.getString("Enter a string: ");
    }
    public String getString(String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }
    public boolean yesNo() {
        return this.yesNo("Continue? Select y/n: ");
    }
    public boolean yesNo(String prompt) {
        System.out.print("Continue? Select y/n: ");
        String answer = sc.nextLine();
        return (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) ? true : false;
    }
    public int getInt() {
        System.out.print("Enter an integer (a whole number): ");
        return sc.nextInt();
    }
    public int getInt(int min, int max) {
        System.out.printf("Please enter an integer number within the range of %s and %s: ", min, max);
        int userInput = sc.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Please enter a number within the range.");
            return getInt(min, max);
        }
    }
    public int getInt(int min, int max, String prompt) {
        System.out.printf(prompt, min, max);
        int userInput = sc.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Please enter a number within the range.");
            return getInt(min, max);
        }
    }
    public double getDouble() {
        System.out.print("Enter any integer or decimal number: ");
        return sc.nextDouble();
    }
    public double getDouble(double min, double max) {
        System.out.printf("Enter any integer or decimal number in the range of %s and %s: ", min, max);
        double userInput = sc.nextDouble();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Please enter a number within the range.");
            return getDouble(min, max);
        }
    }
    public double getDouble(double min, double max, String prompt) {
        System.out.printf(prompt, min, max);
        double userInput = sc.nextDouble();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Please enter a number within the range.");
            return getDouble(min, max);
        }
    }


}