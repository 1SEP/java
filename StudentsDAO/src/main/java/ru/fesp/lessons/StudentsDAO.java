package ru.fesp.lessons;

import java.util.ArrayList;

/**
 * Created by дыў№ on 30.06.2015.
 */
public interface StudentsDAO {
    ArrayList<Student> getAll();

    /**
     * get sqrt from a
     * @param a - input number
     * @return sqrt of a
     * @throws IllegalArgumentException if a is negative
     */
}
