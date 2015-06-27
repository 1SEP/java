package ru.fsep.lessons.transfer;

public class Transfer {
    public Man trans(Woman w) {
       return new Man(w.getAge(), w.getName());
    }

    public Woman trans(Man m) {
        return new Woman(m.getAge(), m.getName());
    }
}
