package org.example;

import java.util.Random;
import java.util.Scanner;

public class ScannerRandom {
    public static void main(String[] args) {
        //10

        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name: ");
        String name = scanner.nextLine();
        System.out.println("What's your lastname: ");
        String lastName = scanner.nextLine();
        System.out.println("Age: ");
        int age = scanner.nextInt();

        if(age >= 18){
            System.out.println("Provided data's: " + name +  ", " + lastName + ", " + age + " (you are an adult)");
        }else{
            System.out.println("Provided data's: " + name +  ", " + lastName + ", " + age + " (you are an child)");
        }

        //11

        Random random = new Random();

        int number1 = random.nextInt(11);
        int number2 = random.nextInt(6) + 1;
        double number3 = random.nextDouble();
        double number4 = random.nextDouble() * 100.0 + 1.0;
        boolean randomFlag = random.nextBoolean();

        System.out.println("First point: " + number1);
        System.out.println("Second point: " + number2);
        System.out.println("Third point: " + number3);
        System.out.println("Fourth point: " + number4);
        System.out.println("Fifth point: " + randomFlag);

        //12

        System.out.println("Enter the number of faces on the cube: ");
        int numberOfFaces = scanner.nextInt();

        if(numberOfFaces <= 0){
            System.out.println("Number of cube faces have to grater than zero");
        }else {
            int rollResult = random.nextInt(numberOfFaces) + 1;
            System.out.println("Roll Result: " + rollResult);
        }

        scanner.close();
    }
}
