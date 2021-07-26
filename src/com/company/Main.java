package com.company;

import java.util.Scanner;

public class Main {

/*
* Day 2: Operators

Task
Given the meal price (base cost of a meal), tip percent
* (the percentage of the meal price being added as tip),
*  and tax percent (the percentage of the meal price being
*  added as tax) for a meal, find and print the meal's
*  total cost. Round the result to the nearest integer.
 */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mealCost = input.nextDouble(); // original meal price
        int tipPercent = input.nextInt(); // tip percentage
        int taxPercent = input.nextInt(); // tax percentage
        input.close();

        // Write your calculation code here.
        double tip = mealCost * tipPercent / 100;
        double tax = mealCost * taxPercent / 100;

        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(mealCost + tip + tax);

        // Print your result
        System.out.println("The total meal cost is " + totalCost + " Rands.");
    }
}
