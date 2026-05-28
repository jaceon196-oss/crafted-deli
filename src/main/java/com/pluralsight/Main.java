package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Topping();
        new Sandwich();
        new Drinks();
        new Chips();
        Order o = new Order();
        new Scanner(System.in);
        System.out.println(o.getPriceD());
    }
}
