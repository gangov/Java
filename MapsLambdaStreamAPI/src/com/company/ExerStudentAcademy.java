package com.company;

import java.util.*;

import static java.util.Map.Entry.comparingByValue;

public class ExerStudentAcademy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = Integer.parseInt(scan.nextLine());

        Map<String, ArrayList<Double>> studentGrade = new LinkedHashMap<>();

        int i = 0;
        while (true) {
            if (i >= count) {
                break;
            }

            String name = scan.nextLine();
            Double grade = Double.parseDouble(scan.nextLine());

            studentGrade.putIfAbsent(name, new ArrayList<>());
            studentGrade.get(name).add(grade);
            i++;
        }

        Map<String, Double> passedStudents = new LinkedHashMap<>();

        for (String name : studentGrade.keySet()) {
            double sum = 0;
            for (int j = 0; j < studentGrade.get(name).size(); j++) {
                sum += studentGrade.get(name).get(j);
            }
            double avrg = sum / studentGrade.get(name).size();

            if (avrg >= 4.5) {
                passedStudents.put(name, avrg);
            }
        }

        passedStudents.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .forEach(entry -> {
                    System.out.println(String.format("%s -> %.2f", entry.getKey(), entry.getValue()));
                });
    }
}
