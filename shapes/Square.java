package shapes;

public class Square extends Rectangle {
    private int side;

    public Square (int side) {
//        super(side,side); // this syntax is valid but the test results in zero values
        this.side = side;
    }

    public int getArea() {
        return 2 * side;
    }

    public int getPerimeter() {
        return 4 * side;
    }

}
