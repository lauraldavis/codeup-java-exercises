package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Rectangle box1 = new Rectangle (5, 4);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

        Rectangle box2 = new Square (5);
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());

        if (box2 instanceof Rectangle){
            System.out.println("this is a rectangle");
        }
        if (box2 instanceof Square) {
            System.out.println("this is a square");
        }
        // box2 is both a Rectangle and a Square

    }
}
