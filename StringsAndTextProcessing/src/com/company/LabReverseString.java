package com.company;

import java.util.Scanner;

public class LabReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String entry = scan.nextLine();

        while (!entry.equals("end")) {

            StringBuilder reversed = reverseIt(entry);

            System.out.println(entry + " = " + reversed);

            entry = scan.nextLine();
        }
    }

    private static StringBuilder reverseIt(String entry) {
        StringBuilder result = new StringBuilder();
        for (int i = entry.length() - 1; i >= 0; i--) {
            result.append(entry.charAt(i));
        }

        return result;
    }
}
