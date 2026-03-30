package Graphics;

public class Rectangle implements Shape {
    double length, width;

    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public double area() {
        return length * width;
    }
}