package com.company;

import java.util.Scanner;

public class LabGreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String type = scan.nextLine();
        var a = scan.nextLine();
        var b = scan.nextLine();

        greaterValue(a, b);
    }

    public static void greaterValue(int a, int b) {
        System.out.println(Math.max(Integer.parseInt(String.valueOf(a)), Integer.parseInt(String.valueOf(b))));
    }

    public static void greaterValue(char a, char b) {
        System.out.println(Math.max((int) a, (int) b));
    }

    public static void greaterValue(String a, String b) {
        if (a.length() > b.length()) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
