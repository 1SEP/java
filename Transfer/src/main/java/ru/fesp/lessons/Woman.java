package ru.fesp.lessons;

import com.google.common.base.MoreObjects;

/**
 * Created by Ôëþð on 26.06.2015.
 */
public class Woman extends Human{

    public Woman(int age, String name) {
        super(age, name);
    }

    public String toString(int age, String name) {
        return MoreObjects.toStringHelper(this)
                .add("i'm woman, my name is ", name)
                .add("i'm ", age + " years old")
                .toString();
    }


}
