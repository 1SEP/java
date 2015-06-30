package ru.fsep.lessons.transfer.patients;

import com.google.common.base.MoreObjects;
import ru.fsep.lessons.transfer.clinic.Transable;
import ru.fsep.lessons.transfer.clinic.Transfer;

public class Man extends Human implements Transable {

    public Man(int age, String name){
        super(age, name);
    }

    @Override
    public Human trans() {
        return Transfer.trans(this);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("I am Man and my age is", getAge())
                .add("My name is", getName())
                .toString();
    }
}

