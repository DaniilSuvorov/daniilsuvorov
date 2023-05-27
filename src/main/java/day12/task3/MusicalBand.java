package day12.task3;

public class MusicalBand {
    private String name;
    private int year;

    public MusicalBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MusicalBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
