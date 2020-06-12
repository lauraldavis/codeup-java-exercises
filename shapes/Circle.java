package shapes;

public class Circle {

    private static int circleCount = 0;

    public static int getCircleCount() {
        return circleCount;
    }

    private double radius;

    public Circle (double radius) {
        circleCount += 1;
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }
}
