package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LabRemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) > 0) {
                System.out.print(numbers.get(i) + " ");
            } else {
                numbers.remove(numbers.get(i));
            }
        }

        if (numbers.size() == 0) {
            System.out.println("empty");
        }
    }
}
