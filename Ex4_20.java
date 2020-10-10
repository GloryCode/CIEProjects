package com.company;

import java.util.Scanner;

public class Ex4_20{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int first40 = 5000;
        int a = 1;
        while(a <= 3) {

        System.out.print("Enter name: ");
        input.nextLine();
        String name = input.nextLine();

        System.out.print("Enter hours worked: ");
        int hours = input.nextInt();

        int extraHours = hours - 40;
        int amt = first40/2;
        int grossPay = first40 + amt;

        System.out.println("Worker's Details and Gross Pay");
        System.out.println();
        System.out.println("Name: "+ name);
        System.out.println("Hours worked: "+ hours);
        System.out.println("Extra Hours worked: "+ extraHours);
        System.out.println("Gross Pay: "+ grossPay);
        a = a + 1;
        }
    }

}
