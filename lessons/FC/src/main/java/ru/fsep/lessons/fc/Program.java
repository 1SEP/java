package ru.fsep.lessons.fc;

public class Program {
    public static void main(String[] args)
    {
        Reverser reverser = new Reverser();
        String res = reverser.reverser("qwe");
        System.out.println(res);
    }
}
