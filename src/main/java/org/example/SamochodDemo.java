package org.example;

public class SamochodDemo {
    public static void main(String[] args) {
        Samochod car1 = new Samochod();
        car1.marka = "BMW";
        car1.przebieg = 90000.0;

        Samochod car2 = new Samochod();
        car2.marka = "HYUNDAI";
        car2.przebieg = 14500.67;

        car1.markaPrzebieg();
        car1.przebieg(4000);
        System.out.println("Do przeglądu zostało: " + car1.ileDoPrzeglądu() + " km");

        car2.markaPrzebieg();
        car2.przebieg(50000);
        System.out.println("Do przeglądu zostało: " + car2.ileDoPrzeglądu() + " km");

    }
}
