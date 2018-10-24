package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ExerZigZagArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = Integer.parseInt(in.nextLine());
        String[] first = new String[size];

        String[] second = new String[size];

        for (int i = 0; i < size; i++) {
            String[] temp = in.nextLine().split(" ");
            if (i % 2 == 0) {
                for (int j = 0; j < 2; j++) {
                    if (j % 2 == 0) {
                        first[i] = temp[j];
                    } else {
                        second[i] = temp[j];
                    }
                }
            } else {
                for (int j = 0; j < 2; j++) {
                    if (j % 2 != 0) {
                        first[i] = temp[j];
                    } else {
                        second[i] = temp[j];
                    }
                }
            }
        }

        for (String i :
                first) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (String i :
                second) {
            System.out.print(i + " ");
        }
    }
}

