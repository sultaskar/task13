package ru.sultanov;

import java.util.Scanner;

public class Mama {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String givenFood = sc.nextLine();
        Child child = new Child();
        try {
            child.eat(givenFood);
        } catch (BadFoodException ex) {
            System.out.println("Ребенку не понравилось");
        }
    }
}
