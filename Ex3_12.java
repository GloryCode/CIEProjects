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

public class Ex3_12 {
    private String number;
    private String description;
    private int quantity;
    private double PricePerItem;

    public Ex3_12(String number, String description, int quantity, double pricePerItem) {
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.PricePerItem = pricePerItem;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return PricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.PricePerItem = pricePerItem;
    }


}
