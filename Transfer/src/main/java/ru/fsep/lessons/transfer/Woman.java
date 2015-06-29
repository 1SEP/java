package ru.fsep.lessons.transfer;

import java.util.Objects;

/**
 * Created by Надежда on 26.06.2015.
 */
public class Woman extends Human {
       public Woman(int age, String name) {
        super(age, name);
    }

    @Override
    public String toString()  {
        return super.toString();
    }

    @Override
    public Man trans()
    {
        return new Man(this.getAge(),this.getName());
    }
}
