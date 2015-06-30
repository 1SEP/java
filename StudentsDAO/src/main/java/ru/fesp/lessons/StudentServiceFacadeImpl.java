package ru.fesp.lessons;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;

/**
 * Created by Ôëþð on 30.06.2015.
 */
public class StudentServiceFacadeImpl implements StudentServiceFacade {
    StudentsDAO studentsDAO;

    public StudentServiceFacadeImpl(StudentsDAO studentsDAO) {
        this.studentsDAO = studentsDAO;
    }

    public ArrayList<Student> getAll() {
        return studentsDAO.getAll();
    }

}
