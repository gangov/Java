package com.company;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ExerCompanyUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, ArrayList<String>> companyID = new TreeMap<>();

        while(true) {
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }

            String[] companyIDs = input.split(" -> ");
            String company = companyIDs[0];
            String id = companyIDs[1];

            if (!companyID.containsKey(company)) {
                companyID.put(company, new ArrayList<>());
                companyID.get(company).add(id);
            } else if (!companyID.get(company).contains(id)){
                companyID.get(company).add(id);
            }
        }

        for (Map.Entry<String, ArrayList<String>> entry : companyID.entrySet()) {
            System.out.println(entry.getKey());
            for (String something : entry.getValue()) {
                System.out.println("-- " + something);
            }
        }
    }
}
