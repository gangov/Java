package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ExerEncryptSortPrintArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = Integer.parseInt(scan.nextLine());

        String[] words = new String[size];
        for (int i = 0; i < words.length; i++) {
            words[i] = scan.nextLine();
        }
        int[] coded = new int[size];

        for (int j = 0; j < words.length; j++) {
            String[] temp = new String[words[j].length()];
            int total = 0;

            for (int k = 0; k <= temp.length - 1; k++) {
                if (k == 0) {
                    if (words[j].charAt(k) == 65 || words[j].charAt(k) == 69 ||
                            words[j].charAt(k) == 73 || words[j].charAt(k) == 79 ||
                            words[j].charAt(k) == 85) {
                        total += words[j].charAt(k) * words[j].length();
                    } else {
                        total += words[j].charAt(k) / words[j].length();
                    }
                } else {
                    if (words[j].charAt(k) == 97 || words[j].charAt(k) == 101 ||
                            words[j].charAt(k) == 105 || words[j].charAt(k) == 111 ||
                            words[j].charAt(k) == 117) {
                        total += words[j].charAt(k) * words[j].length();
                    } else {
                        total += words[j].charAt(k) / words[j].length();
                    }
                }
            }

            coded[j] = total;
        }
        Arrays.sort(coded);
        for (int i :
                coded) {
            System.out.println(i);
        }
    }
}
