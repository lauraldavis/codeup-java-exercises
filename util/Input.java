package util;

import java.util.Scanner;

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
        try {
            return Integer.valueOf(getString(prompt));
        } catch (Exception e) { // string, double, boolean
            System.out.println("Invalid input.");
            return getInt(prompt);
        }
    }

    public int getInt(int min, int max) {
        String text = "Enter an integer (whole number) within the range of %s and %s: ";
        return getInt(min, max, text);
        }

    public int getInt(int min, int max, String prompt) {
        String text = String.format(prompt, min, max);
        try {
            int userInput = Integer.valueOf(getString(text));
            if (userInput >= min && userInput <= max) {
                return userInput;
            } else {
                System.out.println("Please enter a number within the range.");
                return getInt(min, max, prompt);
            }
        } catch (Exception e) { // string, double, boolean
            System.out.println("Invalid input.");
            return getInt(min, max, prompt);
        }
    }

    public double getDouble() {
        String text = "Enter an integer or decimal number: ";
        return getDouble(text);
    }

    public double getDouble(String prompt) {
        try {
            return Double.valueOf(getString(prompt));
        } catch (Exception e) { // string, boolean
            System.out.println("Invalid input.");
            return getDouble(prompt);
        }
    }

    public double getDouble(double min, double max) {
        String text = "Enter an integer or decimal number between %s and %s: ";
        return getDouble(min, max, text);
    }

    public double getDouble(double min, double max, String prompt) {
        String text = String.format(prompt, min, max);
        try {
            double userInput = Double.valueOf(getString(text));
            if (userInput >= min && userInput <= max) {
                return userInput;
            } else {
                System.out.println("Please enter a number within the range.");
                return getDouble(min, max, prompt);
            }
        } catch (Exception e) { // string, boolean
            System.out.println("Invalid input.");
            return getDouble(min, max, prompt);
        }
    }

    public int getBinary() {
        String text = "Enter a binary number: ";
        return getBinary(text);
    }

    public int getBinary(String prompt) {
        try {
            return Integer.valueOf(getString(prompt),2);
        } catch (Exception e) { // string, double, boolean
            System.out.println("Invalid input.");
            return getBinary(prompt);
        }
    }

    public int getHex() {
        String text = "Enter a hexadecimal number: ";
        return getHex(text);
    }

    public int getHex(String prompt) {
        try {
            return Integer.valueOf(getString(prompt),16);
        } catch (Exception e) { // string, int double, boolean
            System.out.println("Invalid input.");
            return getHex(prompt);
        }
    }

}