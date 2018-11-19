//Write a program that returns an encrypted version of the same text.
//        Encrypt the text by shifting each character with three positions forward.
//        For example A would be replaced by D, B would become E, and so on.
//        Print the encrypted text.

package com.company;

import java.util.Scanner;

public class ExerCeasarCipher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        for (int i = 0; i < input.length(); i++) {
            System.out.print(Character.toString((char) ((input.charAt(i)) + 3)));
        }
    }
}
