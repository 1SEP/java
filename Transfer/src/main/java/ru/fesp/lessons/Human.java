package ru.fesp.lessons;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by Флюр on 26.06.2015.
 */
public class Human implements Transable{
    private int age;
    private String name;
    public final static int MIN_AGE = 0;

    public Human(int age, String name) {
       if (age > MIN_AGE){ this.age = age;
        this.name = name;}
        else throw new IllegalArgumentException("Невозможный возраст");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equal(age, human.age) &&
                Objects.equal(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(age, name);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("age", age)
                .add("name", name)
                .toString();
    }

    public Human trans() {
        throw new NotImplementedException();
    }
}
