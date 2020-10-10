package com.company;

//2.16 (Comparing Integers) Write an application that asks the user to enter two integers, obtains
//        them from the user and displays the larger number followed by the words "is larger". If the numbers
//        are equal, print the message "These numbers are equal". Use the techniques shown in Fig. 2.15.

import java.util.Scanner;

public class Ex2_16 {
    public  static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int smallest = 0;
        int largest = 0;

        System.out.println("Enter two integers: ");
        a = input.nextInt();
        b = input.nextInt();

        if (a > b)
            System.out.println("(" + a + ")" + " is larger!");
        if (b > a)
            System.out.println("(" + b + ")" + " is larger!");
        if (a == b)
            System.out.println("(" + a + ")" + "(" + b + ")" + " are equal!");

    }

}
