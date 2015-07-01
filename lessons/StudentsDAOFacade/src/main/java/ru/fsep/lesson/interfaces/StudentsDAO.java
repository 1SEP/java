package ru.fsep.lesson.interfaces;

import ru.fsep.lesson.Student;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public interface StudentsDAO {
    ArrayList<Student> getAll();
}

