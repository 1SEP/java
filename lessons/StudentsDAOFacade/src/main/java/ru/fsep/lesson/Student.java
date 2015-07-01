package ru.fsep.lesson;

import com.google.common.base.Objects;

public class Student {

    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getMark() {
        return mark;
    }

    private String lastName;

    private int mark;

    public Student(String firstName, String lastName, int mark){
        this.firstName = firstName;
        this.lastName = lastName;
        this.mark = mark;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(firstName, lastName, mark);
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
        return Objects.equal(this.firstName, other.firstName)
                && Objects.equal(this.lastName, other.lastName)
                && Objects.equal(this.mark, other.mark);
    }
}
