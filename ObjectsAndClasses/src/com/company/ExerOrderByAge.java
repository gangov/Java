package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Chovek {
    String name;
    String ID;

    public int getAge() {
        return age;
    }

    int age;

    public Chovek(String name, String ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s with ID: %s is %d years old.", this.name, this.ID, this.age);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputData = scan.nextLine();

        ArrayList<Chovek> allPeople = new ArrayList<>();

        while (!inputData.equals("End")) {
            String[] tokens = inputData.split("\\s+");

            Chovek newPerson = new Chovek(tokens[0],tokens[1], Integer.parseInt(tokens[2]));
            allPeople.add(newPerson);

            inputData = scan.nextLine();
        }

        allPeople.stream().sorted(Comparator.comparingInt(Chovek::getAge))
                .forEach(chovek -> System.out.println(chovek.toString()));
    }
}
