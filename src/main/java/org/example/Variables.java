package org.example;

import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        //6

        int first = 20;
        int second = 5;
        int third = 12;
        int sum = first + second + third;
        System.out.println("Provided numbers: " + first + ", " + second + ", " + third + " and their sum is: " + sum);

        //7

        int minutes = 360;
        int hours = minutes / 60;
        int seconds = minutes * 60;

        System.out.println("Provided minutes: " + minutes + " it is: " + hours + " hours and: " + seconds + " seconds");

        //8

        int zloty = 30;
        double dollarExchnage = zloty * 4.09;
        double euroExchange = zloty * 4.46;

        System.out.println("Provided zloty: " + zloty + " it is: " +  dollarExchnage + " dollars and: " + euroExchange + " euro");

        //9

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wagę (w kilogramach): ");
        double waga = scanner.nextDouble();

        System.out.print("Podaj wzrost (w metrach): ");
        double wzrost = scanner.nextDouble();

        double bmi = waga / (wzrost * wzrost);
        System.out.println("Twoje BMI wynosi: " + bmi);

        if (bmi > 24.9) {
            System.out.println("Masz nadwagę.");
        } else if (bmi < 18.5) {
            System.out.println("Masz niedowagę.");
        } else {
            System.out.println("Twoja waga jest w normie.");
        }

        scanner.close();
    }

}
