package ru.fsep.lesson.humans;

import com.google.common.base.MoreObjects;
import ru.fsep.lesson.Transeble;
import ru.fsep.lesson.transfer.Transfer;

public class Man extends Human implements Transeble {

    public Man(String name, int age) {
        super(name, age);
    }

    public Human trans(){
        return Transfer.transfer(this);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("His name", this.name)
                .add("His age", this.age)
                .toString();
    }
}
