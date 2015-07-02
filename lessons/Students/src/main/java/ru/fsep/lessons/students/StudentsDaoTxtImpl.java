package ru.fsep.lessons.students;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by aspire on 30.06.2015.
 */
public class StudentsDaoTxtImpl implements StudentsDao {
    private String fileName;
    private Scanner scanner;

    public StudentsDaoTxtImpl(String fileName) {
        this.fileName = fileName;
        try{
            scanner = new Scanner(new File(fileName));
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public ArrayList<Student> getAll() {
        ArrayList<Student> result = new ArrayList<Student>();
        while(scanner.hasNext()){
            String data = scanner.nextLine();
            String[] arraySplitData;
            arraySplitData = data.split(" ");

            String surname = arraySplitData[0];
            String name = arraySplitData[1];
            String pointString = arraySplitData[2];
            int pointInt = Integer.parseInt(pointString);

            Student student = new Student(surname, name, pointInt);
            result.add(student);
        }

        scanner.close();

        return result;
    }
}
