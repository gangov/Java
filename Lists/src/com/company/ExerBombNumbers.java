package com.company;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class ExerBombNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] bombPower = scan.nextLine().split(" ");
        int bomb = Integer.parseInt(bombPower[0]);
        int power = Integer.parseInt(bombPower[1]);
        int bombs = 0;
        for (int i = 0; i <= numbers.size(); i++) {
            if (numbers.contains(bomb)) {
                bombs++;
            }
        }

        //detonate
        numbers = detonation(numbers, bomb, power);

        //sum
        int total = 0;
        for (int i = 0; i < numbers.size(); i++) {
            total += numbers.get(i);
//            System.out.print(numbers.get(i) + " ");
        }
        System.out.println(/*"| " +*/ total);
    }

    public static List<Integer> detonation(List<Integer> mineField, int bomb, int power) {
        int[] nums = new int[mineField.size()];
        for (int i = 0; i < mineField.size(); i++) {
            nums[i] = mineField.get(i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == bomb) {
                //removeRight
                for (int r = i - power; r <= i + power; r++) {
                    try {
                        nums[r] = 0;
                    } catch (Exception e) {
                        break;
                    }
                }
//                //removeLeft
//                for (int l = i - 1; l >= i - power; l--) {
//                    try {
//                        mineField.remove(l);
//                    } catch (Exception e) {
//                        break;
//                    }
//                }
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                result.add(nums[i]);
            }
        }

        return result;
    }
}
