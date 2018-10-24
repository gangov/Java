package com.company;

import java.util.Scanner;

public class ExerVolewsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();

        System.out.println(countVolews(word));
    }
    
    public static int countVolews(String useme) {
        int total = 0;
        for (int i = 0; i < useme.length(); i++) {
            char letter = useme.charAt(i);
            if (letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E'
            || letter == 'i' || letter == 'I' || letter == 'o' || letter == 'O'
            || letter == 'u' || letter == 'U') {
                total += 1;
            }
        }
        return total;
    }
}
