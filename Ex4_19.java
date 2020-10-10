package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Ex4_19 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int bonus = 200;
        double Amount;
        double earnings;
        int a = 1;

        System.out.print("Enter num of customers: ");
        int num = input.nextInt();

        while (a <= num) {

            System.out.print("Enter Amount: ");
            Amount = input.nextInt();
            System.out.println("Enter the number of items: ");
            int items = input.nextInt();


            earnings = bonus + (0.09 * Amount);


            System.out.println("earnings is: " + earnings);

            a = a + 1;
        }

    }
}