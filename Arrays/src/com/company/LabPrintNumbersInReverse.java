package com.company;

import java.util.Scanner;

public class LabPrintNumbersInReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine());

        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            int entry = Integer.parseInt(scan.nextLine());
            array[i] = entry;
        }

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

    }
}
