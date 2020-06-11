package util;

public class InputTest {

    public static void main(String[] args) {
        Input in = new Input();

        // Without no argument
        String strDefault = in.getString();
        System.out.println("You entered: " + strDefault);

        // With prompt argument
        String strPrompt = "Please enter a string (one or more words): ";
        String randString = in.getString(strPrompt);
        System.out.println("You entered: " + randString);


        // Without no argument
        boolean boolDefault = in.yesNo();
        System.out.println("You entered: " + boolDefault);

        // With prompt argument
        String boolPrompt ="Want to continue? (y/n): ";
        boolean yesNo = in.yesNo(boolPrompt);
        System.out.println("You entered: " + yesNo);


        // With no argument
        int num = in.getInt();
        System.out.println("You entered: " + num);

        // With min & max arguments
        int numInRange = in.getInt(1, 10);
        System.out.println("You entered: " + numInRange);

        // With min & max & prompt arguments
        String intPrompt = "Please enter an integer number within the range of %s and %s: ";
        int numInRangePrompt = in.getInt(1, 10, intPrompt);
        System.out.println("You entered: " + numInRangePrompt);


        // With no argument
        double dNum = in.getDouble();
        System.out.println("You entered: " + dNum);

        // With min & max arguments
        double dNumInRange = in.getDouble(1, 10);
        System.out.println("You entered: " + dNumInRange);

        // With min & max & prompt arguments
        String dblPrompt = "Please enter a number between %s and %s: ";
        double dNumInRangePrompt = in.getDouble(1, 10, dblPrompt);
        System.out.println("You entered: " + dNumInRangePrompt);

    }
}
