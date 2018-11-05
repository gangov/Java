package com.company;

import java.util.*;

public class LabWordSynonyms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int limit = Integer.parseInt(scan.nextLine());

        LinkedHashMap<String, ArrayList<String>> words = new LinkedHashMap<>();

        for (int i = 0; i < limit; i++) {
            String word = scan.nextLine();
            String synonym = scan.nextLine();

            words.putIfAbsent(word, new ArrayList<>());
            words.get(word).add(synonym);
        }

        for (var entry : words.entrySet()) {
            System.out.print(entry.getKey() + " - " + entry.getValue().toString().replace("[", "").replace("]", ""));
            System.out.println();
        }
    }
}
