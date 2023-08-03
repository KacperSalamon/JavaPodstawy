package org.example;

import java.util.Scanner;

public class Cats {
    public static void main(String[] args) {
        System.out.println("Witaj, podaj ilość kotów - to dowiesz ile kuwet potrzebujesz");

        Scanner scanNumber = new Scanner(System.in);
        int numberOfCats = scanNumber.nextInt();

        int numberOfLitterBox = numberOfCats + 1;

        if(numberOfCats == 0) {
            System.out.println("You don not need litter box");
        }else{
            System.out.println("You need litter box : " + numberOfLitterBox);
        }

    }
}
