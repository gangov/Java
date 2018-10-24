package com.company;

import java.util.Scanner;

public class ExerCharactersInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char first = scan.next().charAt(0);
        char second = scan.next().charAt(0);

        if (first < second) {
            for (int i = first + 1; i < second; i++) {
                System.out.print(Character.toString((char) i) + " ");
            }
        } else {
            for (int i = second + 1; i < first; i++) {
                System.out.print(Character.toString((char) i) + " ");
            }
        }
    }
}
