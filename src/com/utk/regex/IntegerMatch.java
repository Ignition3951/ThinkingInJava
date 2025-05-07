package com.utk.regex;

import java.util.logging.Level;
import java.util.logging.Logger;

public class IntegerMatch {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(IntegerMatch.class));

    private static final String MINUSFOLLOWEDBYDIGITS = "-?\\d+";
    private static final String MINUSORPLUSFOLLOWEDBYDIGITS = "-?\\d+";

    public static void main(String[] args) {
        //A number might or might not be preceeded by a - sign followed by digits
        LOGGER.log(Level.INFO, () -> String.valueOf("-1234".matches(MINUSFOLLOWEDBYDIGITS)));
        //A number might or might not be preceeded by a - sign followed by digits
        LOGGER.log(Level.INFO, () -> String.valueOf("5678".matches(MINUSFOLLOWEDBYDIGITS)));
        //A number might or might not be preceeded by a - sign followed by digits
        LOGGER.log(Level.INFO, () -> String.valueOf("+911".matches(MINUSFOLLOWEDBYDIGITS)));
        //A number might or might not be preceeded by a - or + sign followed by digits
        LOGGER.log(Level.INFO, () -> String.valueOf("+911".matches(MINUSORPLUSFOLLOWEDBYDIGITS)));
    }
}
