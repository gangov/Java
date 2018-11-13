package com.company;

import java.util.ArrayList;
import java.util.Scanner;

class Vehicle{
    private String type;
    private String model;
    private String color;
    private int horsepower;

    public Vehicle(String type, String model, String color, int horsepower) {
        this.setType(type);
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    private void setType(String type) {
        type = type.replace(type.charAt(0), Character.toUpperCase(type.charAt(0)));
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public int getHorsePower() {
        return this.horsepower;
    }

    @Override
    public String toString() {
        return String.format("Type: %s%n" +
                "Model: %s%n" +
                "Color: %s%n" +
                "Horsepower: %d",
                this.getType(), this.getModel(), this.getColor(), this.getHorsePower());
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Vehicle> cars = new ArrayList<>();
        ArrayList<Vehicle> trucks = new ArrayList<>();

        String line = scan.nextLine();

        while (!line.equals("End")) {

            String[] tokens = line.split("\\s+");

            Vehicle vehicle = new Vehicle(tokens[0], tokens[1], tokens[2], Integer.parseInt(tokens[3]));

            if (vehicle.getType().equals("Truck")) {
                trucks.add(vehicle);
            } else {
                cars.add(vehicle);
            }

            line = scan.nextLine();
        }

        line = scan.nextLine();

        while (!line.equals("Close the Catalogue")) {
            String model = line;

            for (Vehicle truck : trucks) {
                if (truck.getModel().equals(model)) {
                    System.out.println(truck.toString());
                }
            }

            for (Vehicle car : cars) {
                if (car.getModel().equals(model)) {
                    System.out.println(car.toString());
                }
            }

            line = scan.nextLine();
        }

        double truckAvrgHP = 0;
        double carAvrgHP = 0;
        double carHPTotal = 0;
        double truckHPTotal = 0;

        if (!cars.isEmpty()) {
            for (Vehicle car : cars) {
                carHPTotal += car.getHorsePower();
            }

            carAvrgHP = carHPTotal / cars.size();
        }

        System.out.println(String.format("Cars have average horsepower of: %.2f.", carAvrgHP));

        if (!trucks.isEmpty()) {
            for (Vehicle truck : trucks) {
                truckHPTotal += truck.getHorsePower();
            }

            truckAvrgHP = truckHPTotal / trucks.size();
        }

        System.out.println(String.format("Trucks have average horsepower of: %.2f.", truckAvrgHP));
    }
}
