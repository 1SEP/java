package ru.fsep.lessons.transfer;

import com.google.common.base.MoreObjects;

public class Man extends Human{

    public Man(int age, String name){
        super(age, name);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("I am Man and my age is", getAge())
                .add("My name is", getName())
                .toString();
    }
}

