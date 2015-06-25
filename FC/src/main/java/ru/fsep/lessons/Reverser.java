package ru.fsep.lessons;

/**
 * Created by aspire on 25.06.2015.
 */
public class Reverser {
    public String reverse(String s){
        StringBuffer result = new StringBuffer(s).reverse();
        return result.toString();
    }
}
