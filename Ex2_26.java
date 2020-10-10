package com.company;

import java.util.Scanner;

public class Ex2_26 {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers");
        int a = input.nextInt();
        int b = input.nextInt();

        if(a % b == 0){
            System.out.println(b + " is a multiple of " + a);
        }

        if(b % a == 0){
            System.out.println(a + " is a multiple of " + b);
        }

        if(a % b == 1){
            System.out.println(b + " is not a multiple " + a);
        }
            if(b % a == 1){
                System.out.println(a + " is not a multiple " + b);
            }

    }
}