package ru.fsep.lessons;

public class Program {
    public static void main(String[] args) {
        Woman helen = new Woman(67, "Helen");
        Man alex = new Man(30, "Alex");
        Transfer transfer = new Transfer();
        System.out.println(transfer.trans(helen));
        System.out.println(transfer.trans(alex));
    }
}
