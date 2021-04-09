package day9.Task2;

public class Rectangle extends Figure {

    private double width;
    private double height;

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2.0 * (width + height);
    }

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }
}
