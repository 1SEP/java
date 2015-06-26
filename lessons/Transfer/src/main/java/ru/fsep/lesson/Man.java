package ru.fsep.lesson;

import com.google.common.base.MoreObjects;

public class Man extends Human {

    public Man(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("His name", this.name)
                .add("His age", this.age)
                .toString();
    }
}
