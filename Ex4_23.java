package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Ex4_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int largest = 0;
        int secondLargest;
        System.out.println("Enter 10 numbers: ");
        num = input.nextInt();
        secondLargest = num;

//        if(num > secondLargest) {
//            secondLargest = num;
//        }
        System.out.println("secondLargest is : " + secondLargest);
        if(secondLargest > largest){
            largest = secondLargest;
        }
        System.out.println("largest is: " + largest);
    }

}
