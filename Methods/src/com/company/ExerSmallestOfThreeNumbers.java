package com.company;

import java.util.Scanner;

public class ExerSmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());
        int third = Integer.parseInt(scan.nextLine());

        System.out.println(returnMin(first, second, third));
    }

    public static int returnMin(int one, int two, int three) {
        return Math.min(Math.min(one, two), three);
    }
}
