import java.util.Arrays;

public class ServerNameGenerator {

    public static String[] adjectives = {"tiny", "sweet", "ugly", "dark", "matte", "sparkly", "grumpy", "fit", "blue", "angry", "round", "high"};

    public static String[] nouns = {"book", "train", "table", "horse", "carrot", "leg", "fox", "tree", "flower", "sky", "galaxy", "moon"};

    public static String getRandom(String[] array) {
        int random = (int) Math.floor((Math.random() * 12) + 1);
        return array[random];
    }
    /*
    walkthrough demo of java's Random class instead of Math.random()
    :
    static Random randomizer = new Random();
    public String randomElem(String[] words){
        return words[randomizer.nextInt(words.length)];
        }

    then used it in:
    public static String serverName(String a, String b){
        return "Your new server name is: " + a + "-" + b;
    }

    then call it in main:
    System.out.println(serverName(randomElem(adjectives),randomElem(nouns)));
     */

    public static void main(String[] args) {
        String adjective = getRandom(adjectives);
        String noun = getRandom(nouns);
        System.out.printf("Here is your server name:%n%s-%s%n", adjective, noun);
    }
}
