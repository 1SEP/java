package ru.fsep.lessons;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Created by Надежда on 30.06.2015.
 */
public interface StudentsServiceFacade {
    public ArrayList<Students> getAll() throws NotImplementedException, FileNotFoundException;
}
