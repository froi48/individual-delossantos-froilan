package com.joysistvi.day7.ifstatements;

public class ifladder {

    public static void main(String[] args) {
        // A(90+) B(80+) C(70+) F(69-)
        /*
            F
            E
            D
            C
            B
            A
         */

        int grade = 100;
        String result = "";

        // Early Exit
        // Terminates the method immediately if the grades is outside the valid range of 1 to 100

        if (!(grade >= 1 && grade <= 100)) {
            return;
        }

        if (grade <= 70) { // 1 - 70
            result = "F";
        } else if (grade <= 80) { // 71 - 80
            result = "C";
        } else if (grade <= 90) {
            result = "B";
        } else if (grade <= 100){
            result = "A";
        } else {
            result = "Invalid Grade";
        }

        System.out.println("Grade: " + grade);
        System.out.println("Classification: " + result);

        /*
        int grade = 100;
        String result = "";

        if (grade >= 1 && grade <= 100) {
            if (grade >= 1 && grade <= 70) {
                result = "F";
            } else if (grade >=71 && grade <=80) {
                result = "C";
            } else if (grade >= 81 && grade <= 90) {
                result = "B";
            } else  {
                result = "A";
            }
            System.out.println("Grade: " + grade);
            System.out.println("classification; " + result);
        } else {
            System.out.println("Invalid Grade");
        }

         */


        /* int day = 0;

        String dayName = "";

        if (day == 1) {
            // Executes when day is 1
            dayName = "Sunday";
        } else if (day == 2) {
            // Executes when day is 2
            dayName = "Monday";
        } else if (day == 3) {
            // Executes when day is 3
            dayName = "Tuesday";
        } else if (day == 4) {
            // Executes when day is 4
            dayName = "Wednesday";
        } else if (day == 5) {
            // Executes when day is 5
            dayName = "Thursday";
        } else if (day == 6) {
            // Executes when day is 6
            dayName = "Friday";
        } else if (day == 7) {
            // Executes when day is 7
            dayName = "Saturday";
        } else {
            // Executes when the day number is invalid
            dayName = "Invalid Day";
        }

        System.out.println(dayName);

         */
    }

}





