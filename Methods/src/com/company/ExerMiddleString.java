package com.company;

import java.util.Scanner;

public class ExerMiddleString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        returnMiddle(input);
    }

    public static void returnMiddle(String word) {
        if (word.length() % 2 != 0) {
            int toPrint = word.length() / 2;
            System.out.println(word.charAt(toPrint));
        } else {
            int toPrint = word.length() / 2 - 1;
            System.out.print(word.charAt(toPrint));
            System.out.print(word.charAt(toPrint + 1));
        }
    }
}
