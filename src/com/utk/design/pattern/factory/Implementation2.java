package com.utk.design.pattern.factory;

import java.util.logging.Level;
import java.util.logging.Logger;

class Implementation2 implements Service {

    private static final Logger logger = Logger.getLogger(String.valueOf(Implementation2.class));

    Implementation2() {

    }

    @Override
    public void method1() {
        logger.log(Level.INFO, () -> "Implementation2 method1");
    }

    @Override
    public void method2() {
        logger.log(Level.INFO, () -> "Implementation2 method2");
    }
}
