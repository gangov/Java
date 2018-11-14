package com.company;

import java.util.Scanner;

public class LabDigitLettersAndOthers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                System.out.print(input.charAt(i));
            }
        }

        System.out.println();

        for (int j = 0; j < input.length(); j++) {
            if (Character.isLetter(input.charAt(j))) {
                System.out.print(input.charAt(j));
            }
        }

        System.out.println();

        for (int k = 0; k < input.length(); k++) {
            if (!Character.isDigit(input.charAt(k)) && !Character.isLetter(input.charAt(k))) {
                System.out.print(input.charAt(k));
            }
        }
    }
}
