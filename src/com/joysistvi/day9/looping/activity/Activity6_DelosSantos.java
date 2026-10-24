package com.joysistvi.day9.looping.activity;

import java.util.Scanner;

public class Activity6_DelosSantos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i;

        while (true) {
            System.out.println("(●'◡'●) Multiplication table, pick from 1 - 10  (●'◡'●)");
            i = scanner.nextInt();
            if (i >= 1 && i <= 10) {
                break;
            }
            System.out.println("Please pick numbers from 1 - 10 only!");
        }
            System.out.println("(^///^) Multiplication table of " + i + " (^///^)");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " ✖️" + j + " 🟰" + (i * j));
            }
        }
    }


























//        do {
//            System.out.println("Enter the multiplication table you want to display (1 - 10): ");
//            System.out.println("Enter 0 to Exit");
//            int choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1 -> {
//                    System.out.println("Multiplication Table of 1");
//                    System.out.println("1 x 1 = 1");
//                    System.out.println("1 x 2 = 2");
//                    System.out.println("1 x 3 = 3");
//                    System.out.println("1 x 4 = 4");
//                    System.out.println("1 x 5 = 5");
//                    System.out.println("1 x 6 = 6");
//                    System.out.println("1 x 7 = 7");
//                    System.out.println("1 x 8 = 8");
//                    System.out.println("1 x 9 = 9");
//                    System.out.println("1 x 10 = 10");
//                }
//                case 2 -> {
//                    System.out.println("Multiplication Table of 2");
//                    System.out.println("2 x 1 = 2");
//                    System.out.println("2 x 2 = 4");
//                    System.out.println("2 x 3 = 6");
//                    System.out.println("2 x 4 = 8");
//                    System.out.println("2 x 5 = 10");
//                    System.out.println("2 x 6 = 12");
//                    System.out.println("2 x 7 = 14");
//                    System.out.println("2 x 8 = 16");
//                    System.out.println("2 x 9 = 18");
//                    System.out.println("2 x 10 = 20");
//                }
//                case 3 -> {
//                    System.out.println("Multiplication Table of 3");
//                    System.out.println("3 x 1 = 3");
//                    System.out.println("3 x 2 = 6");
//                    System.out.println("3 x 3 = 9");
//                    System.out.println("3 x 4 = 12");
//                    System.out.println("3 x 5 = 15");
//                    System.out.println("3 x 6 = 18");
//                    System.out.println("3 x 7 = 21");
//                    System.out.println("3 x 8 = 24");
//                    System.out.println("3 x 9 = 27");
//                    System.out.println("3 x 10 = 30");
//                }
//                case 4 -> {
//                    System.out.println("Multiplication Table of 4");
//                    System.out.println("4 x 1 = 4");
//                    System.out.println("4 x 2 = 8");
//                    System.out.println("4 x 3 = 12");
//                    System.out.println("4 x 4 = 16");
//                    System.out.println("4 x 5 = 20");
//                    System.out.println("4 x 6 = 24");
//                    System.out.println("4 x 7 = 28");
//                    System.out.println("4 x 8 = 32");
//                    System.out.println("4 x 9 = 36");
//                    System.out.println("4 x 10 = 40");
//                }
//                case 5 -> {
//                    System.out.println("Multiplication Table of 5");
//                    System.out.println("5 x 1 = 5");
//                    System.out.println("5 x 2 = 10");
//                    System.out.println("5 x 3 = 15");
//                    System.out.println("5 x 4 = 20");
//                    System.out.println("5 x 5 = 25");
//                    System.out.println("5 x 6 = 30");
//                    System.out.println("5 x 7 = 35");
//                    System.out.println("5 x 8 = 40");
//                    System.out.println("5 x 9 = 45");
//                    System.out.println("5 x 10 = 50");
//                }
//                case 6 -> {
//                    System.out.println("Multiplication Table of 6");
//                    System.out.println("6 x 1 = 6");
//                    System.out.println("6 x 2 = 12");
//                    System.out.println("6 x 3 = 18");
//                    System.out.println("6 x 4 = 24");
//                    System.out.println("6 x 5 = 30");
//                    System.out.println("6 x 6 = 36");
//                    System.out.println("6 x 7 = 42");
//                    System.out.println("6 x 8 = 48");
//                    System.out.println("6 x 9 = 54");
//                    System.out.println("6 x 10 = 60");
//                }
//                case 7 -> {
//                    System.out.println("Multiplication Table of 7");
//                    System.out.println("7 x 1 = 7");
//                    System.out.println("7 x 2 = 14");
//                    System.out.println("7 x 3 = 21");
//                    System.out.println("7 x 4 = 28");
//                    System.out.println("7 x 5 = 35");
//                    System.out.println("7 x 6 = 42");
//                    System.out.println("7 x 7 = 49");
//                    System.out.println("7 x 8 = 56");
//                    System.out.println("7 x 9 = 63");
//                    System.out.println("7 x 10 = 70");
//                }
//                case 8 -> {
//                    System.out.println("Multiplication Table of 8");
//                    System.out.println("8 x 1 = 8");
//                    System.out.println("8 x 2 = 16");
//                    System.out.println("8 x 3 = 24");
//                    System.out.println("8 x 4 = 32");
//                    System.out.println("8 x 5 = 40");
//                    System.out.println("8 x 6 = 48");
//                    System.out.println("8 x 7 = 56");
//                    System.out.println("8 x 8 = 64");
//                    System.out.println("8 x 9 = 72");
//                    System.out.println("8 x 10 = 80");
//                }
//                case 9 -> {
//                    System.out.println("Multiplication Table of 9");
//                    System.out.println("9 x 1 = 9");
//                    System.out.println("9 x 2 = 18");
//                    System.out.println("9 x 3 = 27");
//                    System.out.println("9 x 4 = 36");
//                    System.out.println("9 x 5 = 45");
//                    System.out.println("9 x 6 = 54");
//                    System.out.println("9 x 7 = 63");
//                    System.out.println("9 x 8 = 72");
//                    System.out.println("9 x 9 = 81");
//                    System.out.println("9 x 10 = 90");
//                }
//                case 10 -> {
//                    System.out.println("Multiplication Table of 10");
//                    System.out.println("10 x 1 = 10");
//                    System.out.println("10 x 2 = 20");
//                    System.out.println("10 x 3 = 30");
//                    System.out.println("10  x 4 = 40");
//                    System.out.println("10 x 5 = 50");
//                    System.out.println("10 x 6 = 60");
//                    System.out.println("10 x 7 = 70");
//                    System.out.println("10 x 8 = 80");
//                    System.out.println("10 x 9 = 90");
//                    System.out.println("10 x 10 = 100");
//                }
//                case 0 -> {
//                    System.out.println("Exiting....");
//                    multiplicationTable = false;
//                }
//                default -> System.out.println("Invalid Input! Please choose from 1 - 10");
//            }
//        } while (multiplicationTable);