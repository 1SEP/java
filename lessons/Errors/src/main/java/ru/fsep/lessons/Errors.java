package ru.fsep.lessons;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Errors {

    private String fileName;
    private Scanner scanner;
    private String message;

    public Errors(String fileName) {
        this.fileName = fileName;
        this.message = "";
    }

    /**
     * @throws MyFileNotFoundException if file is not found
     */

    public void readLetterFromFile(){
        try {
            scanner = new Scanner(new File(fileName));
            message = scanner.nextLine();
        } catch (FileNotFoundException e) {
            throw new MyFileNotFoundException("File letters.txt is not found!");
        }
    }

    /**
     * @throws NotUpperLetterException if a file is not contain the upper case letters
     */
    public void findUpperLetter() {
        StringBuffer stringBuffer = new StringBuffer();

        for(int i = 0; i < message.length(); i++){
            char tmp = message.charAt(i);
            if(Character.isUpperCase(tmp)){
                stringBuffer.append(tmp);
            }
        }
        String result = stringBuffer.toString();

        if(result.isEmpty()){
            throw new NotUpperLetterException("Here are not upper letters!");
        }

        System.out.println(result);
    }

    public void closeInputFile(){
        scanner.close();
    }
}
