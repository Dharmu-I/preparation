package com.preparation.design.Strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * dharmu.i on 13/03/19
 */

public class FeeStatClass {
    private static Map<FeeType,Fee> feeTypeFeeMap = new HashMap<>();

    static {
        feeTypeFeeMap.put(FeeType.PAYMENT_FEE,new PaymentFee());
        feeTypeFeeMap.put(FeeType.PLATFORM_FEE,new PlatformFee());
        feeTypeFeeMap.put(FeeType.SHIPPING_FEE,new ShippingFee());
    }

    public static void computeFee(FeeType feeType){
        feeTypeFeeMap.get(feeType).compute();
    }
}
