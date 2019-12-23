package com.preparation.hacker;

import java.io.*;
import java.util.*;

public class ArrayManipulation {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        long max = Long.MIN_VALUE;
        if (queries.length > 0 && n >= 3) {
            int m = queries.length;
            long[][] computationalArray = new long[m + 1][n];

            for (int i = 0; i <= m; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0) {
                        computationalArray[i][j] = 0;
                    } else {
                        if (j >= queries[i - 1][0] - 1 && j <= queries[i - 1][1] - 1) {
                            computationalArray[i][j] = computationalArray[i - 1][j] + queries[i - 1][2];
                        } else {
                            computationalArray[i][j] = computationalArray[i - 1][j];
                        }
                    }

                    if (max < computationalArray[i][j]){
                        max = computationalArray[i][j];
                    }
                }
            }
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);
        System.out.println("Max value : "+result);
        scanner.close();
    }
}
