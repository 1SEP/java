import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.*;

/**
 * Created by ramil on 01.07.2015.
 */
public class StudentsDaoTxtImplementation implements StudentsDao {
    ArrayList<Student> list = new ArrayList<Student>();
    public ArrayList<Student> getAll() throws FileNotFoundException {

        String buffer = "";
        Scanner in = new Scanner(new File("/students.txt"));
        while (in.hasNext()) {
            String[] elements = buffer.split(" ");
            list.add(new Student(elements[0], Integer.parseInt(elements[1]), Integer.parseInt(elements[2]), Integer.parseInt(elements[3])));
        }
        in.close();
        return list;
    }
    }

