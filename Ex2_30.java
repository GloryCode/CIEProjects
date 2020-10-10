package com.company;

import java.util.Scanner;

public class Ex2_30 {

    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five digits number");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        System.out.printf("%d%n%n%n%d%n%n%n%d%n%n%n%d%n%n%n%d", a,b,c,d,e);
    }
}
