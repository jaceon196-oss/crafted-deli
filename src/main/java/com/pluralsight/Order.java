package com.pluralsight;

public class Order {
    private float price;
    private Object receiptText;

    public Order(float price) {
        this.price = price;
    }

    public Order() {

    }

    public float getPriceD() {
        Sandwich s = new Sandwich();
        Drinks d = new Drinks();
        Chips c = new Chips();
        this.price = s.getSandwichPrice() + d.addDrink() + c.chipsMenu();
        return this.price;
    }

    public String showReceipt() {
        return "";
    }

    public Object getReceiptText() {
        return receiptText;
    }

    public void setReceiptText(Object receiptText) {
        this.receiptText = receiptText;
    }
}
