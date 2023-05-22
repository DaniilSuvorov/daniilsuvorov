package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Боинг", 5000, 2020, 200);
        Airplane airplane2 = new Airplane("Боинг", 5000, 2020, 100);
        Airplane.compareAirplanes(airplane1, airplane2);

    }
}