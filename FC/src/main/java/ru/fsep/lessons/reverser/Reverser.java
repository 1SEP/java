package ru.fsep.lessons.reverser;
/**
 * Created by Надежда on 24.06.2015.
 */
public class Reverser {

    public String reverse(String s){
        int len = s.length();
        char[] charArray =new char[len];

        /*
        for (int i=0; i < len; i++){
            tempCharArray[i] = s.charAt(i);
        }
        */
        charArray = s.toCharArray();

        for(int i = 0; i < len/2; i++){
            char temp = charArray[i];
            charArray[i] = charArray[len - 1 - i];
            charArray[len - 1 - i] = temp;
        }

        s=String.copyValueOf(charArray);
        return s;
    }
}
