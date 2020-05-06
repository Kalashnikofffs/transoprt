package Transoprt.models;

public class Bus extends Vehicle {
   private int maxPassengers;

    public Bus(String govNubmer, int weigt, int maxPassengers) {
        super(govNubmer, weigt);
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }
}
