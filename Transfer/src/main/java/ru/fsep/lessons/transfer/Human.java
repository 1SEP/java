package ru.fsep.lessons.transfer;

import com.google.common.base.MoreObjects;

/**
 * Created by Надежда on 26.06.2015.
 */
public class Human {
    public static final int MIN_AGE = 0;
    int age;
    String name;

    public Human(int age,String name) {
        if (age >= MIN_AGE)
          this.age = age;
        else  System.out.println("Incorrect age");
        this.name = name;
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
                .add("Hello!My name is :", name)
                .add(" My age is :", age)
                .toString();
    }
}
