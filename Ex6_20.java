package com.company;

import java.util.Scanner;

public class Ex6_20 {
    public static double circleArea(double radius){
        return Math.PI * (radius*radius);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program to calculate area of circle");
        System.out.println();
        System.out.print("Enter radius: ");
        int rad = input.nextInt();

        circleArea(rad);

        System.out.printf("The Area of the circle: %.2f", circleArea(rad));
    }
}
