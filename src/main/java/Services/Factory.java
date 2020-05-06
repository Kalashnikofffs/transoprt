package Services;

import Transoprt.models.*;

import java.util.Random;

public class Factory {
    public static Vehicle buildVehicle() {
        final Random random = new Random();
        int vehicleType = random.nextInt(4);
        Vehicle vehicle = null;
        switch (vehicleType) {
            case 0:
                vehicle = new Pessenger(GovnumberGenerator.generate(), YearGenerator.generate(), ColourGenerator.generate());
                break;
            case 1:
                vehicle = new Track(GovnumberGenerator.generate(), YearGenerator.generate(), random.nextInt(2000));
                break;
            case 2:
                vehicle = new Bus(GovnumberGenerator.generate(), YearGenerator.generate(), random.nextInt(200));
            case 3:
                vehicle = new Bike(GovnumberGenerator.generate(), YearGenerator.generate(), random.nextInt(300));
        }
        return vehicle;
    }
}
