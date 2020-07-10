public class Person {

    private String name;

    // this. ensures use of instance name over a local variable, if one exists
    // good practice to include it even when there is no local variable

    //    Constructor
    public Person(String name) {
        this.name = name;
        // if the setter transforms the data you could use it instead
        // setName(name);
    }
    // Getter
    public String getName(){
//TODO: return the person's name
        return this.name;
    }
    // Setter
    public void setName(String name){
//TODO: change the name property to the passed value
        this.name = name;
    }
    // Method
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.printf("Hello, %s%n", this.name);
        // If the getter transforms the data you could use it instead
        // System.out.printf("Hello, %s%n", getName());
    }

    public static void main(String[] args) {
        Person p1 = new Person("Laura");
        System.out.println(p1.getName());
        p1.sayHello();

        // Understanding references

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); // true
//        System.out.println(person1 == person2); // false - each has a unique reference/pointer value

//        Person person1 = new Person("John");
//        Person person2 = person1; // not creating a copy, just an alias / different name
//        System.out.println(person1 == person2); // true - both have the same reference/pointer value

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName()); // both return Jane because they are the same reference/pointer
//        System.out.println(person2.getName());






    }
}
