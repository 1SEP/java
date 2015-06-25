package ru.kpfu.npp.lessons.tools;

/**
 * Created by Флюр on 06.12.2014.
 */
public class HumanImpl implements Human {
    private String name;
    private int age;

    public HumanImpl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
