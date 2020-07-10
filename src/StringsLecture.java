import java.util.Scanner;

public class StringsLecture {
        public static void main(String[] args) {

//        Uncomment the Scanner and String variables.

//        Scanner sc = new Scanner(System.in).useDelimiter("\n");
//        System.out.println("Please enter your name:");
//
//        String input = sc.nextLine();
//
//        String name = "Jane Doe";

        /*
         *  TO DO: Write the control statements below to check the input
         *  String using Java methods.
         */

        //  If the input is an exact match to String name...
        //  Print message: "Welcome Jane Doe!"
//            if (input.equals(name)) {
//                System.out.println("Welcome Jane Doe!");
//            }

        //  If the input is not capitalized correctly...
        //  Print message: "Names are proper nouns."
//            if (input.equalsIgnoreCase(name)) {
//                System.out.println("Names are proper nouns.");
//            }

        //  If the input starts with "Jane"...
        //  Print message: "Hi Jane!"
//            if (input.startsWith(name)){
//                System.out.println("Hi Jane!");
//            }

        //  If the input ends with "Doe"...
        //  Print message: "Doe, a deer..."
//            if (input.endsWith(name)){
//                System.out.println("Doe, a deer...");
//            }

        /*
         *  TO DO TOGETHER: Uncomment each line and view the results of each
         *  String manipulation method.
         */

            String name = "Jane Doe";
            String fruit = "apple, apple, apple...";

//        System.out.println(name.charAt(3)); // e
//        System.out.println(name.indexOf("Doe")); // 5
//        System.out.println(name.lastIndexOf("e")); // 7
//        System.out.println(fruit.lastIndexOf("apple")); // 14
//        System.out.println(name.length()); // 8
//        System.out.println(name.replace("Doe", "Smith")); // Jane Smith // pattern,replacement (all occurrences)
//        System.out.println(name.substring(3)); // e Doe
//        System.out.println(name.substring(0,3)); // Jan // substring stops at 2nd parameter exclusive
//        System.out.println(name.toLowerCase()); // jane doe
//        System.out.println(name.toUpperCase()); // JANE DOE

        // trim is really useful for catching user errors on input.
//        String trimThis = "    too many spaces   ";
//
//        System.out.println(trimThis);
//        System.out.println(trimThis.trim());

            // You can chain methods if they return a string
            // To retain the result of a method, store it in a variable so you have a reference to the new string
//            String nameSubstring = name.trim().substring(5).toUpperCase().substring(0,1);
//            System.out.println(nameSubstring);

        // How would we fix this?
//        System.out.println("Here is a backslash \\");

    }
}
