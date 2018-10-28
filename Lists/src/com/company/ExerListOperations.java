package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class ExerListOperations {
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

            String[] splitCommand = command.split(" ");

            switch (splitCommand[0]) {
                case "Add":
                    theList.add(Integer.parseInt(splitCommand[1]));
                    break;
                case "Insert":
                    int index = Integer.parseInt(splitCommand[2]);
                    int numToAdd = Integer.parseInt(splitCommand[1]);
                    try {
                        theList.add(index, numToAdd);
                    } catch (Exception e) {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    try {
                        theList.remove(Integer.parseInt(splitCommand[1]));
                    } catch (Exception e) {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    if (splitCommand[1].equalsIgnoreCase("left")) {
                        Collections.rotate(theList, -Integer.parseInt(splitCommand[2]));
                    } else if (splitCommand[1].equalsIgnoreCase("right")) {
                        Collections.rotate(theList, Integer.parseInt(splitCommand[2]));
                    }
                    break;
            }
        }
        System.out.println(theList.toString().replaceAll("[\\[\\],]", ""));
    }
}