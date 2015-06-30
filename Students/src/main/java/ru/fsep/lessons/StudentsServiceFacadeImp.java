package ru.fsep.lessons;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Created by Надежда on 30.06.2015.
 */
public class StudentsServiceFacadeImp implements StudentsServiceFacade{
private StudentsDao dao;

    public StudentsServiceFacadeImp(StudentsDao daoIn){
        this.dao = daoIn;
    }


    @Override
    public ArrayList<Students> getAll() throws NotImplementedException, FileNotFoundException {
        return dao.getAll();
    }
}
