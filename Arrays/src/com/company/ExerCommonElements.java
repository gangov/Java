package com.company;

import java.util.Scanner;

public class ExerCommonElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] first = in.nextLine().split(" ");
        String[] second = in.nextLine().split(" ");

        for (int i = 0; i < second.length; i++) {
            for (int j = 0; j < first.length; j++) {
                if (second[i].equals(first[j])) {
                    System.out.print(second[i] + " ");
                }
            }
        }
    }
}
