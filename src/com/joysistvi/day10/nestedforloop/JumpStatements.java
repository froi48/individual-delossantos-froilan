package com.joysistvi.day10.nestedforloop;

public class JumpStatements {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {

            if (i == 4) {
                continue; // - skips the loop
            }
            System.out.println(i + " HeLlO");
        }

    }
}

/*
        for (int i = 0; i < 10; i++) {

            if (i == 4) {
                break; - breaks the loop
            }
            System.out.println(i);
        }
 */

/*
    GOOD TO REMEMBER
    BREAK - break the loop
    CONTINUOUS - skips the loop
 */