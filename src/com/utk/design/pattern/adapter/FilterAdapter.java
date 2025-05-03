package com.utk.design.pattern.adapter;

import com.utk.design.pattern.strategy.Processor;

public class FilterAdapter extends Processor {

    Filter filter;

    public FilterAdapter(Filter filter){
        this.filter=filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Waveform process(Object input) {
        return filter.process((Waveform) input);
    }
}
