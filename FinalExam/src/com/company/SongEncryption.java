package com.company;

import java.util.Scanner;

public class SongEncryption {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("end")) {
                break;
            }

            String[] tokens = input.split(":");
            String name = tokens[0];
            String song = tokens[1];

            int firstLetter = name.charAt(0);
            boolean restSmall = false;
            for (int i = 1; i < name.length(); i++) {
                if ((name.charAt(i) >= 97 && name.charAt(i) <= 122) || name.charAt(i) == 39 || name.charAt(i) == 32) {
                    restSmall = true;
                } else {
                    restSmall = false;
                    break;
                }
            }

            boolean validName = restSmall && firstLetter >= 65 && firstLetter <= 90;

            boolean validSong = false;
            for (int j = 0; j < song.length(); j++) {
                if ((song.charAt(j) >= 65 && song.charAt(j) <= 90) || song.charAt(j) == 32) {
                    validSong = true;
                } else {
                    validSong = false;
                    break;
                }
            }

            if (validName && validSong) {
                String nameOutput = "";
                String songOutput = "";
                int key = name.length();

                System.out.println("Successful encryption: " + encryptName(name, key) + "@" + encryptSong(song, key));
            } else {
                System.out.println("Invalid input!");
            }
        }
    }

    private static String encryptName(String input, int k) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            int current = input.charAt(i);
            if (!(current == 32 || current == 39)) {
                if (current + k > 122 ) {
                    current = current - 26 + k;
                } else {
                    current += k;
                }
            }
            output += (char) current;
        }
        return output;
    }

    private static String encryptSong(String input, int k) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            int current = input.charAt(i);
            if (!(current == 32 || current == 39)) {
                if (current + k > 90 ) {
                    current = current - 26 + k;
                } else {
                    current += k;
                }
            }
            output += (char) current;
        }
        return output;
    }

}
