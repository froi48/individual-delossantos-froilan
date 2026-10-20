package com.joysistvi.day5.operators;

public class Activity3_DelosSantos {
    public static void main(String[] args) {

        int age = 20;
        boolean hasValidID = true;

        if (age >= 18 && hasValidID) {
            System.out.println("Allowed to enter the event: Yes");
        } else {
            System.out.println("Allowed to enter the event: No");
        }

        boolean isWeekend = true;
        boolean isHoliday = true;

        if (isWeekend || isHoliday) {
            System.out.println("Are there no classes today? Yes, no classes");
        } else {
            System.out.println("Are there no classes today? No, there are classes");
        }

        int grade = 85;
        String result = (grade >= 75) ? "Passed" : "Failed";
        System.out.println("Score: " + grade);
        System.out.println("Result: " + result);

        int num = 10;
        int num2 = 25;
        int bigger = (num > num2) ? num : num2;
        System.out.println("Number 1: " + num + ',' + " Number 2: " + num2);
        System.out.println("Bigger number: " + bigger);





    }
}






