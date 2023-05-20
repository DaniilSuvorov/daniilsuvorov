package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Волга");
        car1.setColour("Белый");
        car1.setYearOfRelease(2000);
        System.out.println(car1.getModel());
        System.out.println(car1.getColour());
        System.out.println(car1.getYearOfRelease());
    }
}
