package ru.fsep.lessons.transfer;

/**
 * Created by aspire on 29.06.2015.
 */
public class Program {
    public static void main(String[] args) {
        Transfer transfer = new Transfer();
        Transable[] transables = new Transable[2];

        for (int i = 0; i < transables.length; i++) {
            transables[i] = new Man(i, "Bob");
        }

        transfer.transAll(transables);

        for (Transable transable : transables) {
            System.out.println(transable);
        }
    }
}
