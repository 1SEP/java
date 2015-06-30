package ru.fsep.lessons;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;

/**
 * Created by Надежда on 30.06.2015.
 */
public class StudentDaoTxtImp  implements StudentsDao{


    @Override
    public ArrayList<Students>  getAll() throws FileNotFoundException{
        ArrayList<Students> listStudents = new ArrayList<Students>();
        String[] arrayStudents ;
        String buffer;
        Scanner scanner = new Scanner(new File("C:\\Users\\Надежда\\IdeaProjects\\Students.txt"));
        while (scanner.hasNext()){
            buffer = scanner.nextLine();
            arrayStudents = buffer.split(" ");
            listStudents.add( new Students(arrayStudents[0], arrayStudents[1], Integer.parseInt(arrayStudents[3])));
          }
        return listStudents;
    }
}
