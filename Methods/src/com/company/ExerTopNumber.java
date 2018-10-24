package com.company;

import java.util.Scanner;

public class ExerTopNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= input; i++) {
            if (printNumbers(divisible(i), hasOdd(i))) {
                System.out.println(i);
            }
        }
    }

    public static boolean divisible(int num) {
        boolean result = false;
        int total = 0;
        while (num > 0) {
            total += num % 10;
            num /= 10;
        }
        if (total % 8 == 0) {
            result = true;
        }

        return result;
    }

    public static boolean hasOdd(int num) {
        boolean result = false;
        while (num > 0) {
            if ((num % 10) % 2 != 0) {
                result = true;
                break;
            }
            num /= 10;
        }
        return  result;
    }

    public static boolean printNumbers(boolean one, boolean two) {
        return one && two;
    }
}
