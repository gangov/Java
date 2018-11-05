package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class LabWordFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words = Arrays.stream(scan.nextLine().split(" "))
                .filter(test4e -> test4e.length() % 2 == 0)
                .toArray(String[]::new);

        for (String i :
                words) {
            System.out.println(i);
        }
    }
}
