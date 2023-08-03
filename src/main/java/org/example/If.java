package org.example;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        //13
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź liczbę: ");
        double number = scanner.nextDouble();

        if(number >= 0){
            System.out.println("Jest to liczba dodatnia");
        } else if (number < 0) {
            System.out.println("Liczba jest ujemna");
        }else {
            System.out.println("Liczba == 0");
        }

        if(number % 2  == 0){
            System.out.println("Liczba jest parzysta");
        }else{
            System.out.println("Liczba jest nieparzysta");
        }

        //14
        System.out.println("Hej, opowiedz mi o swoich zainteresowaniach, wybierz jedną z 3 opcji:");
        System.out.println("1. Lubię programować");
        System.out.println("2. Lubię grać w gry");
        System.out.println("3. Lubię programować oraz grać w gry");

        int choosen = scanner.nextInt();

        if (choosen == 1) {
            System.out.println("O, lubisz programować.");
            System.out.print("W jakim języku lubisz programować? ");
            scanner.nextLine(); // Pominięcie pustego wiersza
            String programmingLanguage = scanner.nextLine();

            System.out.println("Pora na małe podsumowanie:");
            System.out.println("Twój ulubiony język programowania to " + programmingLanguage + ".");
        } else if (choosen == 2) {
            System.out.println("O, lubisz grać w gry.");
            System.out.print("W jaką grę lubisz grać? ");
            scanner.nextLine(); // Pominięcie pustego wiersza
            String favouriteGame = scanner.nextLine();

            System.out.println("Pora na małe podsumowanie:");
            System.out.println("Twoja ulubiona gra to " + favouriteGame + ".");
        } else if (choosen == 3) {
            System.out.println("O, lubisz jedno i drugie.");
            System.out.print("W jakim języku lubisz programować? ");
            scanner.nextLine(); // Pominięcie pustego wiersza
            String programmingLanguage = scanner.nextLine();

            System.out.print("W jaką grę lubisz grać? ");
            String favouriteGame = scanner.nextLine();

            System.out.println("Pora na małe podsumowanie:");
            System.out.println("Twój ulubiony język programowania to " + programmingLanguage + ".");
            System.out.println("Twoja ulubiona gra to " + favouriteGame + ".");
        } else {
            System.out.println("Nieprawidłowy wybór.");
        }

        //scanner.close();

        //15
        System.out.println("Pada deszcze? ");
        boolean descz = scanner.nextBoolean();
        System.out.println("Świeci słońce? ");
        boolean swieciSlonce = scanner.nextBoolean();

        if(descz == true && swieciSlonce == true) {
            System.out.println("tęcza");
        } else if (descz == false && swieciSlonce == true) {
            System.out.println("jest pogodnie");
        } else if (descz == false && swieciSlonce == false) {
            System.out.println("jest pochmurno");
        }else{
            System.out.println("ulewa");
        }

        //16

        double cena, rata;
        int liczbaRat;

        System.out.println("Podaj cenę towaru w widełkach od 100 do 10k złoty: ");
        cena = scanner.nextDouble();
        if(cena < 100 || cena > 10000) {
            System.out.println("Cena nie mieści się w podanym zakresis!");
            return;
        }

        System.out.println("Podaj liczbę rat: ");
        liczbaRat = scanner.nextInt();
        if(liczbaRat < 6 || liczbaRat > 48) {
            System.out.println("Liczba rat nie mieści się w podanym zakresis!");
            return;
        }

        double oprocentowaie;
        if (liczbaRat >= 6 && liczbaRat <= 12) {
            oprocentowaie = 2.5;
        } else if (liczbaRat >= 13 && liczbaRat <= 24) {
            oprocentowaie = 5.0;
        } else {
            oprocentowaie = 10.0;
        }

        double odsetki = cena * (oprocentowaie / 100);
        rata = (cena + odsetki) / liczbaRat;
        System.out.println("Twoja miesiączna rata wraz z odsetkami wynosi : " + rata + "zł");
    }

}
