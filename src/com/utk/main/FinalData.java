package com.utk.main;

import com.utk.model.Value;

public class FinalData {

    private static final Value INT_VALUE = new Value(10);

    public static void main(String[] args) {
        System.out.println("FinalData.main()");

        // Attempting to modify the final reference
        // INT_VALUE = new Value(20); // This will cause a compilation error

        // Modifying the internal state of the object
        INT_VALUE.i = 20; // This is allowed since the reference itself is not final

        System.out.println("Modified value: " + INT_VALUE.i);
    }
}
