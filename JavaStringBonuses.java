// example of newer date classes
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// example of older date classes
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class JavaStringBonuses {

    public static String convertDateFormat (String stringDate) {

        // using java.time.LocalDate, LocalDateTime and format.DateTimeFormatter (use when you don't need the time zone context)
        // These are newer classes in Java SE 8, immutable and thread-safe

        // establish the date format of the string date input and convert the input to an actual date using the format pattern
        DateTimeFormatter longDtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate newDate = LocalDate.parse(stringDate, longDtf);

        // Formatting the date to the new specified pattern and return it as a string
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        return dtf.format(newDate);
    }

    public static String convertSimpleDateFormat (String stringDate) {

        // Example using java.text.SimpleDateFormat and java.util.Date
        // These are older classes, not thread-safe, potential concurrency issues
        String convertedDateString = "";
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
            Date date = sdf.parse(stringDate);
            SimpleDateFormat outputsdf = new SimpleDateFormat("MMMM dd, yyyy");
            convertedDateString += outputsdf.format(date);
        } catch (java.text.ParseException e) {
            System.out.println("Some error occurred while converting date formats. Exception: " + e);
        }
        return convertedDateString;
    }



//        SimpleDateFormat sdf = new SimpleDateFormat("E yyyy/MM/dd HH:mm:ss"); // E = day
//        System.out.println(sdf.format(date));

//        System.out.println(date.toString()); // current date
//        System.out.println(date.getTime()); // unix timestamp (milliseconds since 1970
//        System.out.println(date.getMonth() + 1); // get current month number (zero-based index, need to add 1)
//        System.out.println(date.getYear() + 1900); // need to add 1900 to year
//        System.out.println(date.getDay()); // 0=Sunday
//        System.out.println(date.getHours()); // correct hour


    public static void main(String[] args) {

/*  ### Date Format Converter Program
    **Take in the following format:**
            ```MM/DD/YYYY```
            **Output the following:**
            ```MonthName DD, YYYY```
            **Example:**
    input - ```12/01/1999```
    output - ```December 12, 1999```
    *
    * Converting date to string = formatting
    * Converting string to date = parsing
 */

        // Creating a date string based on current datetime
        LocalDateTime myDate = LocalDateTime.now();
        System.out.println("Current date and time is: " + myDate); // 2020-06-10T15:03:33.542827
        // Formatting the date in the specified pattern
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println("Starting date format: " + dtf.format(myDate)); // 06/10/2020
        // Converting the date pattern to a string
        String stringDate = dtf.format(myDate);
        // Pass the formatted date string to the converter
        String finalDateString = convertDateFormat(stringDate);
        System.out.println("Converted date format: " + finalDateString);

        // Using older method w/SimpleDateFormat
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a date in MM/dd/yyy format: ");
        String inputDate = sc.nextLine();
        String outputDate = convertSimpleDateFormat(inputDate);
        System.out.println("Converted date format: " + outputDate);

    /*            ### Sentence Analyzer Program
    Create sentence analyzer program that tells the user how many vowels and consonants were used.
    **Example:**
    input - ```"The hills are alive."```
    output - ```7 vowels and 9 consonants```
 */

/*            ### Command Line Calculator
    The program should welcome the user, prompt them for a calculation,
    and give the result. The user should be prompted after each result is
    outputted if they want to enter another calculation. When they
    say no, give them an exit message. Allow the user first to specify
    how many operands they will enter. Do not worry about
    input validation (assume user enters correct data type).
            ​
    Example program:
            ```
    WELCOME TO THE CALCULATOR APP!!! (program output)
            ​
    Do you wish to enter a new calculation? (program output)
    yes (user inputs this)
​
    How many operands will you calculate? (program output)
            2 (user inputs this)
            ​
    Please enter a calculation: (program output)
            2 + 2 (user enters this or something like this)
    The output of 2 + 2 is 4. (program outputs this)
            ​
    Do you wish to enter a new calculation? (program outputs this)
    no (user enters this)
    GOODBYE!!!


 */

    }
}
