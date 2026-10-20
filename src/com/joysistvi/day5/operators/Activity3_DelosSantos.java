package com.joysistvi.day5.operators;

public class Activity3_DelosSantos {
    public static void main(String[] args) {

        int age = 20;
        boolean hasValidID = true;
        String result0 = (age >= 18 && hasValidID) ? "Yes" : "No";
        System.out.println("--- Task 2: Event Entry Check ---");
        System.out.println("Is allowed to enter the event: " + result0);


        boolean isWeekend = true;
        boolean isHoliday = true;
        String result1 = (isWeekend || isHoliday) ? "Yes, no classes" : "No, there are classes";
        System.out.println("--- Task 3: CLass Status Check ---");
        System.out.println("Are there no classes today: " + result1);


        int grade = 85;
        String result = (grade >= 75) ? "Passed" : "Failed";
        System.out.println("--- Task 4: Pass or Fail Check ---");
        System.out.println("Score: " + grade);
        System.out.println("Result: " + result);

        int num = 10;
        int num2 = 25;
        int bigger = (num > num2) ? num : num2;
        System.out.println("--- Task 5: Larger Number Check ---");
        System.out.println("Number 1: " + num + ',' + " Number 2: " + num2);
        System.out.println("Bigger number: " + bigger);





    }
}






