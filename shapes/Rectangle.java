package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    void setLength(double length) {
        this.length = length;
    }

    @Override
    void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    /* //    code from Inheritance and Polymorphism
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

     */
}
