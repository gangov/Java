package com.company;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int limit = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=limit ;i++) {

            int total = 0;
            int temporary = i;

            while (temporary != 0) {
                total += temporary % 10;
                temporary /= 10;
            }
            if ((total == 5) || (total == 7) || (total == 11)) {
                System.out.printf("%d -> ", i);
                System.out.println("True");
            } else {
                System.out.printf("%d -> ", i);
                System.out.println("False");
            }
        }
    }
}