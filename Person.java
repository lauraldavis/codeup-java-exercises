public class Person {

    private String name;

    // Get
    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    // Set
    public void setName(String name){
//TODO: change the name property to the passed value
        this.name = name;
    }

    // Method
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.printf("Hello, %s%n", this.name);
    }

    //    Constructor
    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Laura");
        System.out.println(p1.getName());
        p1.sayHello();

        // Understanding references
//        Person person1 = new Person("John");
////        Person person2 = new Person("John");
////        System.out.println(person1.getName().equals(person2.getName())); // true
////        System.out.println(person1 == person2); // false - each has a unique reference/pointer

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); // true - both are using the same reference/pointer

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName()); // both now return Jane because they are the same reference/pointer
//        System.out.println(person2.getName());






    }
}
