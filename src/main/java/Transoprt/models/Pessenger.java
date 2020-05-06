package Transoprt.models;

public class Pessenger extends Vehicle {
    private String colour;

    public Pessenger(String govNubmer, int year, String colour) {
        super(govNubmer, year);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
