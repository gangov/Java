package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExerChangeList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> theList = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (true) {
            String command = scan.nextLine();

            if (command.equalsIgnoreCase("end")) {
                break;
            }

            String[] input = command.split(" ");

            switch (input[0]) {
                case "Delete":
                    int element = Integer.parseInt(input[1]);
                    for (int i = 0; i <= theList.size() - 1; i++) {
                        if (theList.get(i) == element) {
                            theList.remove(i);
                        }
                    }
                    break;
                case "Insert":
                    int elementToAdd = Integer.parseInt(input[1]);
                    int positionToPut = Integer.parseInt(input[2]);
                    theList.add(positionToPut, elementToAdd);
                    break;
            }
        }

        System.out.println(theList.toString()
                .replaceAll("[\\[\\],]", ""));

    }
}
