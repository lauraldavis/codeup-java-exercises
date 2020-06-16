package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle() {}

    public Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    public double getArea() {
        return length * width;
    }
}
