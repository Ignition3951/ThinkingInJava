package com.utk.model;

public class BandPass extends Filter {

    double lowCutOff;
    double highCutOff;

    public BandPass(double lowCutOff, double highCutOff) {
        this.highCutOff = highCutOff;
        this.lowCutOff = lowCutOff;
    }

}
