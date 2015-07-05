package ru.fsep.lessons.errors;

import ru.fsep.lessons.errors.Exceptions.FileIsEmptyException;
import ru.fsep.lessons.errors.Exceptions.NoUpperLettersException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Errors {

    public static final String DEFAULT_EMPTY_VALUE = " ";
    private String pathToFile;
    private String buffer;
    private Scanner scanner;

    public Errors(String pathToFile) {
        this.pathToFile = pathToFile;
        buffer = DEFAULT_EMPTY_VALUE;
    }

    public void readFile(){
        try{
            scanner = new Scanner(new File(pathToFile));
            if(scanner.hasNext()) {
                buffer = scanner.nextLine();
            } else {
                throw new FileIsEmptyException("ERROR: There is no data in file!");
            }
        }
        catch (FileNotFoundException fNF){
            fNF.printStackTrace();
        }
        catch (FileIsEmptyException fIE){
            fIE.printStackTrace();
        }
        catch (Exception fE){
            fE.printStackTrace();
        }
    }

    private boolean isUpperLetter(char someChar){
        return Character.isUpperCase(someChar);
    }

    public void checkLetters() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < buffer.length(); i++) {
            char tmp = buffer.charAt(i);
            if (isUpperLetter(tmp)) {
                stringBuffer.append(tmp);
            }
        }
        String result = stringBuffer.toString();
        try{
            if(result.isEmpty()){
                throw new NoUpperLettersException("ERROR: There is no uppercase letters");
            }
        }catch (NoUpperLettersException nUL){
            nUL.printStackTrace();
        }
        System.out.println(result);
    }
    public void closeFile(){
        scanner.close();
    }
}
