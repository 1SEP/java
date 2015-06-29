package ru.fsep.lessons.transfer;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Надежда on 26.06.2015.
 */
public class Transfer {

    @Override
    public String toString() {
        return super.toString();
    }

    public Man trans(Woman girl) {
        return new Man(girl.getAge(), girl.getName());
    }

    public Woman trans(Man boy) {
        return new Woman(boy.getAge(), boy.getName());
    }

    public Transable[] TranseAll(Transable transeble[]) {
        for (int i = 0; i < transeble.length; i++)
            transeble[i] =(Transable) transeble[i].trans();
        return transeble;
    }
}
