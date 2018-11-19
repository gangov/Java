//Extract File
//        Write a program that reads the path to a file and subtracts the file name and its extension.


package com.company;

import java.util.Scanner;

public class ExerExtractFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //C:\Internal\training-internal\Template.pptx
        String input = scan.nextLine();
        int last = input.lastIndexOf("\\");
        input = input.substring(last + 1);
        String[] result = input.split("\\.");
        System.out.println(String.format("File name: %s\n" +
                "File extension: %s", result[0], result[1]));
    }
}
