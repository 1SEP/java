package ru.fsep.lessons.students;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
/**
 * Created by aspire on 30.06.2015.
 */
public class Student {
    private String name;
    private String surname;
    private int point;

    public Student(String surname, String name, int point) {
        this.surname = surname;
        this.name = name;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPoint() {
        return point;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getSurname(), getName(), getPoint());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        return Objects.equal(this.name, other.name)
                && Objects.equal(this.surname, other.surname)
                && Objects.equal(this.point, other.point);
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
