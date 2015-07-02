package ru.fesp.lessons;

import com.google.common.base.MoreObjects;
import ru.fesp.exceptions.NotUpperLetter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Ôëþð on 02.07.2015.
 */
public class Error {
    ArrayList<String> list;
    ArrayList<Character> bigLetters;

    public void read(){
        list = new ArrayList<String>();
        Scanner sc = null;
        try {
            sc = new Scanner(new File("C:\\Users\\Flyur\\java\\ErrorClass\\src\\Letters.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while(sc.hasNext()){
            list.add(sc.nextLine());
        }
        sc.close();
    }
    public void findLetter(){
        bigLetters = new ArrayList<Character>();
        for (String s : list) {
            for(int i=0; i < s.length(); i++){
                if (Character.isUpperCase(s.charAt(i))) bigLetters.add(s.charAt(i));
            }
        }

         try {
             if (bigLetters.isEmpty()) throw new NotUpperLetter("didn't find upper letter");
        } catch (NotUpperLetter notUpperLetter) {
            notUpperLetter.printStackTrace();
        }

    }

    public ArrayList<String> getList() {
        return list;
    }

    public ArrayList<Character> getBigLetters() {
        return bigLetters;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("list", list)
                .add("bigLetters", bigLetters)
                .toString();
    }
}
