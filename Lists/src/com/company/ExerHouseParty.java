package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExerHouseParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = Integer.parseInt(scan.nextLine());
        List<String> guests = new ArrayList<String>();

        for (int i = 0; i < count; i++) {
            String command = scan.nextLine();
            String[] name = command.split(" ");

            if (command.contains("is going!")) {
                if (!guests.contains(name[0])) {
                    guests.add(name[0]);
                } else {
                    System.out.println(name[0] + " is already in the list!");
                }
            } else {
                if (guests.contains(name[0])) {
                    guests.remove(name[0]);
                } else {
                    System.out.println(name[0] + " is not in the list!");
                }
            }
        }
        for (int i = 0; i <= guests.size() - 1; i++) {
            System.out.println(guests.get(i));
        }
    }
}
