package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LabMergingLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> first = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> second = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> summedList = new ArrayList<Integer>();

        int endingAt;
        int remainder;
        if (first.size() > second.size()) {
            endingAt = second.size();
        } else if (first.size() < second.size()) {
            endingAt = first.size();
        } else {
            endingAt = first.size();
        }

        for (int i = 0; i < endingAt * 2; i++) {
            if (i % 2 == 0) {
                summedList.add(i, first.get(i / 2));
            } else {
                summedList.add(i, second.get(i / 2));
            }
        }

        List<Integer> remainderList = new ArrayList<Integer>();


        if (first.size() > second.size()) {
            remainder = first.size() - second.size();
            remainderList = first.subList(first.size() - remainder, first.size());
            for (int i = 0; i <= remainderList.size() - 1; i++) {
                summedList.add(remainderList.get(i));
            }
        } else if (first.size() < second.size()) {
            remainder = second.size() - first.size();
            remainderList = second.subList(second.size() - remainder, second.size());
            for (int i = 0; i <= remainderList.size() - 1; i++) {
                summedList.add(remainderList.get(i));
            }
        }

        System.out.println();

        for (int i = 0; i <= summedList.size() - 1; i++) {
            System.out.print(summedList.get(i) + " ");
        }
    }
}
