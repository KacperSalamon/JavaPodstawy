package org.example;

import java.util.Random;
import java.util.Scanner;

public class GraWKości2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //int wynik = 0;
        int tymczasowaPula = 0;
        int trwalaPula = 0;

        System.out.println("Gra w kości - Wersja 2");
        System.out.println("Zdobądź 20 punktów, ale uważaj, jeśli wypadnie 1 to przegrywasz!");

        while (tymczasowaPula < 20) {

            System.out.println("Chcesz rzucić kostką czy spasować?");
            System.out.println("Twój wynik to: " + tymczasowaPula);
            System.out.println("1. Rzucam");
            System.out.println("2. Pasuję");


            int wybor = scanner.nextInt();

            if (wybor == 1) {
                int rzut = random.nextInt(6) + 1;
                System.out.println("Rzucasz... wypadło " + rzut);

                if (rzut == 1) {
                    tymczasowaPula = 0;
                    System.out.println("Niestety wypadła jedynka! Tracisz punkty w tym rzucie.");
                    break;
                } else {
                    tymczasowaPula += rzut;
                }
            } else if (wybor == 2) {
                trwalaPula += tymczasowaPula;
                tymczasowaPula = 0;
                System.out.println("Pasujesz. Trwała pula: " + trwalaPula);
                break;
            } else {
                System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
            }

        }

        System.out.println("Koniec gry! Tym razem uzbierano " + trwalaPula + " punktów.");
        scanner.close();
    }
}
