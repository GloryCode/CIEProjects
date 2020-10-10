package com.company;

import java.util.Scanner;

public class Ex4_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 1;
        System.out.print("Enter the num of customers");
            int num = input.nextInt();
        while (a <= num) {
            System.out.print("Enter Acc No: ");
            int acc = input.nextInt();              

            System.out.print("Enter balance at the beginning of the month: ");
            int bal = input.nextInt();

            System.out.print("No of items charged for the month: ");
            int items = input.nextInt();

            System.out.print("Total credit applied to cus acc: ");
            int credit = input.nextInt();

            int newBal = bal + items - credit;

            int creditAllowed = 2000;

            System.out.println("The new balance is: " + newBal);

            if (newBal > creditAllowed) {
                System.out.println("Credit limit exceeded!!");
                System.out.println();
                System.out.println();
            }

            a = a + 1;
        }
    }
}
