package util;

import java.util.Scanner;
//    Scanner sc = new Scanner(System.in);

public class Input {
    private Scanner sc;

    public Input() {
        this.sc = new Scanner(System.in).useDelimiter("\n");
    }

    public String getString() {
        return getString("Enter a string: ");
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return sc.next(); // works with next and delimiter \n (problems with nextLine)
    }

    public boolean yesNo() {
        return this.yesNo("Continue? Select y/n: ");
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String ans = sc.next();
        return (ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes"))
                        ? true : false;
    }

    public int getInt() {
        String text = "Enter an integer (whole number): ";
        return getInt(text);
    }

    public int getInt(String prompt) {
        System.out.print(prompt);
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Invalid input. Enter valid integer.");
            sc.next();
            return getInt(prompt);
        }
    }

    public int getInt(int min, int max) {
        System.out.printf("Enter an integer (whole number) within the range of %s and %s: ", min, max);
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
            return getInt(min, max, prompt);
        }
    }

    public double getDouble() {
        String text = "Enter an integer or decimal number: ";
        return getDouble(text);
    }

    public double getDouble(String prompt) {
        System.out.print(prompt);
        if (sc.hasNextDouble()) {
            return sc.nextDouble();
        } else {
            System.out.println("Invalid input. Enter valid number.");
            sc.next();
            return getDouble(prompt);
        }
    }

    public double getDouble(double min, double max) {
        System.out.printf("Enter an integer or decimal number between %s and %s: ", min, max);
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