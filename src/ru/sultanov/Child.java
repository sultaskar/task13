package ru.sultanov;

public class Child {

    public String eat(String takenFood) throws BadFoodException {
        if ((takenFood.equals(Food.PORRIDGE.foodName)) || (takenFood.equals(Food.CARROT.foodName))) {
            System.err.println("Спасибо, мама!");
            throw new BadFoodException("Невкусная еда");
        } else {
            System.out.println("Съел...за обе щеки!");
        }
        return ("Спасибо ,мама!");
    }
}
