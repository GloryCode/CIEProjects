package com.company;


public class Ex3_14Test {
    public static void main(String[]args){

        Ex3_14 date1 = new Ex3_14(7,14, 2020);
        System.out.println();
        System.out.printf("%d/%d/%d ", date1.getMonth(), date1.getDay(), date1.getYear());
    }
}
