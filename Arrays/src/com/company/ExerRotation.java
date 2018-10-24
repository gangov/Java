package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ExerRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] start = in.nextLine().split(" ");
        int times = Integer.parseInt(in.nextLine());

        for (int j = 0; j < times; j++) {
            String temp = start[0];
            for (int i = 0; i < start.length - 1; i++) {
                start[i] = start[i + 1];
            }
            start[start.length - 1] = temp;
        }
        for (String i :
                start) {
            System.out.print(i + " ");
        }
    }
}
