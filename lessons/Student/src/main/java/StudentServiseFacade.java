import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Created by ramil on 01.07.2015.
 */
public class StudentServiseFacade implements StudentsServiseFasadeImplementation {

   protected StudentsDao studentDao;

    public StudentServiseFacade(StudentsDao studentDao) {
        this.studentDao = studentDao;
    }

    public ArrayList<Student> getAll() throws FileNotFoundException {
        ArrayList<Student> result = studentDao.getAll();
        return result;
    }
}