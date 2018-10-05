package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class LabEqualArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] first = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int[] second = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int match = 0;
        int firstSum = 0;
        for (int i :
                first) {
            firstSum += i;
        }

        for (int i = 0; i < first.length; i++) {
            if (first[i] == second[i]) {
                match++;
            } else {
                System.out.printf("Arrays are not identical. Found difference at %d index.", match);
                break;
            }
        }

        if (match == first.length) {
            System.out.println("Arrays are identical. Sum: " + firstSum);
        }
    }
}
