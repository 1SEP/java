package ru.fsep.lessons;

/**
 * Created by aspire on 02.07.2015.
 */
public class MyFileNotFoundException extends RuntimeException{
    public MyFileNotFoundException(String message) {
        super(message);
    }
}
