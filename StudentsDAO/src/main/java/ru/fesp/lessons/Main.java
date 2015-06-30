package ru.fesp.lessons;

import java.util.ArrayList;

/**
 * Created by Ôëþð on 30.06.2015.
 */
public class Main {
    public static void main(String ... args){
        StudentServiceFacade studentServiceFacade = new StudentServiceFacadeImpl(new StudentsDAOTxtImpl());
        ArrayList<Student> list = studentServiceFacade.getAll();
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
