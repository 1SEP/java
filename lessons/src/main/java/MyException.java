import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by aspire on 01.07.2015.
 */
public class MyException extends Exception {
    String message;

    public MyException(String message) {
        super(message);
    }

    public static void main(String[] args) throws MyException {
    }
}
