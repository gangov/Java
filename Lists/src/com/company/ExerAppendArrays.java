package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ExerAppendArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().replace("", " ").trim().split("[ ]+");
        List<String> result = new ArrayList<>();

        for (int i = input.length - 1; i >= 0; i--) {

            if (!input[i].equals("|")) {
                result.add(input[i]);
            }
            if (input[i].equals("|")) {
                Collections.reverse(result);
                for (String ji :
                        result) {
                    System.out.print(ji + " ");
                }
                result = new ArrayList<>();
            }
        }

        for (int j = 0; j < input.length - 1; j++) {
            if (!input[j].equals("|")) {
                System.out.print(input[j] + " ");
            } else if (input[j].equals("|")) {
                break;
            }
        }
    }
}
