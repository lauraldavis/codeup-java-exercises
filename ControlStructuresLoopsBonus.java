import java.util.Arrays;
import java.util.Scanner;

public class ControlStructuresLoopsBonus {
    public static void main(String[] args) {

//    ### Simple Chat Bot
//    Be creative in communicating with your user different options and for given scenarios.
//    Create at least three phases of the chat, for example...
//            "How are you?" (AI says)
//            |                              |
//    good                        bad (user types)
//	   "Awesome! Are you super happy?" 	    "Will cake make you better?"
//    yes          no                     yes             no
//    Keep the chat options relatively simple and plan it out clearly before coding it.​

        Scanner sc = new Scanner(System.in);
        System.out.print("Hello, what is your name?: ");
        String usrName = sc.nextLine();
        System.out.printf("Welcome, %s, are you ready to code Java today? (y/n):%n", usrName);
        String userAns1 = sc.next();
        if (userAns1.equalsIgnoreCase("y")) {
            System.out.println("Great, please enter level of difficulty 1-5 (easy-hard): ");
            int diffLevel = sc.nextInt();
            if (diffLevel >= 1 && diffLevel <= 3) {
                System.out.println("Great, let's continue learning Java I");
            } else if (diffLevel >= 4 && diffLevel <= 5) {
                System.out.println("Great, let's start on Java II");
            } else {
                System.out.println("Okay, maybe you need a nap then.");
            }
        } else {
            System.out.println("Okay, do you want to try JavaScript instead? (y/n): ");
            String userAns2 = sc.next();
            if (userAns2.equalsIgnoreCase("y")) {
                System.out.println("Great, please enter level of difficulty 1-5 (easy-hard): ");
                int diffLevelJS = sc.nextInt();
                if (diffLevelJS >= 1 && diffLevelJS <= 3) {
                    System.out.println("Great, let's review JavaScript I");
                } else if (diffLevelJS >= 4 && diffLevelJS <= 5) {
                    System.out.println("Great, let's review JavaScript II");
                } else {
                    System.out.println("Okay, maybe you need a nap then.");
                }
            } else {
                System.out.println("Okay, maybe you need a nap then.");
            }
        }

//      ### Hangman Game
//​
//      - prompt a player 1 to enter a word for player 2 to guess
//      - track the number of guesses by player 2
//      - display to the user the partially completed word
//      - string methods from the lesson will be helpful for this bonus
        System.out.print("Hello player 1, welcome to Hangman! Enter a word for player 2 to guess: ");
        String word = sc.next().toUpperCase();
        String wordTemplate = "_".repeat(word.length());
        System.out.printf("Welcome, player 2, the word chosen by player 1 has %s letters: %s%n", word.length(), wordTemplate);
        for (int i = 0; i < 10; i++) {
            System.out.print("Please enter your guess (one letter per turn): ");
            String letter = sc.next().toUpperCase();
            // Logic to compare letter to word
            if ( stringContainsItemFromList(letter, word.split("")) ) {
                int matchCount = 1;
                String plural = "";
                System.out.printf("Your guess is correct! %s occurs %d time%s.%n", letter, matchCount, plural);
                // display letter position(s) in place of underscores when a guess is correct
                // keep track of guesses to disallow repeats
                // Count remaining underscores to check if won

            } else {
                System.out.printf("Sorry, that letter is not correct.%n");
            }
            System.out.printf("Remaining turns: %d.%n", 9 - i);
            // end for loop
        }
        System.out.printf("Thank you for playing Hangman!%n");
    }

    public static boolean stringContainsItemFromList(String inputStr, String[] items) {
        return Arrays.stream(items).parallel().anyMatch(inputStr::contains);
    }

}