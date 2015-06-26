package ru.fsep.lesson;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

public class Human {

    final private int MAX_LONG_NAME = 15;

    protected String name;

    protected int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < MAX_LONG_NAME) {
            this.name = name;
        } else {
            System.out.println("Error");
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
}
