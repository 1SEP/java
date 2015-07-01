package ru.fsep.lesson;

import ru.fsep.lesson.interfaces.StudentsDAO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentsDaoTxtImpl implements StudentsDAO {

    final String path = "C:\\Users\\user\\Git\\java\\lessons\\StudentsDAOFacade\\src\\main\\resources\\Students.txt";

    public ArrayList<Student> getAll() {

        ArrayList<Student> students = new ArrayList<Student>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(path));
        }catch (FileNotFoundException e){
            e.printStackTrace();
            System.exit(-1);
        }
        String buffer;

        while (scanner.hasNext()){
            buffer = scanner.nextLine();
            String[] dataOfStudent = buffer.split(" ");

            students.add(new Student(dataOfStudent[0], dataOfStudent[1], Integer.parseInt(dataOfStudent[2])));
        }

        return students;
    }
}
