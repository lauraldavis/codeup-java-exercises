import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        String userInput;
        System.out.println("Welcome! To chat with Bob, start a conversation.");
        do {
            System.out.println("Begin typing: ");
            userInput = sc.nextLine();
            if (userInput.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.equals("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }
        } while ( !userInput.equalsIgnoreCase("Bye") );

    }
}
