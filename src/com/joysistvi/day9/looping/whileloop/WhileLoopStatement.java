package com.joysistvi.day9.looping.whileloop;

import java.util.Scanner;

public class WhileLoopStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Flag variable/ boolean flag
            boolean isRunning = true;

            while (isRunning) {
                System.out.println("* Load Reg *");
                System.out.println("    [1] Text Only!");
                System.out.println("    [2] Call Only!");
                System.out.println("    [3] Call N Text!");
                System.out.println("    [0] Exit");
                System.out.print("Enter your Choice");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> System.out.println("You are now subscribed to Text Only\n");
                    case 2 -> System.out.println("You are now subscribed to Call Only\n");
                    case 3 -> System.out.println("You are now subscribed to Call N Text\n");
                    case 0 -> {
                        System.out.println("Exiting...");
                        isRunning = false;
                    }
                    default -> System.out.println("Invalid Input! Please choose from 1 - 3\n1");
                }
            }

        }

    }


/*
    // Print your name 20 times
    int lives = 5;

        while (lives > 0) {
            System.out.println("Game is running");
            lives--;
        }
        System.out.println("Game is over 😢");
 */


/*
 // This program displays even numbers from 1-5;
        // 5 loops
        int number = 1;
        //  1 <= 5
        while (number <=5) {
            if (number % 2 == 0) {
            System.out.println(number); }
            number++;

 */