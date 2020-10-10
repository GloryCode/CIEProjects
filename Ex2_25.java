package com.company;
//2.25 (Odd or Even) Write an application that reads an integer and determines and prints whether
//        it’s odd or even. [Hint: Use the remainder operator. An even number is a multiple of 2. Any multiple
//        of 2 leaves a remainder of 0 when divided by 2.]

import java.util.Scanner;

public class Ex2_25 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int x = input.nextInt();
        int y = input.nextInt();

        if (x % 2 == 0){
            System.out.println(x + " is even");
        }
        if (y % 2 == 0){
            System.out.println(y + " is even");
        }



    }
}
