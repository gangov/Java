package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LabGaussTrick {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        for (int i = 0; i <= nums.size() / 2; i++) {
            nums.set(i, nums.get(i) + nums.get(nums.size() - 1));
            nums.remove(nums.size() - 1);
        }

        for (int i = 0; i <= nums.size() - 1; i++) {
            System.out.print(nums.get(i) + " ");
        }
    }
}
