package com.company;

import java.util.Scanner;

public class LabOrders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine().toLowerCase();
        double quantity = Integer.parseInt(scan.nextLine());

        orderTotal(product, quantity);
    }

    public static void orderTotal(String product, double quantity) {
        switch (product) {
            case "coffee":
                System.out.printf("%.2f", 1.5 * quantity);
                break;
            case "water":
                System.out.printf("%.2f", 1.0 * quantity);
                break;
            case "coke":
                System.out.printf("%.2f", 1.40 * quantity);
                break;
            case "snacks":
                System.out.printf("%.2f", 2.0 * quantity);
                break;
            default:
                break;
        }
    }
}
