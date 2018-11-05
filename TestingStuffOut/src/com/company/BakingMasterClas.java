package com.company;

import java.util.Scanner;

public class BakingMasterClas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int studentsCount = Integer.parseInt(scan.nextLine());
        double flour = Double.parseDouble(scan.nextLine());
        double egg = Double.parseDouble(scan.nextLine());
        double apron = Double.parseDouble(scan.nextLine());
        int discountedFlour = studentsCount / 5;
        double flourPrice = flour * (studentsCount - discountedFlour);
        double eggPrice = egg * 10 * studentsCount;
        double apronPrice = apron * (Math.ceil(studentsCount + (studentsCount * 0.2)));

        double total = flourPrice + eggPrice + apronPrice;


        if (budget >= total) {
            System.out.printf("Items purchased for %.2f$.", total);
        } else {
            System.out.printf("%.2f$ more needed.", total - budget);
        }
    }
}
