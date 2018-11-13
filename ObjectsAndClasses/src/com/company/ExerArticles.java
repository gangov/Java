package com.company;

import java.util.Scanner;

class Article {
    private String title;
    private String content;
    private String author;

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void edit(String newContent) {
        this.content = newContent;
    }

    public void changeAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void rename(String newTitle) {
        this.title = newTitle;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s", this.title, this.content, this.author);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] inputData = scan.nextLine().split(", ");

        Article article = new Article(inputData[0], inputData[1], inputData[2]);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] inputCommand = scan.nextLine().split(": ");
            String command = inputCommand[0];

            if (command.equals("Edit")) {
                article.edit(inputCommand[1]);
            } else if (command.equals("ChangeAuthor")) {
                article.changeAuthor(inputCommand[1]);
            } else if (command.equals("Rename")) {
                article.rename(inputCommand[1]);
            }
        }

        System.out.println(article.toString());
    }
}
