package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class LabEvenAndOddSubstraction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numArr = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int sumOdd = 0;
        int sumEven = 0;
        for (int i :
                numArr) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }

        System.out.println(sumEven - sumOdd);
    }
}
