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
    private String file;
    private Scanner in;
    public StudentsDaoTxtImplementation(String file) {
        this.file = file;
        try{
            in = new Scanner(new File(file));
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    ArrayList<Student> list = new ArrayList<Student>();
    public ArrayList<Student> getAll() {

        String buffer = "";
        while (in.hasNext()) {
            buffer = in.nextLine();
            String[] elements = buffer.split(" ");
            Student student = new Student(elements[0], Integer.parseInt(elements[1]), Integer.parseInt(elements[2]), Integer.parseInt(elements[3]));
            list.add(student);
        }
        in.close();
        return list;
    }
    }

