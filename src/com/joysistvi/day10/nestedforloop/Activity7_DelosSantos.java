package com.joysistvi.day10.nestedforloop;

import java.util.Scanner;

public class Activity7_DelosSantos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <=10; i++) {
            System.out.println("(❁´◡`❁) Multiplication Table of " + i + " (❁´◡`❁)"); {
                for (int j = 1; j <=10; j++) {
                    System.out.println(i + " ✖ " + j + " 🟰 " + (i * j));
                }
            }
            System.out.println();
            System.out.println("☆*: .｡. o(≧▽≦)o .｡.:*☆");
        }

    }
}
