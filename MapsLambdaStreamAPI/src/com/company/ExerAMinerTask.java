package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ExerAMinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> resources = new LinkedHashMap<>();

        while (true) {

            String type = scan.nextLine();

            if (type.equalsIgnoreCase("stop")) {
                break;
            }

            int amount = Integer.parseInt(scan.nextLine());

            if(!resources.containsKey(type)) {
                resources.put(type, amount);
            } else {
                resources.put(type, resources.get(type) + amount);
            }
        }

        for (Map.Entry<String, Integer> entry: resources.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
