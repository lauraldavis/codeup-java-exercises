import java.util.Scanner;

public class ControlStatementsLecture {

    public static void main(String[] args) {

        // ==================== Slide 3

        // no >== ,or <==, or === because only value comparisons are available
        // truthy and falsy values don't exist in Java


        // ==================== Slide 5

        // && will only check second value if first is true
        // & will check both
        // this can be used to check what would otherwise result in a syntax error
        // same comparison process for || and |

        // x will only increment in second condition if first condition is true using &&
                int x = 2;
                int y = 3;

                if (false && ++x == y) { // returns false because the 1st clause is false so 2nd is not evaluated. Single "&" would get evaluated.
                    System.out.println("Equal");
                } else {
                    System.out.println("Not equal");;
                }
                System.out.println(x);


        // ==================== Slide 7

        // DO NOT COMPARE STRINGS WITH == !!!!

                Scanner sc = new Scanner(System.in);
                String cat1 = sc.nextLine(); // no prompt, just enter some text
                String cat2 = "cat";
                System.out.println(cat1);
                System.out.println(cat2);
                System.out.println(cat1 == cat2); // not comparing string values, comparing reference types
                System.out.println(cat1.equals(cat2));

        // do use equals(),

//    boolean stringValuesAreEqual = "Test".equals("Tes");
//    System.out.printf("The result is: %s", stringValuesAreEqual);


        // or use equalsIgnoreCase()

//String hello = "hello";
//System.out.println(hello.equalsIgnoreCase("HeLlO"));

        // does not equal

//String tech = "tech";
//System.out.println(!tech.equalsIgnoreCase("tool"));

        boolean compare = "hello".equals(sc.next());
        System.out.println(compare);



        // ==================== Slides 8 - 16

        // basically the same as JS :)


//            String caseSwitch = "Fred";
//            switch (caseSwitch) {
//                case "bob":
//                    System.out.println("Case 1");
//                    break;
//                case "fred":
//                    System.out.println("Case 2");
//                    break;
//                default :
//                    System.out.println("Default case");
//                    break;
//            }

    }

}
