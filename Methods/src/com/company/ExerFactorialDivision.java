package com.company;

import java.util.Scanner;

public class ExerFactorialDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double first = Double.parseDouble(scan.nextLine());
        double second = Double.parseDouble(scan.nextLine());

        returnSum(firstFactorial(first), secondFactorial(second));
    }

    public static double firstFactorial(double number) {
        double total = 1;
        for (int i = 1; i <= number; i++) {
            total *= i;
        }
        return total;
    }

    public static double secondFactorial(double number) {
        double total = 1;
        for (int i = 1; i <= number; i++) {
            total *= i;
        }
        return total;
    }

    public static void returnSum(double first, double second) {
        System.out.printf("%.2f", first / second);
    }
}
