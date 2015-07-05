package ru.fsep.lessons.errors.Exceptions;

public class NoUpperLettersException extends RuntimeException{
    public NoUpperLettersException(String message){
        super(message);
    }
}
