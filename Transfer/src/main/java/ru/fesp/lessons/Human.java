package ru.fesp.lessons;

import com.google.common.base.MoreObjects;

/**
 * Created by Флюр on 26.06.2015.
 */
public class Human {
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
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("age", age)
                .add("name", name)
                .toString();
    }
}
