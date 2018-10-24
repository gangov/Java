package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ExerTopInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(in.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value))
                .toArray();

        for (int i = 0; i <= numbers.length; i++) {
            int j;
            for (j = i + 1; j < numbers.length; j++) {
                if (numbers[i] <= numbers[j]) {
                    break;
                }
            }

            if (j == numbers.length) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}

