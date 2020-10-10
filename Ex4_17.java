package com.company;

import java.util.Scanner;

public class Ex4_17 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int count = 1;
        double total1 = 0;
        double total2 = 0;
        System.out.println();
        System.out.println("       Program to calculate average      ");
        System.out.println("miles and gallons used per trip travelled");

        System.out.println();
        System.out.print("Enter number of trips: ");
        int trip = input.nextInt();
        System.out.println();

        while (count<=trip) {
            System.out.print("Enter miles travelled: ");
            int mile = input.nextInt();
            total1 = total1 + mile;
            System.out.print("Enter gallons used: ");
            int gal = input.nextInt();
            total2 = total2 + gal;

            count = count + 1;
            System.out.println();
        }

        double ave1 = total1/trip;
        double ave2 = total2/trip;
        System.out.println();

        System.out.printf("The average of miles and gallons used is: %.2f miles %.2f gallons", ave1, ave2);
        System.out.println();
    }
}
