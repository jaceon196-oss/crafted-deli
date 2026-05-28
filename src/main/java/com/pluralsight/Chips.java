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

        String input;
        do {
            System.out.println("Would you like chips?");
            input = scanner.next();
            if (input.equalsIgnoreCase("Yes")) {
                ++this.price;
            }

            System.out.println("Spicy chips or regular chips?");
            input = scanner.next();
            System.out.println("Would you like another order of chips?\nType 'No' to exit, otherwise any input to order more chips.");
            switch (scanner.next()) {
                case "No":
                    System.out.println("We Gotchu!! The chips have been added to your cart");
                    break;
                default:
                    System.out.println("");
            }
        } while(!input.equalsIgnoreCase("No"));

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
