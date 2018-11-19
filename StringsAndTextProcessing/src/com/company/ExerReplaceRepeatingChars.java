//Replace Repeating Chars
//        Write a program that reads a string from the console and replaces any sequence
//        of the same letters with a single corresponding letter.


package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExerReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> input = Arrays.stream(scan.nextLine().split(""))
                .collect(Collectors.toList());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.size() - 1; i++) {
            if (!input.get(i).equals(input.get(i + 1))) {
                result.append(input.get(i));
            }
        }
        result.append(input.get(input.size() - 1));
        System.out.println(result);
    }
}
