package day8;

public class Airplane {
    public Airplane(String manufacturer, int year, int length, int weight) {
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
    public String toString(){
        return "Изготовитель: " + manufacturer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel;
    }

}
