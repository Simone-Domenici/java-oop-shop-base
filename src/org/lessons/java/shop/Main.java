package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto Cuffie = new Prodotto("Logitech G-433", "Cuffie da gaming", 90.25);
        System.out.println(Cuffie.getFullName());
        System.out.println(Cuffie.getPrice());
        System.out.println(Cuffie.getBasePrice());
    }
}
