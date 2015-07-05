package ru.fsep.lessons.errors;

public class Main {
    public static void main(String[] args) {
        Errors errors = new Errors("C:\\Users\\pc1\\IdeaProjects\\Maven\\Errors\\src\\main\\resources\\text.txt");
        errors.readFile();
        errors.checkLetters();

        errors.closeFile();
    }
}
