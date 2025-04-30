package com.utk.model;

public class Processor {

    public String name(){
        return getClass().getSimpleName();
    }

    public Object process(Object input) {
        return input;
    }
}
