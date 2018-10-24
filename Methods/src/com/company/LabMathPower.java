package com.company;

import java.util.Scanner;

public class LabMathPower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double number = Double.parseDouble(scan.nextLine());
        int power = Integer.parseInt(scan.nextLine());

        System.out.println(mathPowerTotal(number, power));
    }

    public static int mathPowerTotal(double num, int power) {
        double result = 1;
        if (power ==0) {
           result = 0;
        } else {
            for (int i = 0; i < power; i++) {
                result *= num;
            }
        }
        return (int) result;
    }
}
