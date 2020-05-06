package application ;

import Services.Factory;
import Services.VehicleRegistrator;


public class App implements Runnable {


    public void run() {
        VehicleRegistrator reg = VehicleRegistrator.getVehicleRegistrator();
//        try {
            for (int i = 0; i < 100 ; i++) {
                reg.register(Factory.buildVehicle());
            }
//        } catch ( e) {
//            e.printStackTrace();
//        }

    }

    public static void main(String[] args) {
        App t1 = new App();
        App t2 = new App();
        t1.run();
        t2.run();
    }
}
