package ru.fsep.lessons.transfer;

import com.google.common.base.MoreObjects;

/**
 * Created by aspire on 26.06.2015.
 */
public class Woman extends Human {
    public Woman(int age, String name) {
        super(age, name);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("I am old woman. Age ", getAge())
                .add("My name is ", getName())
                .toString();
    }

    @Override
    public Man trans() {
        return Transfer.trans(this);
    }
}
