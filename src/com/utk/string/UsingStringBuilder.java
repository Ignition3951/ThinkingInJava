package com.utk.string;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsingStringBuilder {

    public static final Logger LOGGER = Logger.getLogger(String.valueOf(UsingStringBuilder.class));

    public static final Random RANDOM = new Random(47);

    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < 25; i++) {
            result.append(RANDOM.nextInt(100));
            result.append(", ");
        }
        result.delete(result.length() - 2, result.length());
        result.append("]");
        return result.toString();
    }

    public static void main(String[] args) {
        UsingStringBuilder usb = new UsingStringBuilder();
        LOGGER.log(Level.INFO,()->"Exception caught: "+usb);
    }
}
