package com.pluralsight;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Drinks {
    static Scanner scanner;
    private static ArrayList<Drinks> drinksList;
    private String size;
    private boolean ice;
    private String brand;
    private String flavor;
    private float price;

    private static void loadDrinks() {
        Drinks Berry; Drinks Sprite = new Drinks("Small", true, "Salha", "Strawberry Lemonade Juice", 2.0F);
        Drinks Torue = new Drinks("Medium", true, "Torue", "Tangerine Passion Flavored Water", 2.5F);
        Drinks Braynel = new Drinks("Small", false, "Braynel", "Berry Blast Soda", 2.0F);
        Drinks Andy = new Drinks("Large", true, "Andy", "Amazing Apple Juice", 3.0F);
        drinksList.add(Sprite);
        drinksList.add(Torue);
        drinksList.add(Braynel);
        drinksList.add(Andy);
    }

    public Drinks(String size, boolean ice, String brand, String flavor, float price) {
        this.size = size;
        this.ice = ice;
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
    }

    public Drinks() {
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isIce() {
        return this.ice;
    }

    public void setIce(boolean ice) {
        this.ice = ice;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFlavor() {
        return this.flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float addDrink() {
        String userInput;
        do {
            System.out.println("Please enter a command: \nS = Small(S), \nM = Medium(M), \nL = Large (L)");
            System.out.println("\t1: Please select drink size: ");
            userInput = scanner.nextLine();
            if (userInput.equals("S")) {
                this.price += 2.0F;
            } else if (userInput.equals("M")) {
                this.price += 2.5F;
            } else if (userInput.equals("L")) {
                this.price += 3.0F;
            }

            System.out.println("\t2: Please select drink: ");
            userInput = scanner.nextLine();
            System.out.println("\t3: Would you like ice?: ");
            userInput = scanner.nextLine();
            System.out.println("\t4: Please select flavor choice:");
            userInput = scanner.nextLine();
            System.out.println("\t5: Would you like another drink?");
            switch (scanner.nextLine()) {
                case "1":
                    loadDrinks();
                    break;
                case "2":
                    displayDrinks();
                    break;
                default:
                    System.out.println("Your drink has been added");
            }
            break;
        } while(!userInput.equalsIgnoreCase("No"));

        return this.price;
    }


    public String toString() {
        return "Drinks{size=" + this.size + ", ice=" + this.ice + ", brand='" + this.brand + "', flavor='" + this.flavor + "'}";
    }

    public static void displayDrinks() {
        Iterator var0 = drinksList.iterator();
        if (var0.hasNext()) {
            Drinks drink = (Drinks)var0.next();
            PrintStream var10000 = System.out;
            String var10001 = drink.getSize();
            var10000.println("Drink Size: " + var10001);
            System.out.println("Ice: " + (drink.isIce() ? "Yes" : "No"));
            System.out.println("Brand: " + drink.getBrand());
            System.out.println("Flavor: " + drink.getFlavor());
            System.out.println("Price: " + drink.getPrice());
            System.out.println();
        }

    }

    static {
        scanner = new Scanner(System.in);
        drinksList = new ArrayList();
    }
}
