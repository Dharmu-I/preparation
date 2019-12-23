package com.preparation.design.Strategy;

/**
 * dharmu.i on 13/03/19
 */

public class PaymentFee implements Fee {
    @Override
    public void compute() {
        System.out.println("Payment fee computed");
    }
}
