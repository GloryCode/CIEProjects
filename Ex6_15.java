package com.company;

import java.util.Scanner;

public class Ex6_15 {
    public static double hypotenuse(double side1, double side2){
        side1 = Math.pow(side1, 2);
        side2 = Math.pow(side2, 2);

        return Math.sqrt(side1 + side2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        double side01 = input.nextDouble();
        System.out.print("Enter side 2: ");
        double side02 = input.nextDouble();

        System.out.printf("The Hypotenuse side is: %.2f", hypotenuse(side01, side02));

    }
}
