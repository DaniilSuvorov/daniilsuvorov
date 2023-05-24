package day9.Task2;

public class Triangle extends Figure{
    private double sideLength1;
    private double sideLength2;
    private double sideLength3;

    public Triangle(String color, double sideLength1, double sideLength2, double sideLength3) {
        super(color);
        this.sideLength1 = sideLength1;
        this.sideLength2 = sideLength2;
        this.sideLength3 = sideLength3;
    }

    public double perimeter() {
        return sideLength1 + sideLength2 + sideLength3;
    }
    public double area() {
        double p = (sideLength1 + sideLength2 + sideLength3) / 2;
        return Math.pow(p * (p - sideLength1) * (p - sideLength2) * (p - sideLength3), 0.5);
    }
}
