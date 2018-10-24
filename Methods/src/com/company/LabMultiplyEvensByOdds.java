package com.company;

import java.util.Scanner;

public class LabMultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int num = Integer.parseInt(input);
        num = Math.abs(num);

        System.out.println(sumAllNumbers(num));
    }

    public static int sumAllNumbers(int num) {
        int evens = 0;
        int odds = 0;

        while (num > 0) {
            if ((num % 10) % 2 == 0) {
                evens += (num % 10);
            } else if ((num % 10) % 2 != 0) {
                odds += (num % 10);
            }
            num /= 10;
        }

        return evens * odds;
    }
}
