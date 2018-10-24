package com.company;

import java.util.Scanner;

public class ExerPasswordValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pswd = scan.nextLine();

        result(pswd);
    }

    public static void pswdLength(String pass) {
        if (pass.length() < 6 || pass.length() > 10) {
            System.out.println("Password must be between 6 and 10 characters");
        }
    }

    public static void pswdDigitsLetters(String pass) {
        for (int i = 0; i < pass.length(); i++) {
            if ((pass.charAt(i) < 48 || pass.charAt(i) > 57) &&
                    (pass.charAt(i) < 65 || pass.charAt(i) > 90) &&
                    pass.charAt(i) < 97 || pass.charAt(i) > 122) {
                System.out.println("Password must consist only of letters and digits");
                break;
            }
        }
    }

    public static void digitCount(String pass) {
        int count = 0;
        for (int i = 0; i < pass.length(); i++) {
            if(pass.charAt(i) >= 48 && pass.charAt(i) <= 57) {
                count++;
            }
        }
        if (count < 2) {
            System.out.println("Password must have at least 2 digits");
        }
    }

    public static void correct(String pass) {
        int count = 0;
        int length = 0;
        if (pass.length() >= 6 && pass.length() <= 10) {
            length++;
        }
        for (int i = 0; i < pass.length(); i++) {
            if ((pass.charAt(i) >= 48 && pass.charAt(i) <= 57) ||
                    (pass.charAt(i) >= 65 && pass.charAt(i) <= 90) ||
                    pass.charAt(i) >= 97 && pass.charAt(i) <= 122) {
                length++;
            }

            if(pass.charAt(i) >= 48 && pass.charAt(i) <= 57) {
                count++;
            }
        }
        if (count >= 2) {
            length++;
        }

        if (length >= pass.length() + 2) {
            System.out.println("Password is valid");
        }
    }

    public static void result(String pswd) {
        pswdLength(pswd);
        pswdDigitsLetters(pswd);
        digitCount(pswd);
        correct(pswd);
    }
}
