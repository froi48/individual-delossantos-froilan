package com.joysistvi.day10.nestedforloop;

public class MiniActivity {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {  // ---- number of columns

            for (int j = 1; j <= i; j++) { // ---- number of stars row
                System.out.print("* ");
            }

            System.out.println(); // if j is not <= i then this will be printed instead

        }

    }
}
