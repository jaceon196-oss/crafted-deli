package com.pluralsight;

import java.util.Scanner;

public class Sandwich {
    private String size;
    private float price;

    public float getPrice() {
        return this.price;
    }

    public Sandwich() {
    }

    public Sandwich(String size) {
        this.size = size;
    }

    public Sandwich(String size, float price) {
        this.size = size;
        this.price = price;
    }

    public float getBreadPrice() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What size would you like your sandwich to be?\nS = Small(4 inch)\nM = Medium(8 inch)\nL = Large (12 inch)");
        String sizeInput = userInput.next();
        this.size = sizeInput;
        return this.price;
    }

    public float getSandwichPrice() {
        this.getBreadPrice();
        float toppingPrice = this.calculateToppingPrice(this.size);
        if (this.size.equals("S")) {
            this.price += 5.5F;
        } else if (this.size.equals("M")) {
            this.price += 7.0F;
        } else if (this.size.equals("L")) {
            this.price += 8.5F;
        }

        this.price += toppingPrice;
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return this.size;
    }

    protected float calculateToppingPrice(String size) {
        Topping t = new Topping();
        return t.calcPrice(size);
    }
}
