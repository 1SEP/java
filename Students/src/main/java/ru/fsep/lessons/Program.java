package ru.fsep.lessons;

/**
 * Created by ������� on 30.06.2015.
 */
public class Program {
    StudentDaoTxtImp ar = new StudentDaoTxtImp();
    StudentsServiceFacadeImp student= new StudentsServiceFacadeImp(ar);
}
