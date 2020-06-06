import java.util.Scanner;

public class ControlStructuresLoopsBonus {

     static void drawHangman(int misses) {
        switch (misses) {
            case 0:
                System.out.println(
                        "\n\n\n\n\n" +
                        "+---+\n" +
                        "|\n" +
                        "|\n" +
                        "|\n" +
                        "|\n" +
                        "|\n" +
                        "========= ");
            break;
            case 1:
                System.out.println(
                        "+---+\n" +
                        "|   |\n" +
                        "|\n" +
                        "|\n" +
                        "|\n" +
                        "|\n" +
                        "========= ");
            break;
            case 2:
                System.out.println(
                        "+---+\n" +
                        "|   |\n" +
                        "|   O\n" +
                        "|\n" +
                        "|\n" +
                        "|\n" +
                        "========= ");
            break;
            case 3:
                System.out.println(
                        "+---+\n" +
                        "|   |\n" +
                        "|   O\n" +
                        "|   |\n" +
                        "|\n" +
                        "|\n" +
                        "========= ");
            break;
            case 4:
                System.out.println(
                        "+---+\n" +
                        "|   |\n" +
                        "|   O\n" +
                        "|  /|\n" +
                        "|\n" +
                        "|\n" +
                        "========= ");
            break;
            case 5:
                System.out.println(
                        "+---+\n" +
                        "|   |\n" +
                        "|   O\n" +
                        "|  /|\\\n" +
                        "|\n" +
                        "|\n" +
                        "========= ");
            break;
            case 6:
                System.out.println(
                        "+---+\n" +
                        "|   |\n" +
                        "|   O\n" +
                        "|  /|\\\n" +
                        "|  /\n" +
                        "|\n" +
                        "========= ");
            break;
            case 7:
                System.out.println(
                        "+---+\n" +
                        "|   |\n" +
                        "|   O\n" +
                        "|  /|\\\n" +
                        "|  / \\\n" +
                        "|\n" +
                        "========= ");
            break;
            case 8:
                System.out.println(
                        "+---+\n" +
                        "|   |\n" +
                        "|   |\n" +
                        "|   Q\n" +
                        "|  /|\\\n" +
                        "|  / \\\n" +
                        "========= ");
            break;
            case 9:
                System.out.println(
                        "+---+\n" +
                        "|\n" +
                        "|\n" +
                        "|\n" +
                        "|\n" +
                        "| _/\\|_@\n" +
                        "========= ");
                break;
            case 10:
                System.out.println(
                        "  |\n" +
                        "--|--\n" +
                        "  |\n" +
                        "__|__\n" +
                        "\\    \\\n" +
                        " \\____\\\n ");
                break;
        }
    }

    static Object stretchText(String content) {
         // display content with an extra space between each letter
        StringBuilder newContent = new StringBuilder();
        for (int c = 0; c < content.length(); c++) {
            newContent.append(content.charAt(c)).append(" ");
        }
        return newContent;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//    ### Simple Chat Bot
//    Be creative in communicating with your user different options and for given scenarios.
//    Create at least three phases of the chat, for example...
//            "How are you?" (AI says)
//            |                              |
//    good                        bad (user types)
//	   "Awesome! Are you super happy?" 	    "Will cake make you better?"
//    yes          no                     yes             no
//    Keep the chat options relatively simple and plan it out clearly before coding it.​

//        System.out.print("Hello, what is your name?: ");
//        String usrName = sc.nextLine();
//        System.out.printf("Welcome, %s, are you ready to code Java today? (y/n):%n", usrName);
//        String userAns1 = sc.next();
//        if (userAns1.equalsIgnoreCase("y")) {
//            System.out.println("Great, please enter level of difficulty 1-5 (easy-hard): ");
//            int diffLevel = sc.nextInt();
//            if (diffLevel >= 1 && diffLevel <= 3) {
//                System.out.println("Great, let's continue learning Java I");
//            } else if (diffLevel >= 4 && diffLevel <= 5) {
//                System.out.println("Great, let's start on Java II");
//            } else {
//                System.out.println("Okay, maybe you need a nap then.");
//            }
//        } else {
//            System.out.println("Okay, do you want to try JavaScript instead? (y/n): ");
//            String userAns2 = sc.next();
//            if (userAns2.equalsIgnoreCase("y")) {
//                System.out.println("Great, please enter level of difficulty 1-5 (easy-hard): ");
//                int diffLevelJS = sc.nextInt();
//                if (diffLevelJS >= 1 && diffLevelJS <= 3) {
//                    System.out.println("Great, let's review JavaScript I");
//                } else if (diffLevelJS >= 4 && diffLevelJS <= 5) {
//                    System.out.println("Great, let's review JavaScript II");
//                } else {
//                    System.out.println("Okay, maybe you need a nap then.");
//                }
//            } else {
//                System.out.println("Okay, maybe you need a nap then.");
//            }
//        }


//      ### Hangman Game
//​
//      - prompt a player 1 to enter a word for player 2 to guess
//      - track the number of guesses by player 2
//      - display to the user the partially completed word
//      - string methods from the lesson will be helpful for this bonus (try to solve it without using arrays)

        String playAgain;
        do {
            System.out.print("Hello player 1, welcome to Hangman! Enter a word for player 2 to guess: ");
            String word = sc.next().toUpperCase();
            int lettersRemain = word.length();
            String wordTemplate = "_".repeat(lettersRemain); // 1 underscore per letter
            String allLettersHistory = "";
            int misses = 0;
            drawHangman(misses); // start with the gallows
            System.out.printf("Welcome, player 2, the word chosen by player 1 has %s letters: %s%n", lettersRemain, stretchText(wordTemplate) );

            // Loop for each guess, allow up to 10 guesses
            for (int i = 0; i <= 10; i++) {
                System.out.print("Player 2, enter your letter guess (one letter per turn): ");
                String letter = sc.next().trim().toUpperCase().substring(0, 1);
                // compare to letters already guessed to prevent duplicate letters consuming a turn
                if (allLettersHistory.contains(letter)) {
                    System.out.println("You have already guessed that letter, try again...");
                    continue;
                }
                allLettersHistory += letter;
                int letterMatchCount = 0;
                String plural = "";
                String suffix = "";
                // Loop to compare each letter, rebuild wordTemplate with match(es)
                for (int l = 0; l < word.length(); l++) {
                    if (word.substring(l, l + 1).equals(letter)) {
                        letterMatchCount++;
                        lettersRemain--;
                        // Replace the position in the string with the matched letter
                        wordTemplate = wordTemplate.substring(0, l) + letter + wordTemplate.substring(l+1);
                    }
                } // End loop comparing letter by letter

                // display results
                if (letterMatchCount == 0) {
                    System.out.printf("The letter %s is not found.%n", letter);
                    misses++;
                    drawHangman(misses);
                } else {
                    if (letterMatchCount > 1) {
                        plural = "s";
                    }
                    drawHangman(misses);
                    System.out.printf("The letter %s occurs %d time%s.%n", letter, letterMatchCount, plural);
                    if (lettersRemain == 0) {
                        System.out.printf("The word is: %s%n%n", stretchText(wordTemplate));
                        System.out.println("Congratulations, you won!");
                        break;
                    }
                }
                if ( (10 - i) != 1 ) {
                    suffix = "es";
                }
                System.out.printf("You have %d guess%s left.%n", 10 - i, suffix);
                System.out.printf("Letters guessed are: %s, the word is %s%n%n", allLettersHistory, stretchText(wordTemplate));
            } // End loop - no more guesses
            if (lettersRemain > 0) {
                System.out.printf("%nSorry, that was your last turn... You lost!%n");
            }
            System.out.printf("%nWould you like to play again? (y/n):%n");
            playAgain = sc.next();
        } while (playAgain.equalsIgnoreCase("y"));
    }
}