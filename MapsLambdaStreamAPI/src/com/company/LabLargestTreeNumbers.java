package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LabLargestTreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> sorted = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).sorted((n1, n2) -> n2.compareTo(n1))
                .collect(Collectors.toList());
        for (int i = 0; i < sorted.size(); i++) {
            System.out.print(sorted.get(i) + " ");
            if (i == 2) {
                break;
            }
        }
    }
}
