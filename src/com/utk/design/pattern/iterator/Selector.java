package com.utk.design.pattern.iterator;

interface Selector {

    boolean end();

    Object current();

    void next();
}
