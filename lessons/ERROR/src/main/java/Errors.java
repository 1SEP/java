import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by ramil on 03.07.2015.
 */
public class Errors {
    private Scanner in;
    String message = "";
    int information;

    public Errors(String file) {
        try {
            in = new Scanner(new File(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void Read_for_buffer() {
        message = in.nextLine();
    }
    public int Search_text(String message) {
        for(char ch : message.toCharArray()) {
            if(Character.isUpperCase(ch)) {
                return 1;
            }
        }
        return 0;
    }

    /**
     * @throws MyException( )
     * @return
     */
    public MyException Search() {
        String buffer;
        Read_for_buffer();
        information = Search_text(message);
        System.out.println(information);

        try {
            if(information == 0) {
                throw new MyException("ne naydeno");
            }
        } catch (MyException me1) {
            me1.printStackTrace();
        }


        Close();
        return null;
    }
    public void Close() {
        in.close();
    }
}


