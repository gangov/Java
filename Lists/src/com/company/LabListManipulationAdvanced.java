package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LabListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers =
                Arrays.stream(scan.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (true) {
            String input = scan.nextLine();

            if (input.equals("end")) {
                break;
            }

            String[] inputData = input.split(" ");

            switch (inputData[0]) {
                case "Contains":
                    int numberToContain = Integer.parseInt(inputData[1]);
                    if (numbers.contains(numberToContain)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (inputData[1].equals("even")) {
                        for (int i = 0; i <= numbers.size() - 1; i++) {
                            if (numbers.get(i) % 2 == 0) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    else if (inputData[1].equals("odd")) {
                        for (int i = 0; i <= numbers.size() - 1; i++) {
                            if (numbers.get(i) % 2 != 0) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    int total = 0;
                    for (int i = 0; i <= numbers.size() - 1; i++) {
                        total += numbers.get(i);
                    }
                    System.out.println(total);
                    break;
                case "Filter":
                    int filtered = Integer.parseInt(inputData[2]);
                    if (inputData[1].equals("<")) {
                        for (int i = 0; i <= numbers.size() - 1; i++) {
                            if (numbers.get(i) < filtered) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    else if (inputData[1].equals(">")) {
                        for (int i = 0; i <= numbers.size() - 1; i++) {
                            if (numbers.get(i) > filtered) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    else if (inputData[1].equals("<=")) {
                        for (int i = 0; i <= numbers.size() - 1; i++) {
                            if (numbers.get(i) <= filtered) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    else if (inputData[1].equals(">=")) {
                        for (int i = 0; i <= numbers.size() - 1; i++) {
                            if (numbers.get(i) >= filtered) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
            }
        }
    }
}
