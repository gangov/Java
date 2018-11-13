package com.company;

import java.util.ArrayList;
import java.util.Scanner;

class Articles {
    String title;
    String content;
    String author;

    public Articles(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s", this.title, this.content, this.author);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = Integer.parseInt(scan.nextLine());

        ArrayList<Articles> allArticles = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            String[] inputData = scan.nextLine().split(", ");
            Articles newArticle = new Articles(inputData[0], inputData[1], inputData[2]);
            allArticles.add(newArticle);
        }

        String sorting = scan.nextLine();

        if (sorting.equals("title")) {
            allArticles.stream().sorted((p1, p2) -> p1.title.compareTo(p2.title))
                    .forEach(p -> System.out.println(p.toString()));
        } else if (sorting.equals("content")) {
            allArticles.stream().sorted((p1, p2) -> p1.content.compareTo(p2.content))
                    .forEach(p -> System.out.println(p.toString()));
        } else if (sorting.equals("author")) {
            allArticles.stream().sorted((p1, p2) -> p1.author.compareTo(p2.author))
                    .forEach(p -> System.out.println(p.toString()));
        }
    }
}
