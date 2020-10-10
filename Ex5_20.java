package com.company;

public class Ex5_20 {
    public static void main(String []args){
        System.out.println("S/N(PI)\t\tValues");
        double i = Math.PI;
        for (int j=1; j<=20; j++){
            System.out.println(j+"\t\t\t"+i++);
        }
    }
}
