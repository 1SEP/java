import com.google.common.base.*;

public class Human {
    private int age;
    private String name;

    public Human(int age, String name) throws Exception {
        if(age >= 0) {
            this.age = age;
        }
        else throw new Exception("Incorrect age");
        if(name.length() >= 3) {
            this.name = name;
        }
        else throw new Exception("Incorrect name");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("Human's age: ", age)
                .add("Human's name: ", name)
                .toString();
    }
}
