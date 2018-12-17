package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Concert {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, ArrayList> bandsNames = new LinkedHashMap<>();
        HashMap<String, Integer> bandsPlayTime = new HashMap<>();


        while (true) {

            String input = scan.nextLine();

            if (input.equalsIgnoreCase("start of concert")) {
                break;
            }

            String[] tokens = input.split("; ");
            String command = tokens[0];
            String bandName = tokens[1];

            if (command.equalsIgnoreCase("add")) {
                String[] membersToAdd = tokens[2].split(", ");
                if (!bandsNames.containsKey(bandName)) {
                    bandsNames.put(bandName, new ArrayList<>());
                    for (int i = 0; i < membersToAdd.length; i++) {
                        bandsNames.get(bandName).add(membersToAdd[i]);
                    }
                } else {
                    for (int i = 0; i < membersToAdd.length; i++) {
                        for (Map.Entry<String, ArrayList> entry : bandsNames.entrySet()) {
                            if (!bandsNames.get(bandName).contains(membersToAdd[i])) {
                                bandsNames.get(bandName).add(membersToAdd[i]);
                                break;
                            }
                        }
                    }
                }
            } else if (command.equalsIgnoreCase("play")) {
                int time = Integer.parseInt(tokens[2]);

                if (!bandsPlayTime.containsKey(bandName)) {
                    bandsPlayTime.put(bandName, time);
                } else {
                    int old = bandsPlayTime.get(bandName);
                    bandsPlayTime.remove(bandName);
                    bandsPlayTime.put(bandName, old + time);
                }
            }
        }

        String lastBand = scan.nextLine();
        int total = 0;
        for (Integer value : bandsPlayTime.values()) {
            total += value;
        }

        System.out.println("Total time: " + total);

        bandsPlayTime.entrySet().stream().sorted((e1, e2) -> {
            if (e2.getValue().compareTo(e1.getValue()) == 0) {
                e1.getKey().compareTo(e2.getKey());
            }
            return e2.getValue().compareTo(e1.getValue());
        }).forEach(x -> System.out.println(x.getKey() + " -> " + x.getValue()));

        System.out.println(lastBand);

        bandsNames.get(lastBand).forEach(x -> System.out.println("=> " + x));
    }
}
