package ru.fsep.lessons;

/**
 * Created by aspire on 02.07.2015.
 */
public class Main {
    public static void main(String[] args) {
        Errors errors = new Errors("letters.txt");
        errors.readLetterFromFile();
        errors.findUpperLetter();
        errors.closeInputFile();
    }
}
