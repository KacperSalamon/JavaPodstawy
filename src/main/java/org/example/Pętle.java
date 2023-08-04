package org.example;

import java.util.Random;
import java.util.Scanner;

public class Pętle {
    public static void main(String[] args) {
        //17
        System.out.println("Zaczynamy losowanie");

        Random random = new Random();
        int randomNumber;

        while(true){
            randomNumber = random.nextInt(10) + 1;
            System.out.println(randomNumber);

            if(randomNumber == 10){
                System.out.println("Trafiłeś 10 - gra przerwana");
                break;
            }
        }

        //18
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadzaj uzyskane punkty cząstkowe. Aby zakończyć wpisz 0. Policzę dla Ciebie ich sumę :): ");

        int sum = 0;
        int inputNumber;

        while (true) {
            System.out.println("Wprowadź liczbę punktów");
            inputNumber = scanner.nextInt();

            if(inputNumber == 0){
                break;
            }

            sum += inputNumber;
        }

        System.out.println("Uzyskane punkty : " + sum);

        //19

        System.out.println("Liczny rosnąco od 1 do 10");
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        for(int i = 99; i >= 66; i--){
            System.out.println(i);
        }

        for(int i=20; i < 40; i += 2) {
            System.out.println(i);
        }

        for (int i = 0; i < 5; i++){
            System.out.println("Kacper");
        }

        //27

        int[] numbers = new int[1000000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }

        int count25 = 0;
        for (int number : numbers) {
            if (number == 25) {
                count25++;
            }
        }

        System.out.println("Liczba 25 wystąpiła: " + count25 + " razy");

        //28

        int[] tenNumbers = {-54, -90, -20, 0, 10, -15, 78, 9, 5, 18};

        double suma = 0;
        for (int tenNumber : tenNumbers) {
            suma += tenNumber;
        }

        double srednia = suma / tenNumbers.length;
        System.out.println(srednia);

        int max = tenNumbers[0];
        for (int tenNumber : tenNumbers) {
            if(tenNumber > max){
                max = tenNumber;
            }
            
        }
        System.out.println("Max: " + max);

        int min = tenNumbers[0];
        for (int tenNumber : tenNumbers) {
            if(tenNumber < min){
                min = tenNumber;
            }

        }

        System.out.println("Min: " + min);
    }
}
