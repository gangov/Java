package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExerMagicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value))
                .toArray();
        int count = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j <= numbers.length - 1; j++) {
                if (numbers[i] + numbers[j] == count) {
                    System.out.println(numbers[i] + " " + numbers[j]);
                }
            }
        }
    }
}
