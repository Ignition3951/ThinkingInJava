package com.utk.design.pattern.strategy;

public class Splitter extends Processor {

    @Override
    public String process(Object input) {
        return ((String)input).replaceAll("\\s+", "\n");
    }
}
