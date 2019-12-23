package com.cracking.coding.interview.ArrayAndString;

/**
 * @author dharmu.i on 2019-10-11
 */
public class UniqueCheckerOfCharacter {

    public static boolean isUniqueChecker(String value){

        int checker = 0;
        for (int i=0; i < value.length(); i++){
            int val = value.charAt(i) - 'a';
            System.out.println("Value : "+val);
            System.out.println("1 << val value : "+(1 << val));
            if ((checker & (1 << val)) > 0){
                return false;
            }

            checker |= (1 << val);
        }

        return true;
    }

    public static void main(String[] args) {

        if (isUniqueChecker("dharm")){
            System.out.println("All characters are unique in String");
        }else {
            System.out.println("Characters are not unique");
        }
    }
}
