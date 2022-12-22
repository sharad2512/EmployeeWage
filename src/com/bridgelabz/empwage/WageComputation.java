package com.bridgelabz.empwage;

public class WageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage computation program");
        final int WAGE_PER_HRS = 20;
        final int WORKING_HRS = 8;
        int dailyWage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == 1) {
            System.out.println("Employee is present ");
            dailyWage = WORKING_HRS * WAGE_PER_HRS;
        } else {
            System.out.println("Employee is absent");
        }
        System.out.println("Employee Daily Wage Is " + dailyWage);
    }
}
