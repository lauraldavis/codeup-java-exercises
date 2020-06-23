package grades;

import java.util.HashMap;
import java.util.Map;

import util.Input;

public class GradesApplication {
    static Input in = new Input();


    public static void main(String[] args) {

        // key=value: GitHub usernames = Student objects
        HashMap<String, Student> students = new HashMap<>();

        Student s1 = new Student("Laura");
        s1.addGrade(45);
        s1.addGrade(50);
        s1.addGrade(55);
        System.out.println(s1.getName() + " " + s1.getGrades());
        Student s2 = new Student("Mark");
        s2.addGrade(55);
        s2.addGrade(60);
        s2.addGrade(65);
        System.out.println(s2.getName() + " " + s2.getGrades());
        Student s3 = new Student("Andrew");
        s3.addGrade(65);
        s3.addGrade(70);
        s3.addGrade(75);
        System.out.println(s3.getName() + " " + s3.getGrades());
        Student s4 = new Student("Julia");
        s4.addGrade(75);
        s4.addGrade(80);
        s4.addGrade(85);
        System.out.println(s4.getName() + " " + s4.getGrades());
        Student s5 = new Student("Knoah");
        s5.addGrade(85);
        s5.addGrade(90);
        s5.addGrade(95);
        System.out.println(s5.getName() + " " + s5.getGrades());
        students.put("lauraldavis", s1);
        students.put("MarkTAlonge", s2);
        students.put("AndrewBrought", s3);
        students.put("juliacontreras483", s4);
        students.put("cottoknoah", s5);

//        System.out.println(students);
        // {juliacontreras483=grades.Student@2c8d66b2, lauraldavis=grades.Student@5a39699c, AndrewBrought=grades.Student@3cb5cdba, MarkTAlonge=grades.Student@56cbfb61, cottoknoah=grades.Student@1134affc}

        boolean yesNo = false;
        do {
            String intPrompt = "What would you like to do?\n" +
                    "0 - exit\n" +
                    "1 - view all grades for all students.\n" +
                    "2 - view the overall class average grade.\n" +
                    "3 - select a student to view more information about.\n" +
                    "Enter your choice: ";
            int numIntRangePrompt = in.getInt(0, 3, intPrompt); // edit when menu expands
            System.out.println("You entered: " + numIntRangePrompt);

            switch (numIntRangePrompt) {
                case 0:
                    System.out.println("Bye!");
                    yesNo = false;
                    break;
                case 1:
                    String textAllGrades = "";
                    for (String hashname : students.keySet()) {
                        textAllGrades = hashname + " - Grades: " + students.get(hashname).getGrades();
                        textAllGrades += " Current Average: " + students.get(hashname).getGradeAverage();
                        System.out.println(textAllGrades);
                    }
                    yesNo = true;
                    break;
                case 2:
                    double totalAvgGrades = 0;
                    for (String hashname : students.keySet()) {
                        totalAvgGrades += students.get(hashname).getGradeAverage();
                    }
                        System.out.println("Overall Average Grade: " + totalAvgGrades/students.size());
                    yesNo = true;
                    break;
                case 3:
                    // nested do/while loop
                    do {
                        String gitHubUsers = "* ";
                        String textUserGrades;

                        for (String hashname : students.keySet())
                            gitHubUsers += hashname + " * ";

                        System.out.println("Welcome!\n\nHere are the GitHub usernames of our students:\n" + gitHubUsers);

                        String strPrompt = "What student would you like to see more information on?\n";
                        String userInput = in.getString(strPrompt);

                        if (students.containsKey(userInput)) {
                            textUserGrades = "Name: " + students.get(userInput).getName() + " - GitHub Username: " + userInput;
                            textUserGrades += "\nGrades: " + students.get(userInput).getGrades();
                            textUserGrades += "\nCurrent Average: " + students.get(userInput).getGradeAverage() + "\n\n";
                            System.out.println(textUserGrades);
                            String boolPrompt = "Would you like to see another student? (y/n)";
                            yesNo = in.yesNo(boolPrompt);
                        } else {
                            System.out.println("You entered: " + userInput + "\n");
                            System.out.println("That GitHub username is not in our student list.\n");
                            String boolPrompt = "Do you want to continue? (y/n): ";
                            yesNo = in.yesNo(boolPrompt);
                        }
                    } while (yesNo); // end nested do/while loop
                    yesNo = true;
                    break;
                default:
                    System.out.println("Please enter one of the options.");
                    yesNo = true;

            }
        } while (yesNo);
//        // Iterating over Map.entrySet() using For-Each loop (most common, use if you need both keys and values in the loop)
//        for (Map.Entry<String, Student> entry : students.entrySet())
//            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

//        // Iterating over keys or values using keySet() and values() methods
//        // keySet() to iterate over keys
//        for (String hashname : students.keySet())
//            System.out.println("key: " + hashname);
//        // values() to iterate over values
//        for (Student name : students.values())
//            System.out.println("value: " + name);
    }
}