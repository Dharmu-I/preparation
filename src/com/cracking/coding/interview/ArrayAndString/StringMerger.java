package com.cracking.coding.interview.ArrayAndString;

/**
 * @author dharmu.i on 2019-10-20
 */
public class StringMerger {

    public static String mergeString(String originalString){
        int index = 0;
        int consecutive = 0;
        StringBuilder mergedString = new StringBuilder();

        while (index < originalString.length()){
            consecutive++;
            if (index+1 >= originalString.length() || originalString.charAt(index) != originalString.charAt(index+1)){
                mergedString.append(originalString.charAt(index));
                mergedString.append(consecutive);
                consecutive = 0;
            }
            index++;
        }

        return ((originalString.length() > mergedString.length())?mergedString.toString():originalString);
    }


    public static void main(String[] args) {

        // Trial string aaabbcccdaaa result => a3b2c3d1a3

        System.out.println("Merged string "+mergeString("aaabbcccdaaa"));
    }
}
