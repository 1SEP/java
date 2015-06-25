import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by Флюр on 21.06.2015.
 */
public class Main {
    public static void main(String ... args) {
        AbstractApplicationContext context = new FileSystemXmlApplicationContext("src/main/config.xml");

    }
}
