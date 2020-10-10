package com.company;

import java.util.Scanner;

public class Ex4_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int number;
        int largest;

        System.out.print("Enter 10 numbers: ");
         number = input.nextInt();
         largest = number;

        while (counter < 10) {
            System.out.print("Enter number: ");
             number = input.nextInt();

             if(number > largest){
                 largest = number;
             }
             counter = counter + 1;
        }
        System.out.println("largest is: "+ largest);
    }

}






