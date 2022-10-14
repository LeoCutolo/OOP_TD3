package com.leo.td3;

public class Accessories extends Product{


    public Accessories(String name, double price, int nbItems, double discountValue){
        super(name, price, nbItems, discountValue);
    }

    @Override
    public void applyDiscount(){
        this.setPrice(this.getPrice() - this.getPrice() * this.getDiscountValue() / 100);
    }

    @Override
    public String toString(){
        return super.toString();
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
