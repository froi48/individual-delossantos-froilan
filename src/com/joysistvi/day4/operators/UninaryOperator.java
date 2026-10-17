package com.joysistvi.day4.operators;

public class UninaryOperator {
    public static void main(String[] args){
        // negating an expression (-)

        int num = 10;
        num = 11;
        // System.out.println(-num);

        // inverting the value of a boolean (!)
        boolean isActive = true;
        // System.out.println(!isActive);

        // increment/decrement a value by one
        // pre-increment
        int num2 = 20;
        System.out.println(++num2);
        System.out.println(--num2);

        // post-increment
        int num3 = 30;
        System.out.println(num3++);
        System.out.println(num3);


    }
}
