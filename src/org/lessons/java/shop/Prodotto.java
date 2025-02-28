package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    public int code;
    public String name;
    public String description;
    public double price;
    public int iva = 22;

    public Prodotto(String name,String description,double price){
        this.name = name;
        this.description = description;
        this.price = price;
        this.code = getRandomNumber();
    }

    public double getPrice(){
        return this.price + (this.price * (this.iva / 100.0));
    }

    public double getBasePrice(){
        double basePrice = this.price;
        return basePrice;
    }

    private int getRandomNumber(){
        Random random = new Random();
        int randomNumber = 100000000 + random.nextInt(900000000);
        return randomNumber;
    }

    public String getFullName(){
        String fullName = this.code + "-" + this.name;
        return fullName;
    }
}
