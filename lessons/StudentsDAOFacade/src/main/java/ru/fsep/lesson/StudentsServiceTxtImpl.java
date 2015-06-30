package ru.fsep.lesson;

import ru.fsep.lesson.interfaces.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class StudentsServiceTxtImpl implements StudentsServiceFacade {

    private StudentsDAO studentsDAO;

    public StudentsServiceTxtImpl(StudentsDAO studentsDAO){
        this.studentsDAO = studentsDAO;
    }

    public ArrayList<Student> getAll() throws FileNotFoundException {
        return studentsDAO.getAll();
    }
}
