package com.utk.design.pattern.factory;

import java.util.logging.Level;
import java.util.logging.Logger;

class Implementation1 implements Service {

    private static final Logger logger = Logger.getLogger(String.valueOf(Implementation1.class));

    private Implementation1() {

    }

    @Override
    public void method1() {
        logger.log(Level.INFO, () -> "Implementation1 method1");
    }

    @Override
    public void method2() {
        logger.log(Level.INFO, () -> "Implementation1 method2");
    }

    public static final ServiceFactory serviceFactory = (Implementation1::new); // lambda expression
}
