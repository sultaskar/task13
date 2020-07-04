package ru.sultanov;

public enum Food {
    CARROT("Морковь"),
    APPLE("Яблоко"),
    PORRIDGE("Каша"),
    BANANA("Банан");

    public String foodName;

    Food(String foodName){
        this.foodName = foodName;

    }
}
