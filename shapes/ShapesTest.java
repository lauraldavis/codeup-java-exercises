package shapes;

public class ShapesTest {
    public static void main(String[] args) {

//        Interfaces and Abstract Classes (#1-7)
        Measurable myShape = new Square(5.0);
        System.out.println( myShape.getArea() );
        System.out.println( myShape.getPerimeter() );

        // Interfaces are like a blueprint, they are a specific type of abstract class
        // The method of getting the area/perimeter of a triangle or circle would be different than quadrilaterals
        Measurable r1 = new Rectangle(5.0, 4.0);
        System.out.println(r1.getPerimeter());
        System.out.println(r1.getArea());
//        9. Leaving getPerimeter() method off Rectangle fails w/compile error because:
//        the Measurable interface exposes the methods but doesn't define them.
//        Interfaces form a contract between the class and the outside world, and this contract is enforced at build time by the compiler.

//        10. What happens if you call getLength()/getWidth() methods of the myShape variable?
//        System.out.println(r1.getLength()); //
//        error: Cannot resolve getLength method in Measurable
//        This only works if you instantiate the object with the Quadrilateral class/type, or with Rectangle/Square
//        Quadrilateral is an abstract class, why can you do this? Because its only abstracted in the getArea() and getPerimeter() methods
        Quadrilateral r2 = new Rectangle(3, 2);
        System.out.println(r2.getLength());
        System.out.println(r2.getArea());



        /* //    code from Inheritance and Polymorphism
        Rectangle box1 = new Rectangle (5, 4);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

        Rectangle box2 = new Square (5); // declaring type more generally (as a Rectangle) allows more functionality - can do things with all the Rectangle objects
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());

        if (box2 instanceof Rectangle){
            System.out.println("this is a rectangle");
        }
        if (box2 instanceof Square) {
            System.out.println("this is a square");
        }
        // box2 is both a Rectangle and a Square because of how it's declared


         */
    }
}
