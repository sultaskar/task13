package ru.sultanov;

public class BadFoodException extends Exception{

    public BadFoodException(){
        super();
    }

    public BadFoodException(String description){
        super(description);
    }

}
