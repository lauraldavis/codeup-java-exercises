import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOLecture {
    public static void main(String[] args) throws IOException { // (using throws IOException here, so no longer need to use try/catch blocks)

        Path myDirectory = Paths.get("src");
        Path myFile = Paths.get("src", ".gitignore");
        Path gitignore = Paths.get("src",".gitignore");
        System.out.println(myDirectory);
        System.out.println(myFile);
        System.out.println(gitignore);
        System.out.println(Files.exists(myDirectory)); // true
        System.out.println(Files.exists(myFile)); // true
        System.out.println(Files.exists(gitignore)); // true

        String directory = "test";
        Path myTest = Paths.get(directory);
        Path infoFile = Paths.get("test", "info.txt");

        if(Files.notExists(myTest)) {
            try {
                Files.createDirectory(myTest);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if(Files.notExists(infoFile)){
            try {
                Files.createFile(infoFile);
            } catch (IOException e){
                e.printStackTrace();
            }
        }

        // Writing to file
        String[] names = {"justin", "sophie", "vivian"};
        // can't add to names but can add to instructors because we turn it into an ArrayList
        List<String> instructors = Arrays.asList(names);
//        instructors.add("Casey");
        List<String> students = new ArrayList<>();
        students.add("Laura");
        students.add("Andrew");
        students.add("Mark");
        try {
            Files.write(infoFile, students);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        To get info from file you can use for loop (curriculum) or Enhanced for loop
        // Use this method on a new list or after a list was changed, to get the new list contents (in this case it's redundant)

//        // normally you would use try/catch for exceptions rather than throw exceptions on the class
//        try {
//            List<String> myStudents = Files.readAllLines(infoFile);
//            System.out.println(myStudents);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        List<String> myStudents = Files.readAllLines(infoFile);
        for (String student : myStudents) {
            System.out.println(student);
        }

        // Appending to a file
        String newStudent = "Ramon";
        List<String> newStudents = Arrays.asList("Ramon","Justin","Julia");
        // could replace newStudents with string Arrays.asList("Ramone"),
        Files.write(infoFile, newStudents, StandardOpenOption.APPEND);

        System.out.println(myStudents);
        System.out.println(newStudents);

        // Modify a file
        // find & replace - copies the list, modifies the list, replaces the list in the file
        List<String> newClass = new ArrayList<>();

        for(String student : myStudents) {
            if(student.equals("Justin")){
                newClass.add("Shelby");
                continue;
            }
            newClass.add(student);
        }
        Files.write(infoFile, newClass);
        System.out.println(newClass);



    }
}
