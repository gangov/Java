package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ExerPascalTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= size; i++) {
            int[] arrayInt = new int[i];
            arrayInt[0] = 1;
            for (int j = 1; j <= i; j++) {
                arrayInt[j] = arrayInt[j - 1] + arrayInt[j];
            }
            System.out.println(Arrays.toString(arrayInt));
        }
    }
}
