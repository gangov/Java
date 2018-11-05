package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuestJournal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> beginningQuest = Arrays.stream(scan.nextLine().split(", "))
                .collect(Collectors.toList());

        while (true) {
            String command = scan.nextLine();

            if (command.equalsIgnoreCase("retire!")) {
                break;
            }

            String[] operate = command.split(" - ");

            for (int i = 0; i < beginningQuest.size(); i++) {
                if (operate[0].equalsIgnoreCase("start")) {
                    if (!beginningQuest.contains(operate[1])) {
                        beginningQuest.add(operate[1]);
                    }
                }
                else if (operate[0].equalsIgnoreCase("complete")) {
                    if (beginningQuest.contains(operate[1])) {
                        beginningQuest.remove(operate[1]);
                    }
                }
                else if (operate[0].equalsIgnoreCase("side quest")) {
                    String[] sidequests = operate[1].split(":");
                    if (beginningQuest.contains(sidequests[0])) {
                        if (!beginningQuest.contains(sidequests[1])) {
                            beginningQuest.add(returnIndex(beginningQuest, sidequests[0]), sidequests[1]);
                        }
                    }
                }
                else if (operate[0].equalsIgnoreCase("renew")) {
                    if (beginningQuest.contains(operate[1])) {
                        beginningQuest.remove(operate[1]);
                        beginningQuest.add(operate[1]);
                    }
                }
            }
        }

        for (int i = 0; i < beginningQuest.size(); i++) {
            if (i == beginningQuest.size() - 1) {
                System.out.print(beginningQuest.get(i));
            } else {
                System.out.print(beginningQuest.get(i) + ", ");
            }
        }
    }

    public static int returnIndex(List<String> toCheck, String match) {
        for (int i = 0; i < toCheck.size(); i++) {
            if (toCheck.get(i).equalsIgnoreCase(match)) {
                return i + 1;
            }
        }
        return -1;
    }
}
