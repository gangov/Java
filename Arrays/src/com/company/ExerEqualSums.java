package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ExerEqualSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arrayN = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value))
                .toArray();
        int hit = 0;

        for (int i = 0; i < arrayN.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int left = 0; left < i; left++) {
                leftSum += arrayN[left];
            }

            for (int right = arrayN.length - 1; right > i; right--) {
                rightSum += arrayN[right];
            }

            if (leftSum == rightSum) {
                hit = i;
            }
        }

        if (arrayN.length == 1) {
            System.out.println(0);
            return;
        }

        if (hit == 0) {
            if (arrayN.length > 3) {
                System.out.println(0);
                return;
            }
            System.out.println("no");
        }
        else {
            System.out.println(hit);
        }
    }
}
