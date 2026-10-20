package com.joysistvi.day6.ifstatements;

public class ifelsestatement {
    public static void main(String[] args) {
        int age = 20;

        String result = "";

        if (age >= 18) {
            // Executes when age is greater than 18
            result = "Valid Age";
        } else {
            result = "Invalid Age";
        }

        System.out.println(age + " is " + result);

    }
}
