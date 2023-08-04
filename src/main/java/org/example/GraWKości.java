package org.example;

import java.util.Random;
import java.util.Scanner;

public class GraWKości {
    static Random random = new Random();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int wynik = 0;
        int trwalaPula = 0;
        int tymczasowaPula = 0;

        System.out.println("Gra w kości - Pierwsza wersja");
        //System.out.println("Trzy tury, zdobądź jak najwięcej punktów!");

        while (wynik < 20) {
            //System.out.println("Tura " + tura);
            System.out.println("Chcesz rzucić kostką czy spasować?");
            System.out.println("Twój wynik to: " + wynik);
            System.out.println("1. Rzucam");
            System.out.println("2. Pasuję");

            int wybor = scanner.nextInt();

            if (wybor == 1) {
                int rzut = returnThrow();
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
                System.out.println("Pasujesz. Twój wynik w tej turze: " + tymczasowaPula);
                break;
            } else {
                System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
            }
        }

        System.out.println("Koniec gry! Tym razem uzbierano " + trwalaPula + " punktów.");
        scanner.close();

    }

    public static int returnThrow() {
        //Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
