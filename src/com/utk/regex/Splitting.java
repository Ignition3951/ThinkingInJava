package com.utk.regex;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Splitting {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Splitting.class));

    static final String KNIGHTS = "Then, when you have found the shrubbery, you must" +
            " cut down the mightiest tree in the forest... " +
            "with... a herring!";

    public static void split(String regex) {
        LOGGER.log(Level.INFO, () -> "Splitting using regex: " + Arrays.toString(KNIGHTS.split(regex)));
    }

    public static void main(String[] args) {
        split(" ");// Doesn’t have to contain regex chars
        split("\\W+");// Non-word characters
        split("n\\W+"); // ‘n’ followed by non-word characters
                              // (the lowercase version, ‘\w’, means a word character)

    }

}
