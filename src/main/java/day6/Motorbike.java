package day6;

public class Motorbike {
    private String model;
    private String colour;
    private int yearOfRelease;

    public Motorbike(String model, String colour, int yearOfRelease) {
        this.model = model;
        this.colour = colour;
        this.yearOfRelease = yearOfRelease;
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
        System.out.println("Это мотоцикл");
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

