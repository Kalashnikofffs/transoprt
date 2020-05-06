package Transoprt.models;

public class Track extends Vehicle {
    double maxWeigt;

    public Track(String govNubmer, int year, double maxWeigt) {
        super(govNubmer, year);
        this.maxWeigt = maxWeigt;
    }

    public double getMaxWeigt() {
        return maxWeigt;
    }

    public void setMaxWeigt(double maxWeigt) {
        this.maxWeigt = maxWeigt;
    }

}
