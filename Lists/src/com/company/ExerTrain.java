package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExerTrain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> train = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scan.nextLine());

        while (true) {
            String command = scan.nextLine();

            if (command.equals("end")) {
                break;
            }

            String[] input = command.split(" ");

            if (input[0].equals("Add")) {
                train.add(Integer.parseInt(input[1]));
            } else {
                for (int i = 0; i <= train.size() - 1; i++) {
                    if (Integer.parseInt(input[0]) + train.get(i) <= maxCapacity) {
                        train.set(i, Integer.parseInt(input[0]) + train.get(i));
                        break;
                    }
                }
            }
        }

        System.out.println(train.toString()
                .replaceAll("[\\[\\],]", ""));
    }
}
