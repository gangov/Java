package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Uchenici {
    String firstName;
    String lastName;
    double grade;

    public double getGrade() {
        return grade;
    }

    public Uchenici(String firstName, String lastName, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return String.format("%s %s: %.2f", this.firstName, this.lastName, this.grade);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = Integer.parseInt(scan.nextLine());

        ArrayList<Uchenici> allStudents = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            String[] inputData = scan.nextLine().split("\\s+");
            Uchenici student = new Uchenici(inputData[0], inputData[1], Double.parseDouble(inputData[2]));

            allStudents.add(student);
        }

        allStudents.stream().sorted(Comparator.comparingDouble(Uchenici::getGrade).reversed())
                .forEach(u -> System.out.println(u.toString()));
    }
}
