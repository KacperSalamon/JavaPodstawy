package org.example;

public class Samochod {
    String marka;
    double przebieg;
    double przebiegDoPrzeglądu  = 20000;

    public void markaPrzebieg() {
        System.out.println("Marka auta to: " + marka + " jego przebig to: " + przebieg + " km.");
    }

    public void przebieg(int odleglosc) {
        System.out.println(przebieg += odleglosc);

    }

    public double ileDoPrzeglądu(){
        return przebiegDoPrzeglądu - przebieg;

    }
}
