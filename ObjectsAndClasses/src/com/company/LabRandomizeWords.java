package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class LabRandomizeWords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] words = scan.nextLine().split(" ");
        Random rnd = new Random();

        for (int i = 0; i < words.length; i++) {
            int randPos = rnd.nextInt(words.length);
            String tmp = words[i];
            words[i] = words[randPos];
            words[randPos] = tmp;
        }

        for (String j :
                words) {
            System.out.println(j);
        }
    }
}
