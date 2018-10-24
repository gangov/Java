package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long nCount = Integer.parseInt(in.nextLine());
        long kSum = Integer.parseInt(in.nextLine());

        long[] numArr = new long[Math.toIntExact(nCount)];
        numArr[0] = 1;
        if (kSum == 0) {
            System.out.println(0);
            return;
        }
        if (nCount > kSum) {
            for (int i = 1; i < numArr.length; i++) {
                long temp = 0;
                if (i <= kSum) {
                    for (long j = kSum; j >= 0; j--) {
                        temp += numArr[Math.toIntExact(j)];
                    }
                } else {
                    for (long k = i - kSum; k <= i; k++) {
                        temp += numArr[Math.toIntExact(k)];
                    }
                }
                numArr[i] = temp;
            }
        }

        for (long num :
                numArr) {
            System.out.print(num + " ");
        }
    }
}
