package Transoprt.models;

public class Bike extends Vehicle {
    private int weight;

    public Bike(String govNubmer, int year, int weight) {
        super(govNubmer, year);
        this.weight = weight;
    }

    public Bike(String govNubmer, int weight) {
        super(govNubmer, weight);
    }

    public int getWeigt() {
        return weight;
    }

    public void setWeigt(Integer weight) {
        this.weight = weight;
    }
}
