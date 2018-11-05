package com.company;

import java.util.*;

import static java.util.Comparator.comparingInt;
import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class ExerCourses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, ArrayList<String>> cirriculum = new LinkedHashMap<>();

        while (true) {
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }

            String[] coursName = input.split(" : ");

            cirriculum.putIfAbsent(coursName[0], new ArrayList<>());
            cirriculum.get(coursName[0]).add(coursName[1]);
        }


        cirriculum.entrySet().stream().sorted((e1, e2) ->{
            int compare = Integer.compare(e2.getValue().size(), e1.getValue().size());
            return compare;
        }).forEach((e1) -> {
            System.out.printf("%s: %d%n", e1.getKey(), e1.getValue().size());
            e1.getValue().stream().sorted((x1, x2) -> {
                int first = x1.length();
                int second = x2.length();
                int compare = x1.compareTo(x2);
                return compare;
            }).forEach(x -> System.out.println("-- " + x));
        });
    }
}
