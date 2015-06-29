import com.google.common.base.Objects;

/**
 * Created by Rauf on 29.06.2015.
 */
public class Human {
    private final int MIN_AGE = 0;
    private int age;
    private String name;

    public Human(int age, String name) {
        if(age >= MIN_AGE){
            this.age = age;
        }else
        throw new IllegalArgumentException("Invalid argument value");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(age, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Human other = (Human) obj;
        return Objects.equal(this.age, other.age)
                && Objects.equal(this.name, other.name);
    }


}
