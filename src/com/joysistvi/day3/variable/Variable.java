package com.joysistvi.day3.variable;

import java.awt.desktop.AboutEvent;

public class Variable { // class

        // psvm + tab
        public static void main(String[] args) { // main method
            // initialize a variable
            byte age = 23;  // whole number
            short num = -128;
            int num2 = 50_000;
            long num3 = 500000000000L;
            System.out.println(num2);

            float ave = 92.83f;
            double price = 16.5d; // with decimal
            System.out.println(price);

            boolean is_active =  false;
            is_active = true;
            System.out.println(is_active);

            char middleInitial = 'C'; // single character
            System.out.println("Middle Intiial: " + middleInitial);

            String firstName ="Froilan"; // series of characters
            String lastName ="Delos Santos";
            // Concatenation   (+)
            // Full Name: Delos Santos, Froilan C.
            System.out.println("Full Name: " + lastName + ", " + firstName + " " + middleInitial + ".");


        }
}





// Syntax -> structure of code
// Main Method: psvm + tab
// Print Statement: sout + tab