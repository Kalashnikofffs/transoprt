package Services;

import java.util.Random;

public class GovnumberGenerator {
    //TODO Make the method below able to generate wrong govNumbers
    public static String generate() {
        String letters = "абвгдежзиклмнопрстуфхцчэюя";
        String numbers = "0123456789";
        Random random = new Random();
        char[] symbols = new char[letters.length()];
        char[] digits = new char[numbers.length()];
        int i = 0;
        int k = 0;
        for (char letter : letters.toCharArray()) {
            symbols[i] = letter;
            i++;
        }
        for (char number : numbers.toCharArray()) {
            digits[k] = number;
            k++;
        }
        return Character.toString(symbols[random.nextInt(symbols.length)]) +
                Character.toString(digits[random.nextInt(digits.length)]) +
                Character.toString(digits[random.nextInt(digits.length)]) +
                Character.toString(digits[random.nextInt(digits.length)]) +
                Character.toString(symbols[random.nextInt(symbols.length)]) +
                Character.toString(symbols[random.nextInt(symbols.length)]);

    }

}

