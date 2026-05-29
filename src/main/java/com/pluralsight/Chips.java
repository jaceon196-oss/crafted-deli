package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Chips {
    static Scanner scanner;
    private static ArrayList<Chips> chipsList;
    private String name;
    private float price;
    private boolean isSpicy;

    public Chips() {

    }


    public float chipsMenu() {
        loadChips();

        String string;

        System.out.println("Would you like chips? (yes/no)");
        String input = scanner.next();

        if (input.equalsIgnoreCase("yes")) {

            System.out.println("Spicy chips or regular chips?");
            String chipType = scanner.next();

            System.out.println(chipType + " chips added to cart.");

            // example price update
            this.price += 1.50;
        } else {
            System.out.println("No chips added.");
        }
        return this.price;
    }

    private static void loadChips() {
        Chips regularChip = new Chips("Regular Chip", 1.5F, false);
        Chips spicyChip = new Chips("Spicy Chip", 1.5F, true);
        chipsList.add(regularChip);
        chipsList.add(spicyChip);
    }

    public Chips(String name, float price, boolean isSpicy) {
        this.name = name;
        this.price = price;
        this.isSpicy = isSpicy;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return (double)this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isSpicy() {
        return this.isSpicy;
    }

    public void setSpicy(boolean spicy) {
        this.isSpicy = spicy;
    }

    public String toString() {
        return "Chips{name='" + this.name + "', price=" + this.price + ", isSpicy=" + this.isSpicy + "}";
    }

    static {
        scanner = new Scanner(System.in);
        chipsList = new ArrayList();
    }
}
