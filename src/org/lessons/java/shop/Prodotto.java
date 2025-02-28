package org.lessons.java.shop;


public class Prodotto {
    public int code =724980323;
    public String name;
    public String description;
    public double price;
    public int iva = 22;

    public Prodotto(String name,String description,double price){
        this.name = name;
        this.description = description;
        this.price = price;


    }

    public String getFullName(){
        String fullName = this.code + "-" + this.name;
        return fullName;
    }
}
