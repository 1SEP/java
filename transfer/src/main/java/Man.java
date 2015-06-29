import com.google.common.base.MoreObjects;

/**
 * Created by Rauf on 29.06.2015.
 */
public class Man extends Human{

    public Man(int age, String name) {
        super(age, name);
    }

    @Override
    public String toString() {

        return MoreObjects.toStringHelper(this)
                .add("I am a man. My name is",getName())
                .add("My age is", getAge())
                .toString();
    }
}