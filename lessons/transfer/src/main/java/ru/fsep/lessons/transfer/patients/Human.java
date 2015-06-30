package ru.fsep.lessons.transfer.patients;

import com.google.common.base.Objects;
import ru.fsep.lessons.transfer.clinic.Transable;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Human implements Transable {
    public static final int MIN_SIZE_OF_AGE = 0;
    public static final int MIN_SIZE_OF_NAME = 2;
    private int age;
    private String name;

    public Human(int age, String name){
        if(age > MIN_SIZE_OF_AGE){
            this.age = age;
        }
        else {throw  new IllegalArgumentException("Age can't be less than 1");}
        if(name.length() >= MIN_SIZE_OF_NAME){
            this.name = name;
        }
        else{throw new IllegalArgumentException("Name can't be less than 2");}
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Human trans() {
        throw new NotImplementedException();
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