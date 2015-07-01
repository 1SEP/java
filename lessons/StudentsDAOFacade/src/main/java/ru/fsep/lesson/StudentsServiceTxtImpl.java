package ru.fsep.lesson;

import ru.fsep.lesson.interfaces.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class StudentsServiceTxtImpl implements StudentsServiceFacade {

    private StudentsDAO studentsDAO;

    public StudentsServiceTxtImpl(StudentsDAO studentsDAO){
        this.studentsDAO = studentsDAO;
    }

    public ArrayList<Student> getAll () {
        return studentsDAO.getAll();
    }

//    public int midleMarkCaunter ArrayList<Student> arrStudents){
//        int allMark = 0;
//        for (int i = 0; i < arrStudents.size(); i++){
//            allMark = allMark + arrStudents.get(i).getMark();
//        }
//        return allMark / arrStudents.size();
//    }
}
