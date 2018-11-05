package com.company;

import java.util.Scanner;

public class PartyProfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int partySize = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());
        int coins = 0;

        for (int i = 1; i <= days ; i++) {
            if (i % 10 == 0) {
                partySize -= 2;
            }
            if (i % 15 == 0) {
                partySize += 5;
            }
            coins += 50 - (partySize * 2);
            if (i % 3 == 0) {
                coins -= partySize * 3;
            }
            if (i % 5 == 0) {
                coins += partySize * 20;
                if (i % 3 == 0) {
                    coins -= 2 * partySize;
                }
            }
        }

        System.out.printf("%d companions received %d coins each.", partySize, (int) Math.floor(coins / partySize));
    }
}
