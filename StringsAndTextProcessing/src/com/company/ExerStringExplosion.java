//String Explosion
//        Explosions are marked with ‘>’. Immediately after the mark, there will be an integer,
//        which signifies the strength of the explosion.
//        You should remove x characters (where x is the strength of the explosion), starting
//        after the punch character (‘>’).
//        If you find another explosion mark (‘>’) while you’re deleting characters, you should
//        add the strength to your previous explosion.
//        When all characters are processed, print the string without the deleted characters.
//        You should not delete the explosion character – ‘>’, but you should delete the integers,
//        which represent the strength.
//        Input
//        You will receive single line with the string.
//        Output
//        Print what is left from the string after explosions.
//        Constraints
//        You will always receive a strength for the punches
//        The path will consist only of letters from the Latin alphabet, integers and the char ‘>’
//        The strength of the punches will be in the interval [0…9]

package com.company;

import java.util.Scanner;

public class ExerStringExplosion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] input = scan.nextLine().toCharArray();
        StringBuilder result = new StringBuilder();

        int power = 0;
        int addToBomb = 0;
        for (int i = 0; i < input.length; i++) {
            char currentChar = input[i];
            if (currentChar == '>'){
                power = Integer.parseInt(input[i + 1] + "") + addToBomb;
                addToBomb = 0;
                result.append(currentChar);
                for (int j = i + 1; j < i + 1 + power; j++) {
                    try {
                        if (input[j] != '>'){
                            i++;
                            power--;
                        }else {
                            addToBomb = power;
                            break;
                        }
                    }catch (Exception e){
                        System.out.println(result.toString());
                        return;
                    }
                }
            }else {
                result.append(currentChar);
            }
        }
        System.out.println(result.toString());
    }
}
