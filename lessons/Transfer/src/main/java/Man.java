import com.google.common.base.MoreObjects;

/**
 * Created by ramil on 27.06.2015.
 */


public class Man extends Human {

    public static final int min_age = 0;

    public Man(int age, String name) {
        super(age, name);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("Man name is", name)
                .add("Man age is", age)
                .toString();
    }

    public int getAge() {
        if (age > min_age) {
            return age;
        }
        else
            throw new IllegalArgumentException("error");
    }
}