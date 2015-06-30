import com.google.common.base.MoreObjects;

/**
 * Created by ramil on 27.06.2015.
 */
public class Woman extends Human {

    public static final int min_age = 0;

    public Woman(int age, String name) {
        super(age, name);
    }

    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("Woman name is", name)
                .add("Woman age is", age)
                .toString();
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    @Override
    public Man trans() {
        return new Man(this.age, this.name);
    }
}
