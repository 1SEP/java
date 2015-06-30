package ru.fsep.lessons.transfer.clinic;

import ru.fsep.lessons.transfer.patients.Man;
import ru.fsep.lessons.transfer.patients.Woman;

public class Transfer {

    public static Man trans(Woman w) {
       return new Man(w.getAge(), w.getName());
    }

    public static Woman trans(Man m) {
        return new Woman(m.getAge(), m.getName());
    }

    public static void transAll(Transable[] massOfHumans){
        for (int i = 0; i < massOfHumans.length; i++){
            massOfHumans[i] = massOfHumans[i].trans();
        }
    }
}
