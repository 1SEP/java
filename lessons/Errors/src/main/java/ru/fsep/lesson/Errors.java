package ru.fsep.lesson;

import ru.fsep.lesson.epception.FileIsEmptyException;
import ru.fsep.lesson.epception.NotUpperLetterException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Errors {

    /**
     *
     * @param pathToFile - путь до файла
     * @return
     * @exception FileNotFoundException, FileIsEmptyException
     */
    public String readString(String pathToFile){
        String string = null;
        try {
            Scanner sc = new Scanner(new File(pathToFile));
            if (sc.hasNext()) {
                string = sc.nextLine();
            } else {
                throw new FileIsEmptyException("File is empty");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (FileIsEmptyException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }

        return string;
    }

    public boolean upperLetter(String string) {
        boolean found = false;
        for (int i = 0; i < string.length() && !found; i++) {
            found = Character.isUpperCase(string.charAt(i));
        }
        try {
            if (!found){
                throw new NotUpperLetterException("Upper Letter is not found");
            }
        }catch (NotUpperLetterException e){
            e.printStackTrace();
        }
        return found;
    }
}
