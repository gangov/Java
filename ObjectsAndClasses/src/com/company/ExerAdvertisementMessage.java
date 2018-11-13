package com.company;

import java.util.Random;
import java.util.Scanner;

public class ExerAdvertisementMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = Integer.parseInt(scan.nextLine());

        String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.",
                "I can’t live without this product."};

        String[] events = {"Now I feel good.", "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!"};

        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};

        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random rnd = new Random();
        //{phrase} {event} {author} – {city}.
        for (int i = 0; i < count; i++) {
            String phrase = phrases[rnd.nextInt(phrases.length)];
            String event = events[rnd.nextInt(events.length)];
            String author = authors[rnd.nextInt(authors.length)];
            String city = cities[rnd.nextInt(cities.length)];
            System.out.printf("%s %s %s - %s\n", phrase, event, author, city);
        }

    }
}
