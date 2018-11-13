package com.company;

import java.util.Scanner;
import java.math.BigInteger;

public class LabSumBigNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigInteger first = new BigInteger(scan.nextLine());
        BigInteger second = new BigInteger(scan.nextLine());
        System.out.println(first.add(second));
    }
}
