package day9.Task2;

public class Circle extends Figure{
     private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
