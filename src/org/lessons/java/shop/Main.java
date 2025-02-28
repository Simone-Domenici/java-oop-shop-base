package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto Cuffie = new Prodotto("Logitech", "Cuffie da gaming", 99.34);
        System.out.println(Cuffie.getFullName());
    }
}
