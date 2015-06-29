package ru.fsep.lesson.transfer;

import ru.fsep.lesson.Transable;
import ru.fsep.lesson.humans.Man;
import ru.fsep.lesson.humans.Women;

public class Transfer {

    public static Women transfer(Man man){
        Women women = new Women(man.getName(), man.getAge());
        return women;
    }

    public static Man transfer(Women women){
        Man man = new Man(women.getName(), women.getAge());
        return man;
    }

    public static void transferAll(Transable[] arrIn){
        for (int i = 0; i < arrIn.length; i++){
            arrIn[i] = arrIn[i].trans();
        }
    }
}

