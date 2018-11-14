package com.company;

import java.util.Scanner;

public class LabSubstring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String match = scan.nextLine();
        String input = scan.nextLine();

        while (input.contains(match)) {
            input = input.replace(match, "");
        }

        System.out.println(input);
    }
}
