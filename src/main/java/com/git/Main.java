package com.git;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedNow = now.format(formatter);
        System.out.println("Displaying current date: " + formattedNow);
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome! Please, enter your name: ");

        String name = scanner.nextLine();

        System.out.println("Here are some extra changes to stash. Hello " + name + "! This is the cherry-picked changed greeting version!");

        scanner.close();
    }
}