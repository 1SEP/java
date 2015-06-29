package ru.fsep.lessons.transfer;

/**
 * Created by aspire on 26.06.2015.
 */

import com.google.common.base.MoreObjects;

public class Man extends Human implements Transable {
    public Man(int age, String name) {
        super(age, name);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("I am young man. Age ", getAge())
                .add("My name is ", getName())
                .toString();
    }

    public Woman trans() {
        return Transfer.trans(this);
    }
}
