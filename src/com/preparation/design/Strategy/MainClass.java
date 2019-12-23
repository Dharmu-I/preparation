package com.preparation.design.Strategy;

/**
 * dharmu.i on 13/03/19
 */

public class MainClass {
    public static void main(String[] args) {
        FeeStatClass.computeFee(FeeType.PAYMENT_FEE);
        FeeStatClass.computeFee(FeeType.PLATFORM_FEE);
        FeeStatClass.computeFee(FeeType.SHIPPING_FEE);
    }
}
