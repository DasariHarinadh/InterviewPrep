package com.interview.programs.algoexpert;

public class ValidateSubSequence {

    public static void main(String[] args) {

        int arr[] = {5, 1, 22, 25, 6, -1, 8, 10};

        int[] sequence = {1, 6, -1, 10};

        boolean isValidSubSequence = vaidateSubSequence(arr, sequence);

        System.out.println(isValidSubSequence);

    }

    private static boolean vaidateSubSequence(int[] arr, int[] sequence) {

        int i = 0;
        int j = 0;
        int count = 0;

        while (i < arr.length && j < sequence.length) {

            if (arr[i] == sequence[j]) {
                i++;
                j++;
                count++;
            } else {
                i++;
            }
        }
        if (count == sequence.length) {
            return true;
        }

        return false;
    }
}
