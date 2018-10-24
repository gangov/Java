package com.company;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExerMaxSequenceEqualElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        ArrayList<Integer> inputList = new ArrayList<>();

        for ( String s : input )
            inputList.add(Integer.parseInt(s));

        int maxSequenceLength = 0;
        int maxSequenceStartIndex = 0;
        int maxSequenceEndIndex = -1;
        for (int i = 0; i < inputList.size() - 1; i++)
        {
            int startIndex = i;
            int length = 1;
            while (i < inputList.size() - 1 && inputList.get(i) == inputList.get(i + 1))
            {
                length++;
                i++;
            }
            if (length > maxSequenceLength)
            {
                maxSequenceLength = length;
                maxSequenceStartIndex = startIndex;
                maxSequenceEndIndex = i;
            }
        }
        for (int i = maxSequenceStartIndex; i <= maxSequenceEndIndex; i++)
        {
            System.out.print(inputList.get(i) + " ");
        }

    }

}
