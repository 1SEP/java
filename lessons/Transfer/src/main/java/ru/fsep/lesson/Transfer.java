package ru.fsep.lesson;

public class Transfer {

    public static Women transfer(Man man){
        Women women = new Women(man.getName(), man.getAge());
        return women;
    }

    public static Man transfer(Women women){
        Man man = new Man(women.getName(), women.getAge());
        return man;
    }

}
