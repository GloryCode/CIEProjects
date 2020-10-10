package com.company;

//3.12 (Invoice Class) Create a class called Invoice that a hardware store might use to represent
//        an invoice for an item sold at the store. An Invoice should include four pieces of information as
//        instance variables—a part number (type String), a part description (type String), a quantity of the
//        item being purchased (type int) and a price per item (double). Your class should have a constructor
//        that initializes the four instance variables. Provide a set and a get method for each instance variable.
//        In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e.,
//        multiplies the quantity by the price per item), then returns the amount as a double value. If the
//        quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to
//        0.0. Write a test app named InvoiceTest that demonstrates class Invoice’s capabilities.

public class Ex3_12Test {
    public static void main(String[]args){

        Ex3_12 invoice1 = new Ex3_12("1.", "PeaK Milk", 3, 250.0);
        Ex3_12 invoice2 = new Ex3_12("2.", "Sugar", 2, 400.0);
        Ex3_12 invoice3 = new Ex3_12("3.", "Milo", 3, 500.0);

        System.out.println("s/n \t Description \t Quantity \t Price \t\t Amount");
        System.out.printf("%s \t\t %s \t\t %d \t\t\t %.2f \t %.2f%n", invoice1.getNumber(), invoice1.getDescription(), invoice1.getQuantity(), invoice1.getPricePerItem(), (invoice1.getQuantity()*invoice1.getPricePerItem()));
        System.out.printf("%s \t\t %s \t\t\t %d \t\t\t %.2f \t %.2f%n", invoice2.getNumber(), invoice2.getDescription(), invoice2.getQuantity(), invoice2.getPricePerItem(), (invoice2.getQuantity()*invoice2.getPricePerItem()));
        System.out.printf("%s \t\t %s \t\t\t %d \t\t\t %.2f \t %.2f%n", invoice3.getNumber(), invoice3.getDescription(), invoice3.getQuantity(), invoice3.getPricePerItem(), (invoice3.getQuantity()*invoice3.getPricePerItem()));
    }

}
