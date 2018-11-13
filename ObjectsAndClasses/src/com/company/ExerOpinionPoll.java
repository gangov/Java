package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return String.format("%s - %d", this.getName(), this.getAge());
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scan.nextLine());

        ArrayList<Person> people = new ArrayList<>();

        for (int i = 0; i < peopleCount; i++) {
            String[] inputData = scan.nextLine().split("\\s+");
            String name = inputData[0];
            int age = Integer.parseInt(inputData[1]);

            Person person = new Person(name, age);

            people.add(person);
        }

        people = people.stream().filter(p -> p.getAge() > 30)
                .collect(Collectors.toCollection(ArrayList::new));

        people.stream().sorted(Comparator.comparing(Person::getName))
                .forEach(p -> System.out.println(p.toString()));
    }
}
