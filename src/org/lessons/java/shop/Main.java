package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto Cuffie = new Prodotto("Logitech G-433", "Cuffie da gaming", 90.25, 22);
        System.out.println(Cuffie.getFullName());
        System.out.println(Cuffie.getPrice());
        System.out.println(Cuffie.getPriceIVA());
        System.out.println(Cuffie.GetCode());
        Cuffie.setName("Logitech G Pro-X");
        System.out.println(Cuffie.getFullName());

        Prodotto Macchina = new Prodotto();
        System.out.println(Macchina.getFullName());
        System.out.println(Macchina.getPrice());
        System.out.println(Macchina.getPriceIVA());

    }
}

