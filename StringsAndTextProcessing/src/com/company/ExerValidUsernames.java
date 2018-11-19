//Valid Usernames
//        Write a program that reads user names on a single line (joined by ", ") and prints all valid usernames.
//        A valid username is:
//        Has length between 3 and 16 characters
//        Contains only letters, numbers, hyphens and underscores
//        Has no redundant symbols before, after or in between.



package com.company;

import java.util.Scanner;

public class ExerValidUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] usernames = scan.nextLine().split(", ");

        for (String user :
                usernames) {
            if ((user.length() >= 3 && user.length() <= 16)
            && user.matches("[a-zA-Z\\d-_]+")) {
                System.out.println(user);
            }
        }
    }
}
