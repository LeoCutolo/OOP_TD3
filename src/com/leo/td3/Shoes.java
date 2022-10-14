package com.leo.td3;

public class Shoes extends Product{

    private int shoeSize;

    public Shoes(String name, double price, int nbItems, double discountValue, int shoeSize){
        super(name, price, nbItems, discountValue);
        if (shoeSize < 36 || shoeSize > 50){
            throw new IllegalArgumentException("Wrong shoe size!");
        }
        this.shoeSize = shoeSize;
    }

    public int getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    @Override
    public void applyDiscount(){
        this.setPrice(this.getPrice() - this.getPrice() * this.getDiscountValue() / 100);
    }

    @Override
    public String toString(){
        String result = super.toString();
        result += " this shoe size is : " + this.shoeSize;
        return result;
    }

    @Override
    public int compareTo(Double o) {
        if (this.getPrice() > o){
            return 1;
        }
        else if (this.getPrice() == o){
            return 0;
        }
        return -1;
    }
}
