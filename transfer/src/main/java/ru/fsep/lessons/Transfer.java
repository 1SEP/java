package ru.fsep.lessons;

public class Transfer {
    public static Man trans(Woman w) {
        return new Man(w.getAge(), w.getName());
    }

    public Woman trans(Man m) {
        return new Woman(m.getAge(), m.getName());
    }
}
