package com.company;

import java.util.Scanner;

public class DungeonestDark {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int health = 100;
        int coins = 0;
        int roomsCount = 1;

        String[] rooms = scan.nextLine().replace("|", " ").split(" ");

        for (int i = 0; i < rooms.length; i += 2) {
            String action = rooms[i];
            int value = Integer.parseInt(rooms[i + 1]);

            if (action.equalsIgnoreCase("potion")) {
                if (health + value >= 100) {
                    System.out.printf("You healed for %d hp.\n", 100 - health);
                    health = 100;
                    System.out.printf("Current health: %d hp.\n", health);
                    roomsCount++;
                } else {
                    health += value;
                    System.out.printf("You healed for %d hp.\n", value);
                    System.out.printf("Current health: %d hp.\n", health);
                    roomsCount++;
                }
            }
            else if (action.equalsIgnoreCase("chest")) {
                System.out.printf("You found %d coins.\n", value);
                coins += value;
                roomsCount++;
            }
            else {
                health -= value;
                if (health > 0) {
                    System.out.printf("You slayed %s.\n", action);
                    roomsCount++;
                }
                else {
                    System.out.printf("You died! Killed by %s.\n", action);
                    System.out.printf("Best room: %d\n", roomsCount);
                    break;
                }
            }
        }

        if (roomsCount > rooms.length / 2) {
            System.out.printf("You've made it!\nCoins: %d\nHealth: %d\n", coins, health);
        }
    }
}
