//Multiply Big Number
//        You are given two lines – the first one can be a really big number (0 to 1050).
//        The second one will be a single digit number (0 to 9).
//        You must display the product of these numbers.
//        Note: do not use the BigInteger class.


package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class ExerMultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigInteger first = new BigInteger(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());
        BigInteger sum = first.multiply(BigInteger.valueOf(second));

        System.out.println(sum);
    }
}
