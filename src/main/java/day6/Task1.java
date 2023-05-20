package day6;
public class Task1 {
    public static void main(String[] args) {
        Motorbike motorbike1 = new Motorbike("Харлей", "Черный", 2000);
        motorbike1.info();
        System.out.println(motorbike1.yearDifference(1990));
        Car car1 = new Car();
        car1.setModel("Волга");
        car1.setColour("Белый");
        car1.setYearOfRelease(2000);
        car1.info();
        System.out.println(car1.yearDifference(1990));
    }
}

