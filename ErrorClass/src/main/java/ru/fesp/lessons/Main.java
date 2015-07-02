package ru.fesp.lessons;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Ôëþð on 02.07.2015.
 */
public class Main {
    public static void main(String ... args){
        Error error = new Error();
        error.read();
        error.findLetter();

        ArrayList<String> lines = new ArrayList<String>();
        ArrayList<Character> bigLetters= new ArrayList<Character>();

        for (String line : lines = error.getList()) {
            System.out.println(line);
        }
        for (Character c : bigLetters = error.getBigLetters()) {
            System.out.println(c);
        }
    }
}
