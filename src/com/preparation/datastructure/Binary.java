package com.preparation.datastructure;

public class Binary {

    public static void BinaryValue(int n, int[] A){
        if (n < 1){
            System.out.println(A.toString());
        }else {
            A[n-1] = 0;
            BinaryValue(n-1, A);
            A[n-1] = 1;
            BinaryValue(n-1, A);
        }
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        BinaryValue(5, A);
    }
}
