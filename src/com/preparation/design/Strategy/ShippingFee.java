package com.preparation.design.Strategy;

/**
 * dharmu.i on 13/03/19
 */

public class ShippingFee implements Fee {
    @Override
    public void compute() {
        System.out.println("Shipping fee computed");
    }
}
