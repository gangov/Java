package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExerCardsGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> firstHand = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondHand = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        while (firstHand.size() > 0 && secondHand.size() > 0) {
            int larger = 0;
            int smaller = 0;
            if (firstHand.get(0).equals(secondHand.get(0))) {
                firstHand.remove(0);
                secondHand.remove(0);
            } else if (firstHand.get(0) > secondHand.get(0)) {
                larger = firstHand.get(0);
                smaller = secondHand.get(0);
                firstHand.remove(0);
                secondHand.remove(0);
                firstHand.add(larger);
                firstHand.add(smaller);
            } else if (firstHand.get(0) < secondHand.get(0)) {
                larger = secondHand.get(0);
                smaller = firstHand.get(0);
                firstHand.remove(0);
                secondHand.remove(0);
                secondHand.add(larger);
                secondHand.add(smaller);
            }
        }


//        System.out.println();
//        System.out.println("First hand ");
//        for (int i :
//                firstHand) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        System.out.println("Second hand ");
//        for (int i :
//                secondHand) {
//            System.out.print(i + " ");
//        }

        int total = 0;
        if (firstHand.size() > 0) {
            for (int i = 0; i < firstHand.size(); i++) {
                total += firstHand.get(i);
            }
            System.out.println("First player wins! Sum: " + total);
        } else if (secondHand.size() > 0) {
            for (int i = 0; i < secondHand.size(); i++) {
                total += secondHand.get(i);
            }
            System.out.println("Second player wins! Sum: " + total);
        }
    }
}
