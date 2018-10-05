package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class LabSumEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] intArr = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int sum = 0;

        for (int i :
                intArr) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
