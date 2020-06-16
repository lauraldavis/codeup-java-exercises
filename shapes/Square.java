package shapes;

public class Square extends Rectangle {

    public Square (double side) {
        super(side,side); // this syntax is valid, changed my overridden methods to use length rather than side
//        this.side = side; // this was working for me, using side in overridden methods, but isn't what the exercise expected
    }

    public double getPerimeter() {
        System.out.println("Using Square getPerimeter method");
        return 4 * length;
    }

    public double getArea() {
        System.out.println("Using Square getArea method");
        return Math.pow(length,2);
    }

}
