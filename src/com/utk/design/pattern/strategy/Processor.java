package com.utk.design.pattern.strategy;

public class Processor {

    public String name(){
        return getClass().getSimpleName();
    }

    public Object process(Object input) {
        return input;
    }
}
