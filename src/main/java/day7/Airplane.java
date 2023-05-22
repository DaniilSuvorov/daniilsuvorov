package day7;

public class Airplane {
    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if(airplane1.length > airplane2.length) {
            System.out.println("Первый самолёт длинее второго");
        } else if (airplane1.length < airplane2.length) {
            System.out.println("Второй самолет длинее первого");
        } else{
            System.out.println("Длины равны");
        }
    }
    public Airplane(String manufacturer, int weight, int year, int length) {
        this.manufacturer = manufacturer;
        this.weight = weight;
        this.year = year;
        this.length = length;
        fuel = 0;
    }

    private String manufacturer;
    private int weight;
    private int year;
    private int length;
    private int fuel;

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }
    void info(){
        System.out.printf("Изготовитель: %s , год выпуска: %d , длина: %d, вес: %d, количество топлива в баке: %d %n", manufacturer, year, length, weight, fuel);
    }
    void fillUp(int n) {
        fuel += n;
    }

}
