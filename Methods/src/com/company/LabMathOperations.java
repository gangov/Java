package com.company;

import java.util.Scanner;

public class LabMathOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = Integer.parseInt(scan.nextLine());
        String command = scan.nextLine();
        int second = Integer.parseInt(scan.nextLine());

        System.out.println(formulas(first, command, second));
    }

    public static int formulas(int first, String command, int second) {
        int result = 0;
        switch (command) {
            case "+" :
                result = first + second;
                break;
            case "-" :
                result = first - second;
                break;
            case "*" :
                result = first * second;
                break;
            case "/" :
                result = first / second;
                break;
        }
        return result;
    }
}
