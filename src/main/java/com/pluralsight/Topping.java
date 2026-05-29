package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Topping extends Sandwich {
    private ArrayList<String> Meat = new ArrayList();
    private ArrayList<String> Sides = new ArrayList();
    private ArrayList<String> Sauces = new ArrayList();
    private ArrayList<String> Regular = new ArrayList();
    private ArrayList<String> Cheese = new ArrayList();
    protected float price;
    private boolean extraMeat;
    private boolean extraCheese;



    public Topping(String size) {
        super(size);
    }

    public Topping() {

    }

    public String toppings() {
        this.Meat.add("Steak");
        this.Meat.add("Ham");
        this.Meat.add("Salami");
        this.Meat.add("Roast Beef");
        this.Meat.add("Chicken");
        this.Meat.add("Bacon");
        this.Sides.add("Au jus");
        this.Sides.add("Sauce");
        this.Sauces.add("Mayo");
        this.Sauces.add("Mustard");
        this.Sauces.add("Ketchup");
        this.Sauces.add("Ranch");
        this.Sauces.add("Thousand Islands");
        this.Sauces.add("Vinaigrette");
        this.Regular.add("Lettuce");
        this.Regular.add("Peppers");
        this.Regular.add("Onions");
        this.Regular.add("Tomatoes");
        this.Regular.add("Jalapenos");
        this.Regular.add("Cucumbers");
        this.Regular.add("Pickles");
        this.Regular.add("Guacamole");
        this.Regular.add("Mushrooms");
        this.Cheese.add("American");
        this.Cheese.add("Provolone");
        this.Cheese.add("Cheddar");
        this.Cheese.add("Swiss");
        return null;
    }

    protected float calcPrice(String size) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many servings of meat would you like?");
        int meatServings = userInput.nextInt();
        System.out.println("How many servings of cheese would you like?");
        int cheeseServings = userInput.nextInt();
        System.out.println("Would you like extra meat?");
        String extraMeatRequest = userInput.next();
        if (extraMeatRequest.equalsIgnoreCase("Yes")) {
            this.extraMeat = true;
        } else if (extraMeatRequest.equalsIgnoreCase("Y")) {
            this.extraMeat = true;
        } else if (extraMeatRequest.equalsIgnoreCase("No")) {
            this.extraMeat = false;
        } else if (extraMeatRequest.equalsIgnoreCase("N")) {
            this.extraMeat = false;
        }

        System.out.println("Would you like extra cheese?");
        String extraCheeseRequest = userInput.next();
        if (extraCheeseRequest.equalsIgnoreCase("Yes")) {
            this.extraCheese = true;
        } else if (extraCheeseRequest.equalsIgnoreCase("Y")) {
            this.extraCheese = true;
        } else if (extraCheeseRequest.equalsIgnoreCase("No")) {
            this.extraCheese = false;
        } else if (extraCheeseRequest.equalsIgnoreCase("N")) {
            this.extraCheese = false;
        }

        if (size.equals("S")) {
            for(int i = 0; i < meatServings; ++i) {
                ++this.price;
            }

            for(int i = 0; i < cheeseServings; ++i) {
                this.price += 0.75F;
            }

            if (this.extraMeat) {
                this.price += 0.5F;
            }

            if (this.extraCheese) {
                this.price += 0.3F;
            }
        } else if (size.equals("M")) {
            for(int i = 0; i < meatServings; ++i) {
                this.price += 2.0F;
            }

            for(int i = 0; i < cheeseServings; ++i) {
                ++this.price;
            }

            if (this.extraMeat) {
                ++this.price;
            }

            if (this.extraCheese) {
                this.price += 0.6F;
            }
        } else if (size.equals("L")) {
            for(int i = 1; i < meatServings; ++i) {
                this.price += 3.0F;
            }

            for(int i = 1; i < cheeseServings; ++i) {
                this.price += 2.25F;
            }

            if (this.extraMeat) {
                ++this.price;
            }

            if (this.extraCheese) {
                this.price += 0.9F;
            }
        }

        super.setPrice(this.price + super.getPrice());
        return this.price;
    }
}
