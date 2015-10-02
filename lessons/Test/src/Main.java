import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("fwe");
        list.add("fwe");
        list.add("fwe");
        list.add("fwe");
        list.add("fwe");

        list.forEach(System.out::println);
    }
}
