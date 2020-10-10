package com.company;

import java.util.Scanner;

public class Ex3_11Test {
    public static void main(String[] args) {
        Ex3_11 account1 = new Ex3_11("Jane Green", 50.00);
        Ex3_11 account2 = new Ex3_11("John Blue", -7.53);

        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
                account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);
        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);

        account1.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
                account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);

        System.out.print("Enter withdrawal amount for account1: ");
        double withdrawalAmount = input.nextDouble();
        System.out.printf("%nsubtracting %.2f from account1 balance%n%n", depositAmount);

        account1.withdrawal(withdrawalAmount);

        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
                account2.getName(), account2.getBalance());

        System.out.print("Enter withdrawal amount for account2: ");
        withdrawalAmount = input.nextDouble();
        System.out.printf("%nsubtracting %.2f from account2 balance%n%n", withdrawalAmount);
        account2.withdrawal(withdrawalAmount);

        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
                account2.getName(), account2.getBalance());


        }
    }

