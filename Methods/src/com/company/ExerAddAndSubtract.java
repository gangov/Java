package com.company;

import java.util.Scanner;

public class ExerAddAndSubtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());
        int third = Integer.parseInt(scan.nextLine());

        System.out.println(differenceOfTwo(sumOfTwo(first, second), third));
    }

    public static int sumOfTwo(int first, int second) {
        return first + second;
    }

    public static int differenceOfTwo(int method, int third) {
        return method - third;
    }
}
