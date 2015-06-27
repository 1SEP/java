package ru.fsep.lessons.transfer;

import com.google.common.base.MoreObjects;

public class Woman extends Human{

    public Woman(int age, String name){
        super(age, name);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("I am woman and my age is", getAge())
                .add("My name is", getName())
                .toString();
    }
}
