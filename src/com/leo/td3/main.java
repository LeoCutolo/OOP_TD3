package com.leo.td3;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class main {
    public static void main(String[] args) {
        Product firstCloth = new Clothes("shirt", 54.99, 12,30, 40);
        Product firstShoe = new Shoes("Jordan 1", 71.99, 1,20, 43);
        Product firstAccessory = new Accessories("Apple Watch", 399, 93,50);
        Product secondCloth = new Clothes("Pants", 43, 53,30, 42);

        ArrayList<Product> ProductList = new ArrayList<Product>();
        ProductList.add(firstCloth);
        ProductList.add(firstShoe);
        ProductList.add(firstAccessory);
        ProductList.add(secondCloth);

        for (Product product : ProductList){
            System.out.println(product);
        }

        System.out.println("Before operations : \n");

        System.out.println("nb firstCloth = " + firstCloth.getNbItems());
        System.out.println("nb secondCloth = " + secondCloth.getNbItems());
        System.out.println("nb firstShoe = " + firstShoe.getNbItems());
        System.out.println("nb firstAccessory = " + firstAccessory.getNbItems());

        System.out.println();

        firstCloth.purchase(1);
        secondCloth.sell(28);
        firstShoe.sell(1);
        firstAccessory.sell(10);

        System.out.println("After operations : \n");

        System.out.println("nb firstCloth = " + firstCloth.getNbItems());
        System.out.println("nb secondCloth = " + secondCloth.getNbItems());
        System.out.println("nb firstShoe = " + firstShoe.getNbItems());
        System.out.println("nb firstAccessory = " + firstAccessory.getNbItems());

        System.out.println("Income so far : " + Product.income);

        System.out.println("\n\nList of product :");

        for (Product product : ProductList){
            System.out.println(product);
        }
        System.out.println("\nSorting according to price");
        Collections.sort(price, Comparator.comparingDouble());

        System.out.println("\n\nIt's sales time ! ");

        firstCloth.applyDiscount();
        secondCloth.applyDiscount();
        firstAccessory.applyDiscount();
        firstShoe.applyDiscount();

        System.out.println("firstCloth new price : " + firstCloth.getPrice());
        System.out.println("secondCloth new price : " + secondCloth.getPrice());
        System.out.println("firstShoe new price : " + firstShoe.getPrice());
        System.out.println("firstAccessory new price : " + firstAccessory.getPrice());

        firstCloth.sell(3);
        secondCloth.sell(10);
        firstShoe.purchase(3);
        firstAccessory.sell(10);

        System.out.println("After operations : \n");

        System.out.println("nb firstCloth = " + firstCloth.getNbItems());
        System.out.println("nb secondCloth = " + secondCloth.getNbItems());
        System.out.println("nb firstShoe = " + firstShoe.getNbItems());
        System.out.println("nb firstAccessory = " + firstAccessory.getNbItems());

        System.out.println("Income so far : " + Product.income);
    }
}
