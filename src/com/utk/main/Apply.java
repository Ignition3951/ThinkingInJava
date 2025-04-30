package com.utk.main;

import com.utk.model.Downcase;
import com.utk.model.Processor;
import com.utk.model.Splitter;
import com.utk.model.Upcase;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Apply {

    private static final Logger logger = Logger.getLogger(String.valueOf(Apply.class));
    public static void process(Processor p, Object s) {
        logger.log(Level.INFO,() -> "Using Processor : "+p.name());
        logger.log(Level.INFO,()->""+p.process(s));
    }

    private static final String VALUE =
            "Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new Upcase(), VALUE);
        process(new Downcase(), VALUE);
        process(new Splitter(), VALUE);
    }
}
