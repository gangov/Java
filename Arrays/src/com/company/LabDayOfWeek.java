package com.company;

import java.util.Scanner;

public class LabDayOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day = Integer.parseInt(scan.nextLine());

        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
                "Saturday", "Sunday"};

        switch (day) {
            case 1:
                System.out.println(weekdays[0]);
                break;
            case 2:
                System.out.println(weekdays[1]);
                break;
            case 3:
                System.out.println(weekdays[2]);
                break;
            case 4:
                System.out.println(weekdays[3]);
                break;
            case 5:
                System.out.println(weekdays[4]);
                break;
            case 6:
                System.out.println(weekdays[5]);
                break;
            case 7:
                System.out.println(weekdays[6]);
                break;

            default:
                System.out.println("Invalid day!");
                break;
        }
    }
}
