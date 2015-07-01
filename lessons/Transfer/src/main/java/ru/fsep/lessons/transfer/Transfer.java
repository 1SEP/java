package ru.fsep.lessons.transfer;

import java.util.ArrayList;

/**
 * Created by aspire on 26.06.2015.
 */
public class Transfer {

    public static Man trans(Woman woman){
        return new Man(woman.getAge(), woman.getName());
    }
    public static Woman trans(Man man){
        return new Woman(man.getAge(), man.getName());
    }

    public void transAll(Transable [] transables){
        for (int i = 0; i < transables.length; i++) {
            transables[i] = transables[i].trans();
        }
    }
}
