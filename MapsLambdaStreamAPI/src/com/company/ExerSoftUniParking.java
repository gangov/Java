package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ExerSoftUniParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine());

        Map<String, String> parkingLot = new LinkedHashMap<>();

        for (int i = 0; i < count; i++) {
            String[] entry = scan.nextLine().split(" ");
            String command = entry[0];

            if (command.equalsIgnoreCase("register")) {
                if (!parkingLot.containsKey(entry[1])) {
                    parkingLot.put(entry[1], entry[2]);
                    System.out.printf("%s registered %s successfully\n", entry[1], entry[2]);
                } else {
                    System.out.println("ERROR: already registered with plate number " + parkingLot.get(entry[1]));
                }
            } else if (command.equalsIgnoreCase("unregister")) {
                if (!parkingLot.containsKey(entry[1])) {
                    System.out.printf("ERROR: user %s not found\n", entry[1]);
                } else {
                    parkingLot.remove(entry[1]);
                    System.out.println(entry[1] + " unregistered successfully");
                }
            }
        }

        for (Map.Entry<String, String> entry: parkingLot.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
