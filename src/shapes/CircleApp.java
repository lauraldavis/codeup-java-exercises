package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input in = new Input();

        boolean willContinue = false;
        do {
        double radius = in.getDouble();

        Circle c = new Circle(radius);
        System.out.println(c.getArea());
        System.out.println(c.getCircumference());

        System.out.println("Circle count is: " + Circle.getCircleCount());

        willContinue = in.yesNo("Do you want to create another circle? (y/n): ");
        } while(willContinue);

    }
}
