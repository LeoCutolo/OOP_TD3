package com.leo.td3;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Product implements Discount, Comparable<Double> {
    static double income = 0;
    private static AtomicInteger count = new AtomicInteger(0);
    private int number;
    private String name;
    private double price;
    private int nbItems;
    private double discountValue;

    public Product(String name, double price, int nbItems, double discountValue){
        this.number = count.incrementAndGet();
        this.name = name;
        if (price < 0){
            throw new IllegalArgumentException("price can't be negative");
        }
        this.price = price;
        if (nbItems <= 0){
            throw new IllegalArgumentException("Number of items can't be negative");
        }
        this.nbItems = nbItems;
        this.discountValue = discountValue;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNbItems() {
        return nbItems;
    }

    public void setNbItems(int nbItems) {
        this.nbItems = nbItems;
    }

    public void setDiscountValue(double discountValue) {
        this.discountValue = discountValue;
    }

    public double getDiscountValue() {
        return discountValue;
    }

    @Override
    public String toString(){
        String result = "This product is number : " + this.number;
        result += ", this product name is : " + this.name;
        result += ", this product price is : " + this.price;
        result += "€, this product number of items is : " + this.nbItems;

        return result;
    }

    public void sell(int nb){
        if (this.nbItems <= 0){
            throw new IllegalArgumentException("You don't have this product");
        }
        if (this.nbItems < nb){
            throw new IllegalArgumentException("You can't sell more than you have");
        }
        this.nbItems -= nb;
        Product.income += nb * this.price;
    }

    public void sort(){

    }

    public void purchase(int nb){
        if (nb <= 0){
            throw new IllegalArgumentException("You can't buy 0 or less items");
        }
        this.nbItems += nb;
        Product.income -= nb * this.price;
    }
}
