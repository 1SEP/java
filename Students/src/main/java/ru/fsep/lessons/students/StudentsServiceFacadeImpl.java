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

    public int getAveragedPoint(){
        int totalPoints = 0;
        int countOfStudents = 0;
        for(Student student : getAll()){
            totalPoints += student.getPoint();
            ++countOfStudents;
        }

        return totalPoints / countOfStudents;
    }
}
