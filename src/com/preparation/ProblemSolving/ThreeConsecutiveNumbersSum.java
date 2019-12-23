package com.preparation.ProblemSolving;

import java.util.ArrayList;
import java.util.List;

public class ThreeConsecutiveNumbersSum {

    private static List<List<Integer>> getTheNumberList(int[] nums) {
        List<List<Integer>> integerList = new ArrayList<>();
        for (int i=0;i<nums.length-2;i++){
            int j = i+1;
            while (j < nums.length-1){
                int sum = nums[i]+nums[j]+nums[j+1];
                if (sum==0){
                    List<Integer> integers = new ArrayList<>();
                    integers.add(nums[i]);
                    integers.add(nums[j]);
                    integers.add(nums[j+1]);
                    Boolean flag = true;
                    for (int x=0;i<integerList.size();i++){
                         if (integerList.get(x).get(0) != integers.get(0) && integerList.get(x).get(1) != integers.get(1) && integerList.get(x).get(2) != integers.get(2)){
                             flag = false;
                         }
                    }
                    if (flag){
                        integerList.add(integers);
                    }

                }
                j = j+1;
            }
        }
        return integerList;
    }

    private static void displayArray(List<List<Integer>> integerList){
        while (!integerList.isEmpty()){
            List<Integer> integers = integerList.remove(0);
            while (!integers.isEmpty()){
                System.out.print(integers.remove(0)+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[] numberList = {0,0,0};
        List<List<Integer>> differentNumberList = getTheNumberList(numberList);
        displayArray(differentNumberList);
    }
}
