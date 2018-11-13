package com.company;

import java.util.*;

public class Main {

    static class Dice {
        private  int sides;

        public Dice (int sides) throws IllegalArgumentException {
            if (sides %2 == 1 || sides <= 0) {
                throw new IllegalArgumentException("Dai mi pone poveche ot dve strani i da si chetni");
            }
            this.sides = sides;
        }

        int roll() {
            Random rnd = new Random();
            int randomNumber = rnd.nextInt(this.sides);
            int result = randomNumber + 1;
            return  result;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int diceCount = Integer.parseInt(scan.nextLine());
        int sidesPerDice = Integer.parseInt(scan.nextLine());
        int winningSum = Integer.parseInt(scan.nextLine());

        List<Dice> dices = new ArrayList<>();
        for (int i = 0; i < diceCount; i++) {
            Dice dice = new Dice(sidesPerDice);
            dices.add(dice);
        }

        int sum = 0;
        for (Dice dice: dices) {
            sum += dice.roll();
        }

        System.out.println("Your sum is: " + sum);

        if (sum >= winningSum) {
            System.out.println("pi4elish");
        } else {
            System.out.println("ni pi4elish");
        }
    }
}