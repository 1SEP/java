package ru.fsep.lessons;

import java.util.ArrayList;

/**
 * Created by Надежда on 30.06.2015.
 */
public class Program {
//    StudentDaoTxtImp ar = new StudentDaoTxtImp();
//    StudentsServiceFacadeImp student= new StudentsServiceFacadeImp(ar);
//
    public static void main(String ... args) {
        StudentsServiceFacade studentsServiceFacade = new StudentsServiceFacadeImp(new StudentDaoTxtImp());
        ArrayList<Students> st = new ArrayList<Students>();
       st =  studentsServiceFacade.getAll();
        for (Students s : st) {
            System.out.println(s);
        }
    }
}
