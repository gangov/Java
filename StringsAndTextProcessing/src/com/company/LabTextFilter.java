package com.company;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LabTextFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] banned = scan.nextLine().split(", ");
        String text = scan.nextLine();

        for (String i :
                banned) {
            if (text.contains(i)) {
                String charCensor = "*";
                int count = i.length();
                String censor = IntStream.range(0, count)
                        .mapToObj(k -> charCensor).collect(Collectors.joining(""));

                text = text.replace(i, censor);
            }
        }

        System.out.println(text);
    }
}
