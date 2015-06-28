package ru.fsep.lesson;

import ru.fsep.lesson.humans.Man;
import ru.fsep.lesson.humans.Women;
import ru.fsep.lesson.transfer.Transfer;

public class Program {
    public static void main(String[] args) {
        Man man = new Man("Pol", 20);
        Women women = new Women ("Yugin", 17);

        System.out.println(Transfer.transfer(man));
    }
}
