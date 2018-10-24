package com.company;

import java.util.Scanner;

public class LabPrintingTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = Integer.parseInt(scan.nextLine());

        drawTriangle(size);
    }

    public static void drawTriangle(int size) {
        // drawing first part
        for (int i = 0; i <= size; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // drawing second part
        for (int i = size - 1; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
