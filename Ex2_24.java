package com.company;

import java.util.Scanner;

public class Ex2_24 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int a,b,c,d,e;


        System.out.println("Enter five integers");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        e = input.nextInt();

        int smallest = 0;
        int largest = 0;

     //conditions to check for the smallest

        if (smallest < a) {
            smallest = a;
        }
        if (b < smallest) {
            smallest = b;
        }
        if (c < smallest){
            smallest = c;
        }
        if (d < smallest) {
            smallest = d;
        }
        if (e < smallest){
            smallest = e;
        }

        //conditions to check for largest
        if (a > largest){
            largest = a;
        }
        if (b > largest){
            largest = b;
        }
        if (c > largest){
            largest = c;
        }
        if (d > largest){
            largest = d;
        }
        if (e > largest){
            largest = e;
        }

        System.out.println("smallest is " + smallest);
        System.out.println("largest is " + largest);

    }
}
