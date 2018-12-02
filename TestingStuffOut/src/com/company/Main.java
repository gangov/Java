package com.company;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

            Stream.of("d2", "a2", "b1", "b3", "c")
                    .map(s -> {
                        System.out.println("map: " + s);
                        return s.toUpperCase();
                    })
                    .anyMatch(s -> {
                        System.out.println("any match: " + s);
                        return s.startsWith("A");
                    })
                    .forEach(s -> System.out.println("forEach: " + s));

        }
}
