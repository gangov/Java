package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BakingFactory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> totals = new ArrayList<>();
        int highestSum = 0;
        List<Integer> bestBatch = new ArrayList<>();

        while (true) {
            int sum = 0;
            String entry = scan.nextLine();
            if (entry.equalsIgnoreCase("bake it!")) {
                break;
            }

            List<Integer> batches = Arrays.stream(entry.split("#"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            for (int i :
                    batches) {
                sum += i;
            }

            if (sum > highestSum) {
                highestSum = sum;
                bestBatch = batches;
            }
        }

        System.out.println("Best Batch quality: " + highestSum);
        for (int i :
                bestBatch) {
            System.out.print(i + " ");
        }
    }
}
