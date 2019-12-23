package com.cracking.coding.interview.ArrayAndString;

/**
 * @author dharmu.i on 2019-10-21
 */
public class SpaceReplacer {

    public static String replaceString(String originalString){
        boolean removeExtraSpace = false;
        int index = originalString.length()-1;
        char[] encodedString = new char[23];
        int charPopulationIndex = 22;
        while (index >= 0 && charPopulationIndex >= 0){
            if (originalString.charAt(index) != ' ' && !removeExtraSpace){
                removeExtraSpace = true;
            }

            if (removeExtraSpace && originalString.charAt(index) != ' '){
                encodedString[charPopulationIndex] = originalString.charAt(index);
                charPopulationIndex --;
            }else if (removeExtraSpace){
                encodedString[charPopulationIndex] = '0';
                encodedString[charPopulationIndex - 1] = '2';
                encodedString[charPopulationIndex - 2] = '%';
                charPopulationIndex = charPopulationIndex - 3;
            }
            index--;
        }

        System.out.println(encodedString);
        return String.valueOf(encodedString);
    }

    public static void main(String[] args) {
        // Given string is "Hello how are you     " -> original String -> 17 Answer be "Hello%20how%20%are%20you"
        System.out.println("output string "+replaceString("Hello how are you     "));
    }
}
