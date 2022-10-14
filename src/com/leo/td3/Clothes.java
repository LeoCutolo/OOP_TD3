package com.leo.td3;

public class Clothes extends Product {

    private int size;


    public Clothes(String name, double price, int nbItems, double discountValue, int size){
        super(name, price, nbItems, discountValue);
        if (size < 34 || size > 54){
            throw new IllegalArgumentException("Wrong size!");
        }
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void applyDiscount(){
        this.setPrice(this.getPrice() - this.getPrice() * this.getDiscountValue() / 100);
    }

    @Override
    public String toString(){
        String result = super.toString();
        result += " this product size is : " + size;
        return result;
    }

    @Override
    public int compareTo(Product o) {
        if (this.getPrice() > o.getPrice()){
            return 1;
        }
        else if (this.getPrice() == o.getPrice()){
            return 0;
        }
        return -1;
    }
}
