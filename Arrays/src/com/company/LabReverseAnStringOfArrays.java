package com.company;

import java.util.Scanner;

public class LabReverseAnStringOfArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] arrayStr = scan.nextLine().split(" ");

        for (int i = arrayStr.length - 1; i >= 0; i--) {
            System.out.print(arrayStr[i] + " ");
        }
    }
}
