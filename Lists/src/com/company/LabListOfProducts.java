package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LabListOfProducts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int productsCount = Integer.parseInt(scan.nextLine());
        List<String> productsList = new ArrayList<String>();

        for (int i = 0; i < productsCount; i++) {
            String productName = scan.nextLine();
            productsList.add(productName);
        }

        Collections.sort(productsList);
        for (int i = 0; i <= productsList.size() - 1; i++) {
            System.out.println(i + 1 + "." + productsList.get(i));
        }
    }
}
