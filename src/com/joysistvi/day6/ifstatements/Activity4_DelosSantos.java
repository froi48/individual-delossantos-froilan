package com.joysistvi.day6.ifstatements;

public class Activity4_DelosSantos {
    public static void main(String[] args) {
        /*
        Age Categories:
            Age: 0 - 2 → Baby
            Age: 3 - 12 → Child
            Age: 13 - 19 → Teenager
            Age: 20 - 29 → Young Adult
            Age: 30 - 59 → Adult
            Age: 60 - 100 → Senior
         */

        int age = 25;
        String result = "";

        if (!(age >= 0 && age <= 100)) {
            return;
        } else if (age <= 2) {
            result = "Baby";
        } else if (age <= 12) {
            result = "Child";
        } else if (age <= 19) {
            result = "Teenager";
        } else if (age <= 29) {
            result = "Young Adult";
        } else if (age <= 59) {
            result = "Adult";
        } else {
            result = "Senior";
        }

        System.out.println("Age: " + age);
        System.out.println("Category: " + result);


    }
}
