package com.company;

//2.15 (Arithmetic) Write an application that asks the user to
// enter two integers, obtains them from the user and prints their sum,
// product, difference and quotient (division). Use the technique shown in Fig. 2.7.

import java.util.Scanner;

public class Ex2_15 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int a = input.nextInt();
        int b = input.nextInt();

        int sum = a + b;
        int diff = a - b;
        int product = a * b;
        int div = a / b;

        System.out.println("Their sum is: " + sum);
        System.out.println("Their difference is: " + diff);
        System.out.println("Their product is: " + product);
        System.out.println("Their quotient is: " + div);
    }

}
