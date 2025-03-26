package com.interview.programs.algoexpert;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoNumberSum {

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 3, 3, 4, 9, 7, 2, 6, 3, 6};

        int sum = 9;
        List<Integer> al = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        for (int num : arr) {
            if (visited.contains(sum - num)) {
                al.add(sum - num);
                al.add(num);
            } else {
                visited.add(num);
            }
        }

        System.out.println(al);
    }
}
