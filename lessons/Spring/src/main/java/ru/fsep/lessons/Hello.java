package ru.fsep.lessons;

public class Hello implements Hi {
    private String s;
    private String who;

    public Hello(String s, String who) {
        this.s = s;
        this.who = who;
    }

    public void sayHello() {
        System.out.println(s);
    }

    public String getWho() {
        return who;
    }



}
