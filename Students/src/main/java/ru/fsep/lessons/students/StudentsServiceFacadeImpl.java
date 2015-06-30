package ru.fsep.lessons.students;

import java.util.ArrayList;

/**
 * Created by aspire on 30.06.2015.
 */
public class StudentsServiceFacadeImpl implements StudentsServiceFacade {
    private StudentsDao studentsDao;

    public StudentsServiceFacadeImpl(StudentsDao studentsDao) {
        this.studentsDao = studentsDao;
    }

    public ArrayList<Student> getAll() {
        ArrayList<Student> result = studentsDao.getAll();
        return result;
    }
}
