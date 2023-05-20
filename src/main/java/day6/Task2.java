package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Боинг", 200, 2020, 200);
        airplane1.setYear(2019);
        airplane1.setLength(100);
        airplane1.fillUp(10);
        airplane1.fillUp(25);
        airplane1.info();
    }
}
