package com.company;

import java.util.Scanner;

public class Ex6_14 {
    public static void integerPower(int base, int exponent){
        for (int i=base; base<=exponent; base*=exponent, base++){
            ;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        System.out.println("a base and an exponent");
        System.out.print("Enter base: ");
        int bas = input.nextInt();
        System.out.print("Enter exponent: ");
        int exp = input.nextInt();

        integerPower(bas, exp);
    }
}
