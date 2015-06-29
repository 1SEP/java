package ru.fsep.lesson.humans;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import ru.fsep.lesson.Transeble;

public class Human implements Transeble{

    public static final int MIN_AGE = 18;
    final private int MAX_LONG_NAME = 15;

    protected String name;

    protected int age;

    public Human(String name, int age) {
        if (name.length() < MAX_LONG_NAME && age >= MIN_AGE){
            this.name = name;
            this.age = age;
        }

        if (name.length() >= MAX_LONG_NAME){
            throw new IllegalArgumentException("Long of name more max value");
        }

        if (age < MIN_AGE){
            throw new IllegalArgumentException("Age is less min value");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name, age);
    }

    @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            final Human other = (Human) obj;
            return Objects.equal(this.name, other.name)
                    && Objects.equal(this.age, other.age);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("My name", name)
                .add("My age", age)
                .toString();
    }

    public Human trans() {
        return null;
    }
}
