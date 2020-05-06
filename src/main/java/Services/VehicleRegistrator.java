package Services;


import Transoprt.models.Vehicle;

import java.io.*;

public class VehicleRegistrator {
    private static final VehicleRegistrator registratorInstance = new VehicleRegistrator();

    public static VehicleRegistrator getVehicleRegistrator() {
        return registratorInstance;
    }

    private VehicleRegistrator() {

    }

    public  void register(Vehicle veh) throws RuntimeException {
        String s = veh.getGovNubmer();
        write(s);


    }

    private static  void write(String text) throws RuntimeException {

        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("id.txt", true)));

            try {
                out.println(text);
            } finally {
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }

}
