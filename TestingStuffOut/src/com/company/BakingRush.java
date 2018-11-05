package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class BakingRush {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] dayRoutine = scan.nextLine().split("\\|");

        int energy = 100;
        int coins = 100;
        int routine = 0;

        for (String i :
                dayRoutine) {
            String[] task = i.split("-");
            if (task[0].equalsIgnoreCase("rest")) {
                if (energy == 100) {
                    System.out.println("You gained 0 energy.");
                    System.out.println("Current energy: " + energy + ".");
                } else if (energy < 100){
                    if (energy + Integer.parseInt(task[1]) > 100) {
                        energy = 100;
                        System.out.printf("You gained %d energy.\n", energy + Integer.parseInt(task[1]) - 100);
                        System.out.println("Current energy: " + energy + ".");
                    } else {
                        energy += Integer.parseInt(task[1]);
                        System.out.printf("You gained %d energy.\n", Integer.parseInt(task[1]));
                        System.out.println("Current energy: " + energy + ".");
                    }
                }
            }
            else if (task[0].equalsIgnoreCase("order")) {
                if (energy - 30 > 0) {
                    energy -= 30;
                    coins += Integer.parseInt(task[1]);
                    System.out.printf("You earned %s coins.\n", task[1]);
                } else if (energy - 30 <= 0) {
                    energy += 50;
                    System.out.println("You had to rest!");
                }
            }
            else {
                if (coins - Integer.parseInt(task[1]) > 0) {
                    System.out.printf("You bought %s.\n", task[0]);
                    coins -= Integer.parseInt(task[1]);
                } else if (coins - Integer.parseInt(task[1]) <= 0) {
                    System.out.printf("Closed! Cannot afford %s.\n", task[0]);
                    break;
                }
            }
            routine++;
        }

        if (routine == dayRoutine.length) {
            System.out.printf("Day completed!\nCoins: %d\nEnergy: %d", coins, energy);
        }
    }
}
