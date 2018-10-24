package com.company;

import java.util.Scanner;

public class LabRepeatString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String repeatWhat = scan.nextLine();
        int times = Integer.parseInt(scan.nextLine());

        repeatString(repeatWhat, times);
    }

    public static void repeatString(String entry, int times) {
        String total = "";
        for (int i = 0; i < times; i++) {
            total += entry;
        }

        System.out.println(total);
    }
}
