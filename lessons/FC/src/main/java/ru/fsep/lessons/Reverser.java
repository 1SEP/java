package ru.fsep.lessons;

public class Reverser {
    public String reverse(String s){
        StringBuffer buffer = new StringBuffer(s);
        buffer.reverse();
        return new String(buffer);
    }
}
