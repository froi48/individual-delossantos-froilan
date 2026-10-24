package com.joysistvi.day10.nestedforloop;

public class NestedForLoopStatement {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            for (int j = 1; j <= i; j++) {
                System.out.println("\t" + j);
            }
        }
    }
}





/*
// syntax of nested for loop
        // 3
        // System.out.println("****Multiplication Table****");
        for (int i = 1; i <= 10; i++) { //outer loop
            System.out.println("Multiplication Table of " + i);
            for (int j = 1; j <= 10; j++) { // inner loop
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
 */