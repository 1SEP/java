package ru.fsep.lessons.transfer;

import com.google.common.base.Objects;

/**
 * Created by aspire on 26.06.2015.
 */
public class Human {
    private int age;
    private String name;

    public Human(int age, String name) {
        this.name = name;
        if(age >= 0){
            this.age = age;
        }
        else
            throw new IllegalArgumentException("Age is less than zero");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(age, name);
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
        return Objects.equal(this.age, other.age)
                && Objects.equal(this.name, other.name);
    }
}
