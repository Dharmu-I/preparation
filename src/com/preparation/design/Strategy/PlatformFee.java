package com.preparation.design.Strategy;

/**
 * dharmu.i on 13/03/19
 */

public class PlatformFee implements Fee {
    @Override
    public void compute() {
        System.out.println("Platform fee computed");
    }
}
