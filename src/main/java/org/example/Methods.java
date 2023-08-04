package org.example;

import java.util.Random;

public class Methods {
    public static void main(String[] args) {
        int favNumber = favNumber();
        System.out.println("Moja ulubiona liczba to: " + favNumber);

        int sum = sumThreeNumbers(10, 20, 30);
        System.out.println("Suma trzech liczb: " + sum);

        int randomNumber = randomNumbers();
        System.out.println("Wylosowana liczba: " + randomNumber);

        int years = 5;
        int days = howManyDays(years);
        System.out.println(years + " lat to " + days + " dni.");

        int division = divisionMethod(10, 2);
        System.out.println("Wynik dzielenia: " + division);

        String birthday = birthdayMethod(2000, 07, 17);
        System.out.println("Data urodzenia: " + birthday);

        int[] numbers = {5, 5, 5};
        boolean sameNumbers = sameNumbersMethod(numbers);
        if (sameNumbers) {
            System.out.println("Takie same");
        } else {
            System.out.println("Inne");
        }

        int[] arrayOfNumber = {1, 2, 3, 4, 5};
        int arraySum = arraySumMethod(arrayOfNumber);
        System.out.println("Suma elementów tablicy: " + arraySum);

        boolean number = numberMethod(arrayOfNumber, 3);
        System.out.println("Czy istnieje liczba większa od 3? " + number);
    }

    public static int favNumber() {
        return 17;
    }


    public static int sumThreeNumbers(int a, int b, int c) {
        return a + b + c;
    }


    public static int randomNumbers() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }


    public static int howManyDays(int years) {
        return years * 365;
    }

    public static int divisionMethod(int a, int b) {
        if (b == 0) {
            return -1;
        }
        return a / b;
    }

    public static String birthdayMethod(int year, int month, int days) {
        return String.format("%04d-%02d-%02d", year, month, days);
    }


    public static boolean sameNumbersMethod(int[] numbers) {
        if (numbers.length < 2) {
            return true;
        }

        int firstNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != firstNumber) {
                return false;
            }
        }

        return true;
    }

    public static int arraySumMethod(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }

    public static boolean numberMethod(int[] array, int number) {
        for (int element : array) {
            if (element > number) {
                return true;
            }
        }
        return false;
    }
}
