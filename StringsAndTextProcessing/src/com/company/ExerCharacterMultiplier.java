//Character Multiplier
//        Create a method that takes two strings as arguments and returns the sum of their character
//        codes multiplied (multiply str1[0] with str2[0] and add to the total sum).
//        Then continue with the next two characters. If one of the strings is longer
//        than the other, add the remaining character codes to the total sum without multiplication.


package com.company;

import java.util.Scanner;

public class ExerCharacterMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");

        System.out.println(sumIs(input[0], input[1]));
    }

    private static int sumIs(String s1, String s2) {
        int sum = 0;
        int limit = Math.min(s1.length(), s2.length());

        for (int i = 0; i < limit; i++) {
            sum += (s1.charAt(i) * s2.charAt(i));
        }
        sum += remainderSum(s1, s2);

        return sum;
    }

    private static int remainderSum(String s1, String s2) {
        int min = Math.min(s1.length(), s2.length());
        int max = Math.max(s1.length(), s2.length());
        int sum = 0;

        String remainder = "";
        if (s2.length() > s1.length()) {
            remainder = s2.substring(min, max);
            for (int i = 0; i < remainder.length(); i++) {
                sum += remainder.charAt(i);
            }
            return sum;
        } else {
            remainder = s1.substring(min, max);
            for (int i = 0; i < remainder.length(); i++) {
                sum += remainder.charAt(i);
            }
            return sum;
        }
    }
}
