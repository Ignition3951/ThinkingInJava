package com.utk.model;

public class Splitter extends Processor{

    @Override
    public String process(Object input) {
        return ((String)input).replaceAll("\\s+", "\n");
    }
}
