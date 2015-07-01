import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Created by ramil on 01.07.2015.
 */
public interface StudentsDao {
    ArrayList<Student> getAll() throws FileNotFoundException;


}
