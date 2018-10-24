package com.company;

import java.util.Scanner;

public class ExerPalindromeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            String entry = scan.nextLine();

            if (entry.equalsIgnoreCase("END")) {
                break;
            } else {
                if (entry.equalsIgnoreCase(reverse(entry))) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            }
        }
    }

    public static String reverse(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0 ; i--) {
            reversed = reversed + word.charAt(i);
        }

        return reversed;
    }
}
