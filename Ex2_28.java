package com.company;

import java.util.Scanner;

public class Ex2_28 {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the radius");
        double r = input.nextInt();
        double PI = 3.14159;
       double diameter = 2 * r;
       double circumference = PI * 2 * r;
       double area = PI * r * r;
        System.out.println("diameter is " + diameter);
        System.out.println("circumference is " + circumference);
        System.out.println("area is " + area);
    }
}
