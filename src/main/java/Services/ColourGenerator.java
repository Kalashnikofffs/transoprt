package Services;

import javafx.scene.paint.RadialGradient;

import javax.swing.*;
import java.util.Random;

public class ColourGenerator {
    public static String generate() {
        String colour = null;
        final Random random = new Random();
        switch (random.nextInt(5)) {
            case 0:
                colour = "Blue";
                break;
            case 1:
                colour = "Red";
                break;
            case 2:
                colour = "Yellow";
                break;
            case 3:
                colour = "Green";
                break;
            case 4:
                colour = "Silver";


        }
        return colour;

    }


    }


