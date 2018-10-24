package com.company;

import java.util.Scanner;

public class ExerTrain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = Integer.parseInt(in.nextLine());
        int[] train = new int[num];
        int total = 0;

        for (int i = 0; i < num; i++) {
            train[i] = Integer.parseInt(in.nextLine());
            total += train[i];
        }

        for (int wagon :
                train) {
            System.out.print(wagon + " ");
        }

        System.out.println();
        System.out.println(total);
    }
}
