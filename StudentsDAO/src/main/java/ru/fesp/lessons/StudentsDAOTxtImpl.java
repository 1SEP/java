package ru.fesp.lessons;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Ôëþð on 30.06.2015.
 */
public class StudentsDAOTxtImpl implements StudentsDAO {

    public ArrayList<Student> getAll() {
        Scanner sc = null;
        ArrayList<Student> list;
        String line;
        String data[];
        int point;
        try {
            sc = new Scanner(new File("C:\\Users\\Flyur\\java\\StudentsDAO\\src\\Students.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        list = new ArrayList<Student>();
        while (sc.hasNext()){
            line = sc.nextLine();
            data = line.split(" ");

            point = Integer.parseInt(data[2]);
            list.add(new Student(data[0], data[1], point));
        }
        return list;
    }
}
