package ru.fsep.lesson;

import ru.fsep.lesson.humans.Human;
import ru.fsep.lesson.humans.Man;
import ru.fsep.lesson.humans.Women;
import ru.fsep.lesson.transfer.Transfer;

public class Program {
    public static void main(String[] args) {
        Man man = new Man("Pol", 20);
        Women women = new Women ("Yugin", 21);

        Human[] a = new Human[2];
        a[0] = man;
        a[1] = women;

        Transfer.transferAll(a);

        System.out.println(a[0].toString());
    }
}
