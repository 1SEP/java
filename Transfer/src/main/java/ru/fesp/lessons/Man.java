package ru.fesp.lessons;

import com.google.common.base.MoreObjects;

/**
 * Created by Ôëþð on 26.06.2015.
 */
public class Man extends Human {

    private int age;
    private String name;
    public Man(int age, String name) {
        super(age, name);
    }

    public String toString(int age, String name) {
        return MoreObjects.toStringHelper(this)
                .add("i'm man, my name is ", name)
                .add("i'm ", age + " years old")
                .toString();
    }
}
