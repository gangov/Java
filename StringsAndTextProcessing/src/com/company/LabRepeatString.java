package com.company;

import java.util.Scanner;

public class LabRepeatString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] entry = scan.nextLine().split(" ");
        StringBuilder result = new StringBuilder();

        for (String i :
                entry) {
            for (int j = 0; j < i.length(); j++) {
                result.append(i);
            }
        }

        System.out.println(result);
    }
}
