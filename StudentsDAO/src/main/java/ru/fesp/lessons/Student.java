package ru.fesp.lessons;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/**
 * Created by Ôëþð on 30.06.2015.
 */
public class Student {
    private String  name;
    private String  surname;
    private int point;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPoint() {
        return point;
    }

    public Student(String name, String surname, int point) {
        this.name = name;
        this.surname = surname;
        this.point = point;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equal(point, student.point) &&
                Objects.equal(name, student.name) &&
                Objects.equal(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name, surname, point);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("name", name)
                .add("surname", surname)
                .add("point", point)
                .toString();
    }
}
