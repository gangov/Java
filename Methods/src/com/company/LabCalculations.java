package com.company;

import java.util.Scanner;

public class LabCalculations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());

        result(command, first, second);
    }

    public static void result(String command, int firstNum, int secondNum) {
        switch (command) {
            case "add":
                System.out.println(firstNum + secondNum);
                break;
            case "multiply":
                System.out.println(firstNum * secondNum);
                break;
            case "subtract":
                System.out.println(firstNum - secondNum);
                break;
            case "divide":
                System.out.println(firstNum / secondNum);
                break;
             default:
                 break;
        }
    }
}
