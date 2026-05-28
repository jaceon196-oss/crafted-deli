package com.pluralsight;

public class Order {
    private float price;

    public Order() {
    }

    public Order(float price) {
        this.price = price;
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
}
