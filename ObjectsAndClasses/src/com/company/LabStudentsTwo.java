package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LabStudentsTwo {
    public static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String city;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public Student(String firstName, String lastName, int age, String city) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.city = city;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        String line = scan.nextLine();

        while(!line.equals("end")) {
            String[] data = line.split(" ");

            String firstName = data[0];
            String lastName = data[1];
            int age = Integer.parseInt(data[2]);
            String city = data[3];

            if (IsExistingStudent(students, firstName, lastName)) {
                Student student = getStudent(students, firstName, lastName);

                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setCity(city);
            } else {
                Student student = new Student(firstName, lastName, age, city);
                students.add(student);
            }

            Student student = students
                    .stream()
                    .filter(s -> s.getFirstName().equals(firstName) && s.getLastName().equals(lastName))
                    .findFirst()
                    .orElse(null);

            if (student == null) {
                Student studentToAdd = new Student(firstName, lastName, age, city);
                studentToAdd.setFirstName(firstName);
                studentToAdd.setLastName(lastName);
                studentToAdd.setAge(age);
                studentToAdd.setCity(city);
                students.add(studentToAdd);
            } else {
                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setCity(city);
            }

            line = scan.nextLine();
        }

        String filterCity = scan.nextLine();

        for (Student student : students) {
            if (student.getCity().equals(filterCity)) {
                System.out.printf("%s %s is %d years old\n", student.getFirstName(), student.getLastName(),
                        student.getAge());
            }
        }
    }

    private static Student getStudent(List<Student> students, String firstName, String lastName) {
        Student existingStudent = null;

        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                existingStudent = student;
            }
        }
        return existingStudent;
    }

    private static boolean IsExistingStudent(List<Student> students, String firstName, String lastName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }
}
