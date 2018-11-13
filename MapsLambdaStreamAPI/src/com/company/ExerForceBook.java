package com.company;

import java.util.*;

public class ExerForceBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<String>> usersBySide = new HashMap<>();
        String line = scan.nextLine();

        while (!line.equalsIgnoreCase("Lumpawaroo")) {
            if (line.contains(" | ")) {
                String[] tokens = line.split("\\|");
                String user = tokens[0];
                String side = tokens[1];
                usersBySide.putIfAbsent(side, new ArrayList<>());
                boolean exists = false;
                for (Map.Entry<String, List<String>> entry : usersBySide.entrySet()) {
                    List<String> users = entry.getValue();
                    if (users.contains(user)) {
                        exists = true;
                        break;
                    }
                }

                if (!exists) {
                    usersBySide.get(side).add(user);
                }
            } else if (line.contains(" -> ")) {
                String[] tokens = line.split(" -> ");
                String user = tokens[1];
                String side = tokens[0];
                usersBySide.putIfAbsent(side, new ArrayList<>());
            }

            line = scan.nextLine();
        }
    }
}
