package ru.fsep.lesson;

public class Program {
    public static void main(String[] args) {
        Errors err = new Errors();
        System.out.println(err.upperLetter(err.readString("C:\\users\\user\\Git\\java\\lessons\\Errors\\src\\main\\resources\\string.txt")));
    }
}
