package com.joysistvi.day5.operators;

public class LogicalOperator {
    public static void main(String[] args) {
        // compound conditional statement

        int age = 16;
        boolean isJhs = age >= 13 && age <= 17;

        int age2 = 18;
        boolean isAdult = (age > 18);
        System.out.println(isAdult);

        int num = 10;
        int num2 = 20;

        // logical & - both table must be true for the whole statement to be TRUE
        //                      F           T           =       F
        // System.out.println(num > num2 && num < num2);

        // logical | (or) - either of the two is true, the whole statement becomes TRUE
        // becomes false if both tables are false
        //                      F           T           =       T
        // System.out.println(num > num2 || num < num2);


    }
}
