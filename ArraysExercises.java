import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson (Person[] array, String name) { // walkthrough: addPerson(Person[] arrayname, Person person); & New Person(name) when called
        Person[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = new Person(name);
//        newArray[newArray.length - 1].setName(name);
        return newArray;
    }

    public static void main(String[] args) {

        // 1. What happens when you run this code? Why is Arrays.toString necessary
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
        // It prints the reference/pointer for the numbers array. Use Arrays.toString() to print array contents

        // Create an array that holds 3 person objects. Assign a new instance of Person class to each.
        Person[] brkRoom4 = {new Person("Andrew"), new Person ("Jahziel"), new Person ("Michael")};

        // Iterate through and print the name of each person in the array
        System.out.println("Printing brkRoom4 objects:");
        for (Person student : brkRoom4) {
            System.out.println(student.getName());
        }

        // Create a static method named addPerson to accept an array of Person objects, and a single Person object to add to the passed array.
        // It should return an array whose length is 1 greater than the passed array, with the passed person at the end of the array.
        Person[] breakoutRoom4 = addPerson(brkRoom4, "Damon"); // walkthrough used addPerson(arrayname, new Person("name"));
        System.out.println("Printing breakoutRoom4 objects:");
        for (Person student : breakoutRoom4) {
            System.out.println(student.getName());
        }

        // 2. see Class ServerNameGenerator
        // 3. see Package movies


    }
}
