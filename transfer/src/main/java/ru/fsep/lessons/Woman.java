package ru.fsep.lessons;

import com.google.common.base.MoreObjects;

public class Woman extends Human{

    private int age;
    private String name;

    public Woman(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("My age is", age)
                .add("My name is", name)
                .toString();
    }
}
