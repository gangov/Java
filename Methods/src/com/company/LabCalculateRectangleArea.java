package com.company;

import java.util.Scanner;

public class LabCalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());

        getArea(width, height);
    }

    public static void getArea(int width, int height) {
        System.out.println(width * height);
    }
}
