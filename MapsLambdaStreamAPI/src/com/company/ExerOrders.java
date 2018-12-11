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

// second option - one map, with list
package com.company;

import java.util.*;

public class TestingMaps {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, List<Double>> items = new LinkedHashMap<String, List<Double>>();

        double latestCount = 0;

        while (true) {
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("buy")) {
                break;
            }

            String[] tokens = input.split(" ");
            String name = tokens[0];
            double price = Double.parseDouble(tokens[1]);
            double quantity = Integer.parseInt(tokens[2]);

            if (!items.containsKey(name)) {
                items.put(name, new ArrayList<>());
                items.get(name).add(price);
                items.get(name).add(quantity);
            } else {
                double oldQuan = items.get(name).get(1);
                items.get(name).remove(0);
                items.get(name).add(0, price);
                items.get(name).remove(1);
                items.get(name).add(1, oldQuan + quantity);
            }
        }
        
        items.entrySet().stream()
                .forEach(entry -> {
                    System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue().get(0) * entry.getValue().get(1));
                });
    }
}
