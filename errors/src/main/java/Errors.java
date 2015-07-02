import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Rauf on 02.07.2015.
 */
public class Errors {

    private String filename;
    private FileReader fileReader;
    private String text;

    public Errors(String filename) {
        this.filename = filename;
        this.text="";
    }

    /**
     *
     *
     * @return
     */
    public String read(){
        try {
            fileReader = new FileReader(filename);
            int c;
            while ((c=fileReader.read())!=-1){
                text += (char) c;
            }
            fileReader.close();
        }
        catch (FileNotFoundException e1){
            System.out.println("File not found");
            throw new MyFileNotFoundException();
        }
        catch (IOException e2){
            System.out.println("Input/Output error");
        }
        catch (Exception e3){
            System.out.println("I don't know why");
        }
        return text;
    }

    /**
     *
     * @return
     */
    public boolean isUpper() {
      char[] chars = text.toCharArray();
        for(char c:chars){
            if(Character.isUpperCase(c)){
                return true;
            }
        }
        throw new NotUppercaseException();
    }

}


