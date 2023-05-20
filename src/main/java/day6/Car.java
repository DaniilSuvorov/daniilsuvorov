package day6;

public class Car {
    private String model;
    private String colour;
    private int yearOfRelease;

    public void setModel(String x) {
        model = x;
    }

    public void setColour(String x) {
        colour = x;
    }

    public void setYearOfRelease(int x) {
        yearOfRelease = x;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }
    void info(){
        System.out.println("Это автомобиль");
    }
    int yearDifference(int inputYear){
        int difference = 0;
        if (inputYear < yearOfRelease){
            difference = yearOfRelease - inputYear;
        } else {
            difference = inputYear - yearOfRelease;
        }
        return difference;
    }
}

