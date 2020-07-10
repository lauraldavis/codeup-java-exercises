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
//        It only works if you instantiate the object with the Quadrilateral class/type, or with Rectangle/Square.
//        Quadrilateral is an abstract class, why can you do this? Because it's only abstracted in the getArea() and getPerimeter() methods
        Quadrilateral r2 = new Rectangle(3, 2);
        System.out.println(r2.getLength());
        System.out.println(r2.getWidth());
        System.out.println(r2.getArea());

//        Question: is the blank constructor needed on Square and/or Rectangle? (no)
//        It functions to instantiate a new shape without passing arguments. In this case it serves no purpose because you can't access the
//        SetLength/SetWidth methods without changing the class type to Quadrilateral. So you probably don't want any of those blank constructors,
//        to prevent creating an empty shape that can't be set? (In real-world you would probably add setters to make it usable.)
        Measurable r3 = new Rectangle(5,1);
        System.out.println(r3.getArea()); // prints 5.0
//        r3.setLength(4);
        Measurable s = new Square(1.5);
        System.out.println(s.getArea()); // prints 2.25
//        s.setLength(3.3);

        // walkthrough notes
        // the Shape class would be where you would add properties applicable to all shapes, not just Quadrilaterals, like id, color
        // It's possible to create an object with the lower class, set properties, then assign the object to Quadrilateral
        Square s2 = new Square(2.5);
        System.out.println(s2.getArea());
        s2.setLength(4);
        Quadrilateral q1 = s2;
        System.out.println(q1.getArea());


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
