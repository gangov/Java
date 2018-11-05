package com.company;

import java.util.*;
import static java.util.stream.Collectors.toMap;

public class ExerLegendaryFarming {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> resources = new TreeMap<>();
        Map<String, Integer> uniqueResources = new HashMap<>();

        uniqueResources.put("shards", 0);
        uniqueResources.put("fragments", 0);
        uniqueResources.put("motes", 0);

        outer:
        while (uniqueResources.get("shards") <= 250 && uniqueResources.get("fragments") <=250 && uniqueResources.get("motes") <= 250) {
            String[] entries = scan.nextLine().toLowerCase().split(" ");
            for (int i = 0; i < entries.length - 1; i += 2) {
                if (entries[i + 1].equalsIgnoreCase("shards")
                || entries[i +  1].equalsIgnoreCase("fragments")
                    || entries[i + 1].equalsIgnoreCase("motes")) {

                    if(!uniqueResources.containsKey(entries[i + 1])) {
                        uniqueResources.put(entries[i + 1], Integer.parseInt(entries[i]));
                    } else {
                        uniqueResources.put(entries[i + 1], uniqueResources.get(entries[i + 1]) + Integer.parseInt(entries[i]));
                    }

                    //check for unique
                    if (uniqueResources.get("shards") >= 250) {
                        System.out.println("Shadowmourne obtained!");
                        uniqueResources.put("shards", uniqueResources.get("shards") - 250);
                        break outer;
                    } else if(uniqueResources.get("fragments") >= 250) {
                        System.out.println("Valanyr obtained!");
                        uniqueResources.put("fragments", uniqueResources.get("fragments") - 250);
                        break outer;
                    } else if (uniqueResources.get("motes") >= 250) {
                        System.out.println("Dragonwrath obtained!");
                        uniqueResources.put("motes", uniqueResources.get("motes") - 250);
                        break outer;
                    }

                } else {
                    if(!resources.containsKey(entries[i + 1])) {
                        resources.put(entries[i + 1], Integer.parseInt(entries[i]));
                    } else {
                        resources.put(entries[i + 1], resources.get(entries[i + 1]) + Integer.parseInt(entries[i]));
                    }
                }
            }
        }

        uniqueResources.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue()
                        .reversed().thenComparing(Map.Entry.comparingByKey()))
                .forEach(entry -> {
                    System.out.println(String.format("%s: %d", entry.getKey(), entry.getValue()));
                });

        for (Map.Entry<String, Integer> entry: resources.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
