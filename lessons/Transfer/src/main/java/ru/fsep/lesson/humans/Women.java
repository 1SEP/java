package ru.fsep.lesson.humans;

import com.google.common.base.MoreObjects;

import ru.fsep.lesson.Transeble;
import ru.fsep.lesson.transfer.Transfer;

public class Women extends Human {

    public Women(String name, int age) {
        super(name, age);
    }

    @Override
    public Human trans(){
        return Transfer.transfer(this);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("Shi name", this.name)
                .add("Shi age", this.age)
                .toString();
    }
}
