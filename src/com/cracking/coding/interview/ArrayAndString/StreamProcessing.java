package com.cracking.coding.interview.ArrayAndString;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * @author dharmu.i on 2019-10-15
 */
public class StreamProcessing {

    public static void main(String[] args) {
        ArrayList<String> values = new ArrayList<>();
        values.add("Dharmu");values.add("Dharmu1");values.add("Dharmu2");values.add("Dharmu3");values.add("Dharmu");values.add("Dharmu4");

        values = values.stream().filter(value -> !value.equalsIgnoreCase("dharmu")).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(values);
    }
}
