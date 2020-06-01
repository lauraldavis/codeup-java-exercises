public class HelloWorld {
    public static void main(String[] args) {
        // Intro to Java exercise
        System.out.print("Hello, World!");
        System.out.println(" Goodbye, World!");

        // Syntax, Types, and Variables exercise
        // 1. Create an int variable named myFavoriteNumber and assign your fav# to it, then print to console
        int myFavoriteNumber = 42;
        System.out.println(myFavoriteNumber);

        // 2. Create a String variable named myString and assign a string value, print to console
        String myString = "What is six times nine?";
        System.out.println(myString);

        // 3. Change code to assign a character value to myString - what do you notice?
//        String myString = 'c';
//        System.out.println(myString);
        // replacing with character string 'c' results in error: incompatible types: char cannot be converted to String

        // 4. Change code to assign value 3.14159 to myString - what happens?
//        String myString = 3.14159;
//        System.out.println(myString);
        // replacing with value 3.14159 results in error: incompatible types: double cannot be converted to String

        // 5. Declare an long variable named myNumber, do not assign it, print myNumber to console - what happens?
//        long myNumber;
//        System.out.println(myNumber);
        // undefined variable results in error: variable myNumber might not have been initialized

        // 6. Change your code to assign the value of 3.14 to myNumber - what do you notice?
//        long myNumber = 3.14;
//        System.out.println(myNumber);
        // 3.14 results in error: incompatible types: possible lossy conversion from double to long

        // 7. Change code to assign the value 123L
//        long myNumber = 123L;
//        System.out.println(myNumber);
        // 123L results in output of 123 (its the same as casting it to a long with = (long) 123;
        // This notation will be useful when casting values into objects

        // 8. Change code to assign the value 123. Why does 3.14 not compile but integer value does?
//        long myNumber = 123;
//        System.out.println(myNumber);
        // 123 results in output of 123 - compiles because long is an integer type with a larger precision

        // 9. Change your code to declare myNumber as a float. Assign 3.14 - what happens? What are 2 ways to fix it?
        float myNumber = (float) 3.14; // or = 3.14f;
        System.out.println(myNumber);
        // 3.14 results in error: incompatible types: possible lossy conversion from double to float
        // Change data type to double: double myNumber = 3.14;
        // cast 3.14 to a float: float myNumber = (float) 3.14;

        // 10. Copy and past the following code blocks one at a time & execute them. What is the difference between them? Explain the output.
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
        // output is 5 and 6 because x is 5 and x is incremented after logging its value
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
        // output is 6 and 6, because x is 5 and x is incremented before logging its value

        // 11. Try to create a variable name class - what happens?
//        String class = "test";
        // error: <identifier> expected (reserved word)

        // 12. Object is the most generic type in Java, you can assign any value. What do you think will happen when this code is run?
        // Expect an error because its trying to cast a string value to an int
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
        // It compiled, but shows result of:
        // Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
        //        at HelloWorld.main(HelloWorld.java:71)

        // How is the above different from this code?
//        int three = (int) "three";
        // It doesn't compile, gets error: incompatible types: String cannot be converted to int

        // What are the 2 types of errors we are observing?
        // The first is a casting error failing in the JVM code run step, casting an object to an int
        // the second is a variable assignment error failing in the compiler, casting a literal string to an int

        // 13. Rewrite the following expressions using relevant shorthand assignment operators
//        int x = 4;
//        x = x + 5;  ->  x += 5; // 9

//        int x = 3;
//        int y = 4;
//        y = y * x;  ->  y *= x; // 12

//        int x = 10;
//        int y = 2;
//        x = x / y;  ->  x /= y;
//        y = y - x;  ->  y -= x;
//        System.out.println(y); // -3

        // 14. What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold?
        // What happens if you increment a numeric variable past the type's capacity? Hint: Integer.MAX_VALUE is a class constant
        // that holds the max value for the int type.
        short shortNum = 32766;
        System.out.println(shortNum);
        short x = ++shortNum;
        System.out.println(x);
        short y = ++shortNum;
        System.out.println(y);
        // assigning a number too large for the data type results in an error, for example:
        // error: incompatible types: possible lossy conversion from int to short
        // incrementing a number variable past the data type capacity results in the value wrapping/resetting to the minimum value it can hold
        // if instead of incrementing, which is limited to a loop of its allowed values, you use y + 10, then it adds properly
        // it takes on the data type of the second number in the operation
/*
32766
32767
-32768
*/

        System.out.println(Double.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);


    }
}
