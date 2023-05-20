package day5;

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
}

