package com.preparation.pandru;

import java.util.Scanner;

/**
 * @author dharmu.i on 2019-10-02
 */
public class Prime {

    private boolean isPrime(int factValue){
        int divisor = 2;
        while ( divisor <= factValue-1){
            if (factValue % divisor == 0){
                return false;
            }
            divisor = divisor + 1;
        }
        return true;
    }

    public static void main(String[] args){
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number");
            int primeValue = scanner.nextInt();
            Prime prime = new Prime();
            if (prime.isPrime(primeValue)) {
                System.out.println("Given number is prime");
            } else {
                System.out.println("Given number is not prime");
            }
        }
    }
}
