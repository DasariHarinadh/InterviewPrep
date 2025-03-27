package com.interview.programs.algoexpert;

public class SortedSquaredArray {

    public static void main(String[] args) {

        //This Solution only wors when array is sorted if not sorted first sort and use this algorithm
        int[] arr = {-10,-7, 1, 2, 3, 4, 7, 9};

        int[] sortedSquare = new int[arr.length];

        int start = 0;
        int end = sortedSquare.length - 1;

        int index = arr.length - 1;

        int i = 0;

        while (i < arr.length) {
            int val1 = arr[start] * arr[start];
            int val2 = arr[end] * arr[end];

            if (val1 > val2) {
                sortedSquare[index] = val1;
                start++;
            } else {
                sortedSquare[index] = val2;
                end--;
            }
            i++;
            index--;
        }

        for(int x : sortedSquare){
            System.out.print(x+" ");
        }
    }
}
