package ru.fsep.lessons;

/**
 * Created by Надежда on 30.06.2015.
 */
public class Students {
    public static final int MIN_MARK = 0;
    private String name;
    private String secondName;
    private int mark;

    public Students(String name, String secondName, int mark) {
        this.name = name;
        this.secondName = secondName;
        if (mark >= MIN_MARK) {
            this.mark = mark;
        }
        else
            throw new IllegalArgumentException("Age is less than zero");
    }

    public int getMark() {
        return mark;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Students students = (Students) o;

        if (mark != students.mark) return false;
        if (name != null ? !name.equals(students.name) : students.name != null) return false;
        return !(secondName != null ? !secondName.equals(students.secondName) : students.secondName != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + mark;
        return result;
    }
}
