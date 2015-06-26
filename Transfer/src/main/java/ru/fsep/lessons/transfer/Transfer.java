package ru.fsep.lessons.transfer;

/**
 * Created by Надежда on 26.06.2015.
 */
public class Transfer {

    @Override
    public String toString() {
        return super.toString();
    }

    public Man transfer( Woman girl)
    {
        return new Man(girl.getAge(),girl.getName());
    }

    public Woman transfer (Man boy){
        return new Woman(boy.getAge(),boy.getName());
    }
}
