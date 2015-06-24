import com.google.common.base.Splitter;

public class Hello{
    public static void main(String args){
        String s1 = args;

        Iterable<String> iterable = Splitter.on(' ').split(s1);

        for (String a:  iterable)
            System.out.println(a);
    }
}
