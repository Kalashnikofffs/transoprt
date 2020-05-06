package Services;

import java.util.Random;

public class YearGenerator {


    public static int generate() {
        Random random = new Random();

        int year;
        while (true) {
            year = random.nextInt(2020);
            if (year > 1975) {
                break;
            }

        }
        return year;
    }


}



