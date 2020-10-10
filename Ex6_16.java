package com.company;

import java.util.Scanner;

public class Ex6_16 {

    public static boolean isMultiple(){
        boolean result = true;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 2 numbers separated by spaces: ");
        int a = input.nextInt();
        int b = input.nextInt();
        if (a%b==0){
            result = true;
        }
        else {
            result = false;
            input.close();
        }
        return result;

    }
}
