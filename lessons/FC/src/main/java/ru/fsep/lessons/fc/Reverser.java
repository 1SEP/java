package ru.fsep.lessons.fc;

/**
 * Created by ramil on 25.06.2015.
 */
public class Reverser {
    String reverser(String s)
    {
        String b = new StringBuffer(s).reverse().toString();
    return b;
    }
}
