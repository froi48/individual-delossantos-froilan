package com.joysistvi.day4.operators;

public class Activity2_DelosSantos {
    public static void main(String[] args) {
        double income = 50000;
        double foodAllowance = 15000;
        double transportation = 2500;
        double rent = 4500;
        double utilityBill = 3500;

        System.out.println("* Expense Tracker Program *");

        // Food Allowance
        double FoodAllowance = foodAllowance / income * 100;
        System.out.printf("Food Allowance: %.1f %%\n", FoodAllowance);

        // Transportation
        double Trans = transportation / income * 100;
        System.out.printf("Transportation %.1f %%\n", Trans);

        // Rent
        double Rent  = rent / income * 100;
        System.out.printf("Rent: %.1f %%\n", Rent);

        // Utility Bill
        double UtilityBill = utilityBill / income * 100;
        System.out.printf("Utility Bill: %.1f %%\n", UtilityBill);

        // Remaining Balance
        double balance = income - foodAllowance - transportation -rent - utilityBill;
        System.out.printf("Remaining Balance: %.0f", balance);


    }
}
