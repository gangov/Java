package com.company;

import java.util.Scanner;

public class ExerDateTypes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String type = scan.nextLine();

    }

    public static void returnInt(String entryNum) {
        System.out.println(Integer.parseInt(entryNum) * 2);
    }

    public static void returnReal(String entryNum) {
        System.out.printf("%.2f", Double.parseDouble(entryNum) * 1.5);
    }

    public static void returnSTring(String entryNum) {
        System.out.println("$" + entryNum + "$");
    }
}
