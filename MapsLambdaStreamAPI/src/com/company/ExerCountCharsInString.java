package com.company;

import java.util.*;

public class ExerCountCharsInString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] letters = scan.nextLine().replace(" ", "").split("");

        Map<String, Integer> chars = new LinkedHashMap<>();

        for (String c :
                letters) {
            if (!chars.containsKey(c)) {
                chars.put(c, 0);
            }
            chars.put(c, chars.get(c) + 1);
        }


        for (Map.Entry<String, Integer> entry: chars.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
