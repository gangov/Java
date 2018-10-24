package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LabListManipulationBasics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (true) {
            String input = scan.nextLine();

            if (input.equals("end")) {
                break;
            }

            String[] inputData = input.split(" ");

            switch (inputData[0]) {
                case "Add":
                    int numberToAdd = Integer.parseInt(inputData[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(inputData[1]);
                    numbers.remove(numberToRemove);
                    break;
                case "RemoveAt":
                    int numberToRemoveAt = Integer.parseInt(inputData[1]);
                    numbers.remove(numberToRemoveAt);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(inputData[1]);
                    int indexToInsert = Integer.parseInt(inputData[2]);
                    numbers.add(indexToInsert, numberToInsert);
                    break;
            }
        }
        System.out.println(numbers.toString()
                .replaceAll("[\\[\\],]", ""));
    }
}
