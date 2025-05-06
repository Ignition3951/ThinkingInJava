package com.utk.exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LostMessage {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(LostMessage.class));

    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args) {
        try{
            LostMessage lm = new LostMessage();
            try{
                lm.f();
            }
            finally {
                lm.dispose();
            }
        }
        catch (Exception e){
            LOGGER.log(Level.SEVERE,"Exception caught: ", e);
        }
    }
}
