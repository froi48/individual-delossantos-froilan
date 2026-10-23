package com.joysistvi.day9.looping.dowhileloop;

import java.util.Scanner;

public class DoWhileLoopStatement {
    public static void main(String[] args) {
//        int i = 0;
//
//        do {
//            System.out.println(i);
//            i++;
//
//        } while (i <= 10);


        Scanner scanner = new Scanner(System.in);
        // Flag variable/ boolean flag
        boolean isRunning = true;


        do {
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
            } while (isRunning);


        }
    }





