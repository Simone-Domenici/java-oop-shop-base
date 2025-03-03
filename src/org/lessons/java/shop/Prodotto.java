package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    private int code;
    private String name;
    private String description;
    private double price;
    private int iva;


    // costruttori
    public Prodotto(){
        this.name = "";
        this.description = "";
        this.price = 0;
        this.iva = 0;
        this.code = getRandomNumber();
    }

    public Prodotto(String name,String description,double price, int iva){
        this.name = name;
        this.description = description;
        this.price = price;
        this.code = getRandomNumber();
        this.iva = iva;
    }

    // getter & setter

    public double getPrice(){
        return this.price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIva() {
        return this.iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int GetCode() {
        return this.code;
    }

    private void setCode(int code){
        this.code = code;
    }


    // metodi aggiuntivi
    public double getPriceIVA(){
        return this.price + (this.price * (this.iva / 100.0));
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
