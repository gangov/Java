package com.company;

import java.util.Scanner;

public class Deciphering {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String[] code = scan.nextLine().split(" ");
        String remove = code[0];
        String add = code[1];

        if (input.matches("[d-z{}|#]+")) {
            System.out.println(encode(input, 3).replaceAll(remove, add));
        } else {
            System.out.println("This is not the book you are looking for.");
        }
    }

    static String encode(String string, int k) {

        // changed string
        String newS = "";

        // iterate for every characters
        for (int i = 0; i < string.length(); ++i) {
            // ASCII value
            int old = string.charAt(i);
            int newOne = (char) (old - 3);
            newS += (char) newOne;
        }
        return newS;
    }
}
