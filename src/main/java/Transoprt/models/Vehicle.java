package Transoprt.models;

public class Vehicle {
    private String govNubmer;
    private int year;

    public String getGovNubmer() {
        return govNubmer;
    }

    public void setGovNubmer(String govNubmer) {
        this.govNubmer = govNubmer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Vehicle(String govNubmer, int weigt) {
        this.govNubmer = govNubmer;
        this.year = weigt;
    }
}
