package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ExerOrders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Double> prices = new LinkedHashMap<>();
        Map<String, Double> count = new LinkedHashMap<>();

        while (true) {
            String[] entries = scan.nextLine().split(" ");

            if (entries[0].equalsIgnoreCase("buy")) {
                break;
            }

            if (!prices.containsKey(entries[0])) {
                prices.put(entries[0], Double.parseDouble(entries[1]));
            } else {
                prices.put(entries[0], Double.parseDouble(entries[1]));
            }

            if (!count.containsKey(entries[0])) {
                count.put(entries[0], Double.parseDouble(entries[2]));
            } else {
                double oldValue = count.get(entries[0]);
                count.put(entries[0], oldValue + Double.parseDouble(entries[2]));
            }

        }

        for (Map.Entry<String, Double> entry : prices.entrySet()) {
            double sum = 0;
            double countValue = count.get(entry.getKey());
            sum += entry.getValue() * countValue;
            System.out.printf("%s -> %.2f\n", entry.getKey(), sum);
        }
    }
}
