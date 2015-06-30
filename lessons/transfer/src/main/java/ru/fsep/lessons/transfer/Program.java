package ru.fsep.lessons.transfer;

import ru.fsep.lessons.transfer.patients.Man;
import ru.fsep.lessons.transfer.patients.Woman;
import ru.fsep.lessons.transfer.clinic.Transfer;

public class Program {

    public static void main(String[] args) {
        Transfer transfer = new Transfer();
        Man alex = new Man(30, "Alex");
        Woman helen = new Woman(67, "Helen");
        System.out.println(transfer.trans(helen));
        System.out.println(transfer.trans(alex));
    }
}
