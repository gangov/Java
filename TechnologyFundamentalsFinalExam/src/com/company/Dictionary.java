package com.company;

import java.util.*;

public class Dictionary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TreeMap<String, ArrayList<String>> dictionary = new TreeMap<String, ArrayList<String>>();


        while (true) {
            String[] rawWords = scan.nextLine().split(" \\| ");
            String[] checker = scan.nextLine().split(" \\| ");
            String finalCommand = scan.nextLine();

            for (String rawWord : rawWords) {
                String[] input = rawWord.split(": ");
                String key = input[0];
                String value = input[1];

                if (!dictionary.containsKey(key)) {
                    dictionary.put(key, new ArrayList<String>());
                    dictionary.get(key).add(value);
                } else {
                    dictionary.get(key).add(value);
                }
            }

            for (Map.Entry<String, ArrayList<String>> keys : dictionary.entrySet()) {
                for (String s : checker) {
                    if (s.equals(keys.getKey())) {
                        System.out.println(s);
                        dictionary.forEach((key, value) -> value.sort((o1, o2) -> Integer.compare(o2.length(), o1.length())));
                        for (String s1 : keys.getValue()) {
                            System.out.println(" -" + s1);
                        }
                    }
                }
            }

            if (finalCommand.equalsIgnoreCase("list")) {
                for (String s : dictionary.keySet()) {
                    System.out.print(s + " ");
                }
                break;
            } else if (finalCommand.equalsIgnoreCase("end")) {
                break;
            }
        }
    }
}
