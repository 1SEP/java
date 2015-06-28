package ru.fsep.lesson.humans;

import com.google.common.base.MoreObjects;

/**
 * Created by user on 26.06.2015.
 */
public class Women extends Human {

    public Women(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("Shi name", this.name)
                .add("Shi age", this.age)
                .toString();
    }
}
