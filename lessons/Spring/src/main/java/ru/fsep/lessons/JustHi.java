package ru.fsep.lessons;

/**
 * Created by aspire on 03.07.2015.
 */
public class JustHi  implements Hi {
    private String s;
    private String who;

    public JustHi(String s) {
        this.s = s;
    }

    public void sayHello() {

    }

    public String getWho() {
        return who;
    }
}
