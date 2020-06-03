import java.util.Scanner;

public class ConsoleIOBonus {

    public static int countWordsUsingSplit(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        String[] words = input.split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
/**    ### Console IO Bonus
​
    1. Prompt the user to enter a favorite quote
    - output the quote
    - ask them to enter how many words are in the quote
    - output the number they entered
    - output if the number they entered indeed matched the number of words
 */

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your favorite quote: ");
    String userQuote = sc.nextLine();
    System.out.printf("You entered: %s%n", userQuote);
    System.out.print("How many words are in your quote?: ");
    int userInt = sc.nextInt();
    System.out.printf("You entered: %d%n", userInt);
    int wordCount = countWordsUsingSplit(userQuote);
    if ( wordCount == userInt) {
        System.out.println("You are correct!");
    } else {
        System.out.printf("Your word count doesn't match mine, I count: %d%n", wordCount);
    }


    /**    2. Prompt the user to enter a list of top three favorite foods separated by only spaces
    - Use the printf() to output the three top foods with the format:
        1. FirstFood
        2. SecondFood
        3. ThirdFood
 */
        sc.nextLine();
        System.out.print("Enter your top three favorite foods, separated by a space: ");
        String userFoods = sc.nextLine();
        System.out.printf("You entered: %s%n", userFoods);
        String[] arrFoods = userFoods.split(" ");
        for (int i = 0; i < arrFoods.length; i++) {
            System.out.printf("%d. %s%n", i + 1, arrFoods[i]);
        }


    /**    3. Prompt the user to enter a grocery list of three items
    - each item should only be separated by a comma (no spaces)
    - you will need to use the .useDelimiter() method on your scanner object
    - output the result as a comma-separated list using printf()
 */
        sc.useDelimiter(",");
        // Result is the same with standard whitespace delimiter or \n or comma (?)
        System.out.print("Enter three items separated only commas for a grocery list (ex: bread,milk,eggs): ");
        String userList = sc.nextLine();
        System.out.printf("You entered: %s%n", userList);

    }
}
