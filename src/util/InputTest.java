package util;

public class InputTest {

    public static void main(String[] args) {
        Input in = new Input();

        // Without arguments
        System.out.println("\nTesting input types - Round 1... with default prompts\n");

        // String
        String strDefault = in.getString();
        System.out.println("You entered: " + strDefault);
        // boolean
        boolean boolDefault = in.yesNo();
        System.out.println("You entered: " + boolDefault);
        // int
        int numDefault = in.getInt();
        System.out.println("You entered: " + numDefault);
        // double
        double dNumDefault = in.getDouble();
        System.out.println("You entered: " + dNumDefault);

        // With arguments
        System.out.println("\nTesting input types - Round 2... with prompts\n");

        // String with prompt
        String strPrompt = "Enter a string (one or more words): ";
        String randString = in.getString(strPrompt);
        System.out.println("You entered: " + randString);
        // boolean with prompt
        String boolPrompt = "Do you want to continue? (y/n): ";
        boolean yesNo = in.yesNo(boolPrompt);
        System.out.println("You entered: " + yesNo);
        // int with prompt
        String numPrompt = "Enter an integer (whole number): ";
        int numIntPrompt = in.getInt(numPrompt);
        System.out.println("You entered: " + numIntPrompt);
        // double with prompt
        String dNumPrompt = "Enter an integer or decimal number: ";
        double dblResponse = in.getDouble(dNumPrompt);
        System.out.println("You entered: " + dblResponse);

        System.out.println("\nTesting input types - Round 3... with default prompt and required range\n");

        // int with min & max arguments
        int numInRange = in.getInt(1, 10);
        System.out.println("You entered: " + numInRange);
        // double with min & max arguments
        double dNumInRange = in.getDouble(1, 10);
        System.out.println("You entered: " + dNumInRange);

        System.out.println("\nTesting input types - Round 3... with prompts and required range\n");

        // int with min & max & prompt arguments
        String intPrompt = "Enter an integer (whole number) within the range of %s and %s: ";
        int numInRangePrompt = in.getInt(1, 10, intPrompt);
        System.out.println("You entered: " + numInRangePrompt);
        // With min & max & prompt arguments
        String dblPrompt = "Enter an integer or decimal number between %s and %s: ";
        double dNumInRangePrompt = in.getDouble(1, 10, dblPrompt);
        System.out.println("You entered: " + dNumInRangePrompt);

        System.out.println("\nTesting input types - Round 4... binary & hex with default prompts\n");

        // binary
        int bNumDefault = in.getBinary();
        System.out.println("You entered: " + bNumDefault);
        // hex
        int hNumDefault = in.getHex();
        System.out.println("You entered: " + hNumDefault);

        System.out.println("\nTesting input types - Round 5... binary & hex with prompts\n");

        // binary with prompt
        String bNumPrompt = "Enter a binary number: ";
        int numBinaryPrompt = in.getBinary(bNumPrompt);
        System.out.println("You entered: " + numBinaryPrompt);
        // hex with prompt
        String hNumPrompt = "Enter a hexadecimal number: ";
        int numHexPrompt = in.getHex(hNumPrompt);
        System.out.println("You entered: " + numHexPrompt);

        System.out.println("\nThat's all folks!\n");

    }
}
