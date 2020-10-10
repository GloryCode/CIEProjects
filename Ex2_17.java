package com.company;

import java.util.Scanner;

public class Ex2_17 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int a,b,c;

        System.out.println("Enter three integers");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        int sum = a + b + c;
        int average =( a + b + c)/3;
        int product =a * b * c;
        int smallest = 0;
        int largest = 0;

        // Conditions to check for smallest
        if (smallest < a) {
            smallest = a;
        }
        if (b < smallest) {
            smallest = b;
        }
        if (c < smallest){
            smallest = c;
        }

        // Conditions to check for largest
        if (a > largest){
            largest = a;
        }
        if (b > largest){
            largest = b;
        }
        if (c > largest){
            largest = c;
        }

        System.out.println("sum is "+ sum);
        System.out.println("average is "+ average);
        System.out.println("product is "+ product);
        System.out.println("smallest is " + smallest);
        System.out.println("largest is " + largest);
    }
}
