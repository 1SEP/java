package ru.fsep.lesson.epception;

public class FileIsEmptyException extends RuntimeException {

    public FileIsEmptyException(String message){
        super(message);
    }
}
