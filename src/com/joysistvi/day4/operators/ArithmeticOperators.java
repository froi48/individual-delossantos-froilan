package com.joysistvi.day4.operators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        // System.out.println("Hello World");
            // concatenation => joins string
        String name = "summer";
        // System.out.println("hello " + name + " world");
        // System.out.println("is a square number " + (8 + 8));

        int num1 = 20;
        int num2 = 21;
        int num3 = 3;
        int sum = num1 + num2;
        int diff = num2 - num1;
        int product = num1 * num2;
        int quotient = num1 / num2;
        double quotient1 = (double) num1 / num3; // casting
        System.out.println(quotient1);
        System.out.println("diff: " + diff);
        System.out.println("product: " + product);
        System.out.println("quotient: " + quotient);
        System.out.println("sum: " + sum);

        // % => Modulus
        int num4 = 35;
        int num5 = 10;
        double remainder = num4 % num5;
        System.out.println(remainder);

    }
}
